// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2022 Jiuyang Liu <liu@jiuyang.me>

package org.chipsalliance.t1.rtl.decoder.attribute

import org.chipsalliance.t1.rtl.decoder.T1DecodePattern

object isSreadvd {
  def apply(t1DecodePattern: T1DecodePattern): isSreadvd =
    Seq(
      y _ -> Y,
      n _ -> N,
      dc _ -> DC
    ).collectFirst {
      case (fn, tri) if fn(t1DecodePattern) => isSreadvd(tri)
    }.get

  def y(t1DecodePattern: T1DecodePattern): Boolean = {
    val allMatched = Seq(
      "vaadd.vv",
      "vaadd.vx",
      "vaaddu.vv",
      "vaaddu.vx",
      "vadc.vim",
      "vadc.vvm",
      "vadc.vxm",
      "vadd.vi",
      "vadd.vv",
      "vadd.vx",
      "vand.vi",
      "vand.vv",
      "vand.vx",
      "vasub.vv",
      "vasub.vx",
      "vasubu.vv",
      "vasubu.vx",
      "vcompress.vm",
      "vdiv.vv",
      "vdiv.vx",
      "vdivu.vv",
      "vdivu.vx",
      "vfadd.vf",
      "vfadd.vv",
      "vfclass.v",
      "vfcvt.f.x.v",
      "vfcvt.f.xu.v",
      "vfcvt.rtz.x.f.v",
      "vfcvt.rtz.xu.f.v",
      "vfcvt.x.f.v",
      "vfcvt.xu.f.v",
      "vfdiv.vf",
      "vfdiv.vv",
      "vfmax.vf",
      "vfmax.vv",
      "vfmerge.vfm",
      "vfmv.v.f",
      "vfmin.vf",
      "vfmin.vv",
      "vfmul.vf",
      "vfmul.vv",
      "vfmv.f.s",
      "vfmv.s.f",
      "vfncvt.f.f.w",
      "vfncvt.f.x.w",
      "vfncvt.f.xu.w",
      "vfncvt.rod.f.f.w",
      "vfncvt.rtz.x.f.w",
      "vfncvt.rtz.xu.f.w",
      "vfncvt.x.f.w",
      "vfncvt.xu.f.w",
      "vfrdiv.vf",
      "vfrec7.v",
      "vfredmax.vs",
      "vfredmin.vs",
      "vfredosum.vs",
      "vfredusum.vs",
      "vfrsqrt7.v",
      "vfrsub.vf",
      "vfsgnj.vf",
      "vfsgnj.vv",
      "vfsgnjn.vf",
      "vfsgnjn.vv",
      "vfsgnjx.vf",
      "vfsgnjx.vv",
      "vfslide1down.vf",
      "vfslide1up.vf",
      "vfsqrt.v",
      "vfsub.vf",
      "vfsub.vv",
      "vfwadd.vf",
      "vfwadd.vv",
      "vfwadd.wf",
      "vfwadd.wv",
      "vfwcvt.f.f.v",
      "vfwcvt.f.x.v",
      "vfwcvt.f.xu.v",
      "vfwcvt.rtz.x.f.v",
      "vfwcvt.rtz.xu.f.v",
      "vfwcvt.x.f.v",
      "vfwcvt.xu.f.v",
      "vfwmacc.vf",
      "vfwmacc.vv",
      "vfwmsac.vf",
      "vfwmsac.vv",
      "vfwmul.vf",
      "vfwmul.vv",
      "vfwnmacc.vf",
      "vfwnmacc.vv",
      "vfwnmsac.vf",
      "vfwnmsac.vv",
      "vfwredosum.vs",
      "vfwredusum.vs",
      "vfwsub.vf",
      "vfwsub.vv",
      "vfwsub.wf",
      "vfwsub.wv",
      "vid.v",
      "vmadc.vi",
      "vmadc.vim",
      "vmadc.vv",
      "vmadc.vvm",
      "vmadc.vx",
      "vmadc.vxm",
      "vmax.vv",
      "vmax.vx",
      "vmaxu.vv",
      "vmaxu.vx",
      "vmerge.vim",
      "vmv.v.i",
      "vmerge.vvm",
      "vmv.v.v",
      "vmerge.vxm",
      "vmv.v.x",
      "vmfeq.vf",
      "vmfeq.vv",
      "vmfge.vf",
      "vmfgt.vf",
      "vmfle.vf",
      "vmfle.vv",
      "vmflt.vf",
      "vmflt.vv",
      "vmfne.vf",
      "vmfne.vv",
      "vmin.vv",
      "vmin.vx",
      "vminu.vv",
      "vminu.vx",
      "vmsbc.vv",
      "vmsbc.vvm",
      "vmsbc.vx",
      "vmsbc.vxm",
      "vmseq.vi",
      "vmseq.vv",
      "vmseq.vx",
      "vmsgt.vi",
      "vmsgt.vx",
      "vmsgtu.vi",
      "vmsgtu.vx",
      "vmsle.vi",
      "vmsle.vv",
      "vmsle.vx",
      "vmsleu.vi",
      "vmsleu.vv",
      "vmsleu.vx",
      "vmslt.vv",
      "vmslt.vx",
      "vmsltu.vv",
      "vmsltu.vx",
      "vmsne.vi",
      "vmsne.vv",
      "vmsne.vx",
      "vmul.vv",
      "vmul.vx",
      "vmulh.vv",
      "vmulh.vx",
      "vmulhsu.vv",
      "vmulhsu.vx",
      "vmulhu.vv",
      "vmulhu.vx",
      "vmv.s.x",
      "vmv.x.s",
      "vmv1r.v",
      "vmv2r.v",
      "vmv4r.v",
      "vmv8r.v",
      "vnclip.wi",
      "vnclip.wv",
      "vnclip.wx",
      "vnclipu.wi",
      "vnclipu.wv",
      "vnclipu.wx",
      "vnsra.wi",
      "vnsra.wv",
      "vnsra.wx",
      "vnsrl.wi",
      "vnsrl.wv",
      "vnsrl.wx",
      "vor.vi",
      "vor.vv",
      "vor.vx",
      "vredand.vs",
      "vredmax.vs",
      "vredmaxu.vs",
      "vredmin.vs",
      "vredminu.vs",
      "vredor.vs",
      "vredsum.vs",
      "vredxor.vs",
      "vrem.vv",
      "vrem.vx",
      "vremu.vv",
      "vremu.vx",
      "vrgather.vi",
      "vrgather.vv",
      "vrgather.vx",
      "vrgatherei16.vv",
      "vrsub.vi",
      "vrsub.vx",
      "vsadd.vi",
      "vsadd.vv",
      "vsadd.vx",
      "vsaddu.vi",
      "vsaddu.vv",
      "vsaddu.vx",
      "vsbc.vvm",
      "vsbc.vxm",
      "vsext.vf2",
      "vsext.vf4",
      "vsext.vf8",
      "vslide1down.vx",
      "vslide1up.vx",
      "vslidedown.vi",
      "vslidedown.vx",
      "vslideup.vi",
      "vslideup.vx",
      "vsll.vi",
      "vsll.vv",
      "vsll.vx",
      "vsmul.vv",
      "vsmul.vx",
      "vsra.vi",
      "vsra.vv",
      "vsra.vx",
      "vsrl.vi",
      "vsrl.vv",
      "vsrl.vx",
      "vssra.vi",
      "vssra.vv",
      "vssra.vx",
      "vssrl.vi",
      "vssrl.vv",
      "vssrl.vx",
      "vssub.vv",
      "vssub.vx",
      "vssubu.vv",
      "vssubu.vx",
      "vsub.vv",
      "vsub.vx",
      "vwadd.vv",
      "vwadd.vx",
      "vwadd.wv",
      "vwadd.wx",
      "vwaddu.vv",
      "vwaddu.vx",
      "vwaddu.wv",
      "vwaddu.wx",
      "vwmacc.vv",
      "vwmacc.vx",
      "vwmaccsu.vv",
      "vwmaccsu.vx",
      "vwmaccu.vv",
      "vwmaccu.vx",
      "vwmaccus.vx",
      "vwmul.vv",
      "vwmul.vx",
      "vwmulsu.vv",
      "vwmulsu.vx",
      "vwmulu.vv",
      "vwmulu.vx",
      "vwredsum.vs",
      "vwredsumu.vs",
      "vwsub.vv",
      "vwsub.vx",
      "vwsub.wv",
      "vwsub.wx",
      "vwsubu.vv",
      "vwsubu.vx",
      "vwsubu.wv",
      "vwsubu.wx",
      "vxor.vi",
      "vxor.vv",
      "vxor.vx",
      "vzext.vf2",
      "vzext.vf4",
      "vzext.vf8",
    )
    allMatched.contains(t1DecodePattern.instruction.name)
  }
  def n(t1DecodePattern: T1DecodePattern): Boolean = {
    val allMatched = t1DecodePattern.param.allInstructions.filter(i =>
      !(y(t1DecodePattern) || dc(t1DecodePattern))
    )
    allMatched.contains(t1DecodePattern.instruction)
  }

  def dc(t1DecodePattern: T1DecodePattern): Boolean = false
}

case class isSreadvd(value: TriState) extends BooleanDecodeAttribute {
  override val description: String = "sReadVD -> !(ma || maskLogic) instruction need to read vd as operator. "
}
