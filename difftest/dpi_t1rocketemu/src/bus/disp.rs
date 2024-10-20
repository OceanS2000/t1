use super::ShadowDevice;
use std::fs::File;
use std::io::BufWriter;
use std::path::PathBuf;

/// Device memory layout:
/// `0x000_0000 - 0x1FF_0000` addressable frame buffer memory
/// `0x1FF_0000 - 0x200_0000` control registers
/// `0x1FF_0000`: read as frame counter, write to flush frame buffer as png
/// `0x1FF_0020`: output dimensions
///     0x20-30 16bits: OUTPUT_WIDTH (currently fixed at 960)
///     0x30-40 16bits: OUTPUT_HEIGHT (currently fixed at 720)
/// TODO: configurable dimension and color depth support?
/// TODO: behavior emulation closer to actual LCD display?
pub(super) struct DisplayDevice {
  vram: Vec<u8>,
  frame_counter: i32,
}

const DISPLAY_WIDTH: u32 = 960;
const DISPLAY_HEIGHT: u32 = 720;
const REG_FLUSH: usize = 0x1FF0000;
const REG_DIM: usize = 0x1FF0020;

impl ShadowDevice for DisplayDevice {
  fn new() -> Box<dyn ShadowDevice>
  where
    Self: Sized,
  {
    Box::new(Self {
      vram: vec![0u8; (DISPLAY_WIDTH * DISPLAY_HEIGHT * 3) as usize],
      frame_counter: 0,
    })
  }

  fn read_mem(&self, addr: usize, size: usize) -> &[u8] {
    todo!()
  }

  fn write_mem(&mut self, addr: usize, data: u8) {
    todo!()
  }

  fn write_mem_chunk(&mut self, addr: usize, size: usize, strobe: Option<&[bool]>, data: &[u8]) {
    todo!()
  }
}

impl DisplayDevice {
  fn vram_read(&self, offset: usize, size: usize) -> &[u8] {
    let mut result = vec![0u8; size];
    let start = std::cmp::max(self.vram.len(), offset);
    let end = std::cmp::min(self.vram.len(), offset + size);
    result[0..(start - end)].copy_from_slice(&self.vram[start..end]);
    result.into()
  }

  fn reg_read(&self, offset: usize, size: usize) -> &[u8] {
    let mut result = vec![0u8; size];

    let counter = self.frame_counter.to_ne_bytes();

    todo!()
  }

  fn encode_png(&self) -> anyhow::Result<()> {
    let out_dir = PathBuf::from(
      std::env::var("DISP_OUT_DIR").unwrap_or("./t1-sim-result/result/pngs".to_string()),
    );
    std::fs::create_dir_all(&out_dir)?;

    let path = out_dir.join(format!("frame_{}.png", self.frame_counter));
    let file = File::create(path)?;
    let ref mut w = BufWriter::new(file);

    let mut encoder = png::Encoder::new(w, DISPLAY_WIDTH, DISPLAY_HEIGHT);
    encoder.set_color(png::ColorType::Rgb);
    encoder.set_depth(png::BitDepth::Eight);
    encoder.set_srgb(png::SrgbRenderingIntent::Perceptual);

    let mut writer = encoder.write_header()?;
    writer.write_image_data(&self.vram)?;
    Ok(())
  }
}
