//! utility functions

pub fn write_perf_json(cycle: u64, success: bool) {
  let mut content = String::new();
  content += "{\n";
  content += &format!("    \"total_cycles\": {cycle},\n");
  content += &format!("    \"success\": {success}\n");
  content += "}\n";

  match std::fs::write("perf.json", &content) {
    Ok(()) => {}
    Err(e) => {
      tracing::error!("failed to write 'perf.json': {e}");
    }
  }
}
