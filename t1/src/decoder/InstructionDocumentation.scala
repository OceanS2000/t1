// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2022 Jiuyang Liu <liu@jiuyang.me>

package org.chipsalliance.t1.rtl.decoder

import org.chipsalliance.rvdecoderdb.Instruction

/** Generate documentation for each instructions for T1.
  * The documentation should contain the behavior for instruction in a specific configuration in T1.
  * @todo should it be a post process at omreader?
  */
case class InstructionDocumentation(instruction: Instruction, param: DecoderParam) {
  override def toString: String = instruction.name match {
    case "vaadd.vv" => "TODO!"
    case "vaadd.vx" => "TODO!"
    case "vaaddu.vv" => "TODO!"
    case "vaaddu.vx" => "TODO!"
    case "vadc.vim" => "TODO!"
    case "vadc.vvm" => "TODO!"
    case "vadc.vxm" => "TODO!"
    case "vadd.vi" => "TODO!"
    case "vadd.vv" => "TODO!"
    case "vadd.vx" => "TODO!"
    case "vand.vi" => "TODO!"
    case "vand.vv" => "TODO!"
    case "vand.vx" => "TODO!"
    case "vasub.vv" => "TODO!"
    case "vasub.vx" => "TODO!"
    case "vasubu.vv" => "TODO!"
    case "vasubu.vx" => "TODO!"
    case "vcompress.vm" => "TODO!"
    case "vcpop.m" => "TODO!"
    case "vdiv.vv" => "TODO!"
    case "vdiv.vx" => "TODO!"
    case "vdivu.vv" => "TODO!"
    case "vdivu.vx" => "TODO!"
    case "vfadd.vf" => "TODO!"
    case "vfadd.vv" => "TODO!"
    case "vfclass.v" => "TODO!"
    case "vfcvt.f.x.v" => "TODO!"
    case "vfcvt.f.xu.v" => "TODO!"
    case "vfcvt.rtz.x.f.v" => "TODO!"
    case "vfcvt.rtz.xu.f.v" => "TODO!"
    case "vfcvt.x.f.v" => "TODO!"
    case "vfcvt.xu.f.v" => "TODO!"
    case "vfdiv.vf" => "TODO!"
    case "vfdiv.vv" => "TODO!"
    case "vfirst.m" => "TODO!"
    case "vfmacc.vf" => "TODO!"
    case "vfmacc.vv" => "TODO!"
    case "vfmadd.vf" => "TODO!"
    case "vfmadd.vv" => "TODO!"
    case "vfmax.vf" => "TODO!"
    case "vfmax.vv" => "TODO!"
    case "vfmerge.vfm" => "TODO!"
    case "vfmin.vf" => "TODO!"
    case "vfmin.vv" => "TODO!"
    case "vfmsac.vf" => "TODO!"
    case "vfmsac.vv" => "TODO!"
    case "vfmsub.vf" => "TODO!"
    case "vfmsub.vv" => "TODO!"
    case "vfmul.vf" => "TODO!"
    case "vfmul.vv" => "TODO!"
    case "vfmv.f.s" => "TODO!"
    case "vfmv.s.f" => "TODO!"
    case "vfmv.v.f" => "TODO!"
    case "vfncvt.f.f.w" => "TODO!"
    case "vfncvt.f.x.w" => "TODO!"
    case "vfncvt.f.xu.w" => "TODO!"
    case "vfncvt.rod.f.f.w" => "TODO!"
    case "vfncvt.rtz.x.f.w" => "TODO!"
    case "vfncvt.rtz.xu.f.w" => "TODO!"
    case "vfncvt.x.f.w" => "TODO!"
    case "vfncvt.xu.f.w" => "TODO!"
    case "vfnmacc.vf" => "TODO!"
    case "vfnmacc.vv" => "TODO!"
    case "vfnmadd.vf" => "TODO!"
    case "vfnmadd.vv" => "TODO!"
    case "vfnmsac.vf" => "TODO!"
    case "vfnmsac.vv" => "TODO!"
    case "vfnmsub.vf" => "TODO!"
    case "vfnmsub.vv" => "TODO!"
    case "vfrdiv.vf" => "TODO!"
    case "vfrec7.v" => "TODO!"
    case "vfredmax.vs" => "TODO!"
    case "vfredmin.vs" => "TODO!"
    case "vfredosum.vs" => "TODO!"
    case "vfredusum.vs" => "TODO!"
    case "vfrsqrt7.v" => "TODO!"
    case "vfrsub.vf" => "TODO!"
    case "vfsgnj.vf" => "TODO!"
    case "vfsgnj.vv" => "TODO!"
    case "vfsgnjn.vf" => "TODO!"
    case "vfsgnjn.vv" => "TODO!"
    case "vfsgnjx.vf" => "TODO!"
    case "vfsgnjx.vv" => "TODO!"
    case "vfslide1down.vf" => "TODO!"
    case "vfslide1up.vf" => "TODO!"
    case "vfsqrt.v" => "TODO!"
    case "vfsub.vf" => "TODO!"
    case "vfsub.vv" => "TODO!"
    case "vfwadd.vf" => "TODO!"
    case "vfwadd.vv" => "TODO!"
    case "vfwadd.wf" => "TODO!"
    case "vfwadd.wv" => "TODO!"
    case "vfwcvt.f.f.v" => "TODO!"
    case "vfwcvt.f.x.v" => "TODO!"
    case "vfwcvt.f.xu.v" => "TODO!"
    case "vfwcvt.rtz.x.f.v" => "TODO!"
    case "vfwcvt.rtz.xu.f.v" => "TODO!"
    case "vfwcvt.x.f.v" => "TODO!"
    case "vfwcvt.xu.f.v" => "TODO!"
    case "vfwmacc.vf" => "TODO!"
    case "vfwmacc.vv" => "TODO!"
    case "vfwmsac.vf" => "TODO!"
    case "vfwmsac.vv" => "TODO!"
    case "vfwmul.vf" => "TODO!"
    case "vfwmul.vv" => "TODO!"
    case "vfwnmacc.vf" => "TODO!"
    case "vfwnmacc.vv" => "TODO!"
    case "vfwnmsac.vf" => "TODO!"
    case "vfwnmsac.vv" => "TODO!"
    case "vfwredosum.vs" => "TODO!"
    case "vfwredusum.vs" => "TODO!"
    case "vfwsub.vf" => "TODO!"
    case "vfwsub.vv" => "TODO!"
    case "vfwsub.wf" => "TODO!"
    case "vfwsub.wv" => "TODO!"
    case "vid.v" => "TODO!"
    case "viota.m" => "TODO!"
    case "vl1re16.v" => "TODO!"
    case "vl1re32.v" => "TODO!"
    case "vl1re64.v" => "TODO!"
    case "vl1re8.v" => "TODO!"
    case "vl2re16.v" => "TODO!"
    case "vl2re32.v" => "TODO!"
    case "vl2re64.v" => "TODO!"
    case "vl2re8.v" => "TODO!"
    case "vl4re16.v" => "TODO!"
    case "vl4re32.v" => "TODO!"
    case "vl4re64.v" => "TODO!"
    case "vl4re8.v" => "TODO!"
    case "vl8re16.v" => "TODO!"
    case "vl8re32.v" => "TODO!"
    case "vl8re64.v" => "TODO!"
    case "vl8re8.v" => "TODO!"
    case "vle1024.v" => "TODO!"
    case "vle1024ff.v" => "TODO!"
    case "vle128.v" => "TODO!"
    case "vle128ff.v" => "TODO!"
    case "vle16.v" => "TODO!"
    case "vle16ff.v" => "TODO!"
    case "vle256.v" => "TODO!"
    case "vle256ff.v" => "TODO!"
    case "vle32.v" => "TODO!"
    case "vle32ff.v" => "TODO!"
    case "vle512.v" => "TODO!"
    case "vle512ff.v" => "TODO!"
    case "vle64.v" => "TODO!"
    case "vle64ff.v" => "TODO!"
    case "vle8.v" => "TODO!"
    case "vle8ff.v" => "TODO!"
    case "vlm.v" => "TODO!"
    case "vloxei1024.v" => "TODO!"
    case "vloxei128.v" => "TODO!"
    case "vloxei16.v" => "TODO!"
    case "vloxei256.v" => "TODO!"
    case "vloxei32.v" => "TODO!"
    case "vloxei512.v" => "TODO!"
    case "vloxei64.v" => "TODO!"
    case "vloxei8.v" => "TODO!"
    case "vlse1024.v" => "TODO!"
    case "vlse128.v" => "TODO!"
    case "vlse16.v" => "TODO!"
    case "vlse256.v" => "TODO!"
    case "vlse32.v" => "TODO!"
    case "vlse512.v" => "TODO!"
    case "vlse64.v" => "TODO!"
    case "vlse8.v" => "TODO!"
    case "vluxei1024.v" => "TODO!"
    case "vluxei128.v" => "TODO!"
    case "vluxei16.v" => "TODO!"
    case "vluxei256.v" => "TODO!"
    case "vluxei32.v" => "TODO!"
    case "vluxei512.v" => "TODO!"
    case "vluxei64.v" => "TODO!"
    case "vluxei8.v" => "TODO!"
    case "vmacc.vv" => "TODO!"
    case "vmacc.vx" => "TODO!"
    case "vmadc.vi" => "TODO!"
    case "vmadc.vim" => "TODO!"
    case "vmadc.vv" => "TODO!"
    case "vmadc.vvm" => "TODO!"
    case "vmadc.vx" => "TODO!"
    case "vmadc.vxm" => "TODO!"
    case "vmadd.vv" => "TODO!"
    case "vmadd.vx" => "TODO!"
    case "vmand.mm" => "TODO!"
    case "vmandn.mm" => "TODO!"
    case "vmax.vv" => "TODO!"
    case "vmax.vx" => "TODO!"
    case "vmaxu.vv" => "TODO!"
    case "vmaxu.vx" => "TODO!"
    case "vmerge.vim" => "TODO!"
    case "vmerge.vvm" => "TODO!"
    case "vmerge.vxm" => "TODO!"
    case "vmfeq.vf" => "TODO!"
    case "vmfeq.vv" => "TODO!"
    case "vmfge.vf" => "TODO!"
    case "vmfgt.vf" => "TODO!"
    case "vmfle.vf" => "TODO!"
    case "vmfle.vv" => "TODO!"
    case "vmflt.vf" => "TODO!"
    case "vmflt.vv" => "TODO!"
    case "vmfne.vf" => "TODO!"
    case "vmfne.vv" => "TODO!"
    case "vmin.vv" => "TODO!"
    case "vmin.vx" => "TODO!"
    case "vminu.vv" => "TODO!"
    case "vminu.vx" => "TODO!"
    case "vmnand.mm" => "TODO!"
    case "vmnor.mm" => "TODO!"
    case "vmor.mm" => "TODO!"
    case "vmorn.mm" => "TODO!"
    case "vmsbc.vv" => "TODO!"
    case "vmsbc.vvm" => "TODO!"
    case "vmsbc.vx" => "TODO!"
    case "vmsbc.vxm" => "TODO!"
    case "vmsbf.m" => "TODO!"
    case "vmseq.vi" => "TODO!"
    case "vmseq.vv" => "TODO!"
    case "vmseq.vx" => "TODO!"
    case "vmsgt.vi" => "TODO!"
    case "vmsgt.vx" => "TODO!"
    case "vmsgtu.vi" => "TODO!"
    case "vmsgtu.vx" => "TODO!"
    case "vmsif.m" => "TODO!"
    case "vmsle.vi" => "TODO!"
    case "vmsle.vv" => "TODO!"
    case "vmsle.vx" => "TODO!"
    case "vmsleu.vi" => "TODO!"
    case "vmsleu.vv" => "TODO!"
    case "vmsleu.vx" => "TODO!"
    case "vmslt.vv" => "TODO!"
    case "vmslt.vx" => "TODO!"
    case "vmsltu.vv" => "TODO!"
    case "vmsltu.vx" => "TODO!"
    case "vmsne.vi" => "TODO!"
    case "vmsne.vv" => "TODO!"
    case "vmsne.vx" => "TODO!"
    case "vmsof.m" => "TODO!"
    case "vmul.vv" => "TODO!"
    case "vmul.vx" => "TODO!"
    case "vmulh.vv" => "TODO!"
    case "vmulh.vx" => "TODO!"
    case "vmulhsu.vv" => "TODO!"
    case "vmulhsu.vx" => "TODO!"
    case "vmulhu.vv" => "TODO!"
    case "vmulhu.vx" => "TODO!"
    case "vmv.s.x" => "TODO!"
    case "vmv.v.i" => "TODO!"
    case "vmv.v.v" => "TODO!"
    case "vmv.v.x" => "TODO!"
    case "vmv.x.s" => "TODO!"
    case "vmv1r.v" => "TODO!"
    case "vmv2r.v" => "TODO!"
    case "vmv4r.v" => "TODO!"
    case "vmv8r.v" => "TODO!"
    case "vmxnor.mm" => "TODO!"
    case "vmxor.mm" => "TODO!"
    case "vnclip.wi" => "TODO!"
    case "vnclip.wv" => "TODO!"
    case "vnclip.wx" => "TODO!"
    case "vnclipu.wi" => "TODO!"
    case "vnclipu.wv" => "TODO!"
    case "vnclipu.wx" => "TODO!"
    case "vnmsac.vv" => "TODO!"
    case "vnmsac.vx" => "TODO!"
    case "vnmsub.vv" => "TODO!"
    case "vnmsub.vx" => "TODO!"
    case "vnsra.wi" => "TODO!"
    case "vnsra.wv" => "TODO!"
    case "vnsra.wx" => "TODO!"
    case "vnsrl.wi" => "TODO!"
    case "vnsrl.wv" => "TODO!"
    case "vnsrl.wx" => "TODO!"
    case "vor.vi" => "TODO!"
    case "vor.vv" => "TODO!"
    case "vor.vx" => "TODO!"
    case "vredand.vs" => "TODO!"
    case "vredmax.vs" => "TODO!"
    case "vredmaxu.vs" => "TODO!"
    case "vredmin.vs" => "TODO!"
    case "vredminu.vs" => "TODO!"
    case "vredor.vs" => "TODO!"
    case "vredsum.vs" => "TODO!"
    case "vredxor.vs" => "TODO!"
    case "vrem.vv" => "TODO!"
    case "vrem.vx" => "TODO!"
    case "vremu.vv" => "TODO!"
    case "vremu.vx" => "TODO!"
    case "vrgather.vi" => "TODO!"
    case "vrgather.vv" => "TODO!"
    case "vrgather.vx" => "TODO!"
    case "vrgatherei16.vv" => "TODO!"
    case "vrsub.vi" => "TODO!"
    case "vrsub.vx" => "TODO!"
    case "vs1r.v" => "TODO!"
    case "vs2r.v" => "TODO!"
    case "vs4r.v" => "TODO!"
    case "vs8r.v" => "TODO!"
    case "vsadd.vi" => "TODO!"
    case "vsadd.vv" => "TODO!"
    case "vsadd.vx" => "TODO!"
    case "vsaddu.vi" => "TODO!"
    case "vsaddu.vv" => "TODO!"
    case "vsaddu.vx" => "TODO!"
    case "vsbc.vvm" => "TODO!"
    case "vsbc.vxm" => "TODO!"
    case "vse1024.v" => "TODO!"
    case "vse128.v" => "TODO!"
    case "vse16.v" => "TODO!"
    case "vse256.v" => "TODO!"
    case "vse32.v" => "TODO!"
    case "vse512.v" => "TODO!"
    case "vse64.v" => "TODO!"
    case "vse8.v" => "TODO!"
    case "vsetivli" => "TODO!"
    case "vsetvl" => "TODO!"
    case "vsetvli" => "TODO!"
    case "vsext.vf2" => "TODO!"
    case "vsext.vf4" => "TODO!"
    case "vsext.vf8" => "TODO!"
    case "vslide1down.vx" => "TODO!"
    case "vslide1up.vx" => "TODO!"
    case "vslidedown.vi" => "TODO!"
    case "vslidedown.vx" => "TODO!"
    case "vslideup.vi" => "TODO!"
    case "vslideup.vx" => "TODO!"
    case "vsll.vi" => "TODO!"
    case "vsll.vv" => "TODO!"
    case "vsll.vx" => "TODO!"
    case "vsm.v" => "TODO!"
    case "vsmul.vv" => "TODO!"
    case "vsmul.vx" => "TODO!"
    case "vsoxei1024.v" => "TODO!"
    case "vsoxei128.v" => "TODO!"
    case "vsoxei16.v" => "TODO!"
    case "vsoxei256.v" => "TODO!"
    case "vsoxei32.v" => "TODO!"
    case "vsoxei512.v" => "TODO!"
    case "vsoxei64.v" => "TODO!"
    case "vsoxei8.v" => "TODO!"
    case "vsra.vi" => "TODO!"
    case "vsra.vv" => "TODO!"
    case "vsra.vx" => "TODO!"
    case "vsrl.vi" => "TODO!"
    case "vsrl.vv" => "TODO!"
    case "vsrl.vx" => "TODO!"
    case "vsse1024.v" => "TODO!"
    case "vsse128.v" => "TODO!"
    case "vsse16.v" => "TODO!"
    case "vsse256.v" => "TODO!"
    case "vsse32.v" => "TODO!"
    case "vsse512.v" => "TODO!"
    case "vsse64.v" => "TODO!"
    case "vsse8.v" => "TODO!"
    case "vssra.vi" => "TODO!"
    case "vssra.vv" => "TODO!"
    case "vssra.vx" => "TODO!"
    case "vssrl.vi" => "TODO!"
    case "vssrl.vv" => "TODO!"
    case "vssrl.vx" => "TODO!"
    case "vssub.vv" => "TODO!"
    case "vssub.vx" => "TODO!"
    case "vssubu.vv" => "TODO!"
    case "vssubu.vx" => "TODO!"
    case "vsub.vv" => "TODO!"
    case "vsub.vx" => "TODO!"
    case "vsuxei1024.v" => "TODO!"
    case "vsuxei128.v" => "TODO!"
    case "vsuxei16.v" => "TODO!"
    case "vsuxei256.v" => "TODO!"
    case "vsuxei32.v" => "TODO!"
    case "vsuxei512.v" => "TODO!"
    case "vsuxei64.v" => "TODO!"
    case "vsuxei8.v" => "TODO!"
    case "vwadd.vv" => "TODO!"
    case "vwadd.vx" => "TODO!"
    case "vwadd.wv" => "TODO!"
    case "vwadd.wx" => "TODO!"
    case "vwaddu.vv" => "TODO!"
    case "vwaddu.vx" => "TODO!"
    case "vwaddu.wv" => "TODO!"
    case "vwaddu.wx" => "TODO!"
    case "vwmacc.vv" => "TODO!"
    case "vwmacc.vx" => "TODO!"
    case "vwmaccsu.vv" => "TODO!"
    case "vwmaccsu.vx" => "TODO!"
    case "vwmaccu.vv" => "TODO!"
    case "vwmaccu.vx" => "TODO!"
    case "vwmaccus.vx" => "TODO!"
    case "vwmul.vv" => "TODO!"
    case "vwmul.vx" => "TODO!"
    case "vwmulsu.vv" => "TODO!"
    case "vwmulsu.vx" => "TODO!"
    case "vwmulu.vv" => "TODO!"
    case "vwmulu.vx" => "TODO!"
    case "vwredsum.vs" => "TODO!"
    case "vwredsumu.vs" => "TODO!"
    case "vwsub.vv" => "TODO!"
    case "vwsub.vx" => "TODO!"
    case "vwsub.wv" => "TODO!"
    case "vwsub.wx" => "TODO!"
    case "vwsubu.vv" => "TODO!"
    case "vwsubu.vx" => "TODO!"
    case "vwsubu.wv" => "TODO!"
    case "vwsubu.wx" => "TODO!"
    case "vxor.vi" => "TODO!"
    case "vxor.vv" => "TODO!"
    case "vxor.vx" => "TODO!"
    case "vzext.vf2" => "TODO!"
    case "vzext.vf4" => "TODO!"
    case "vzext.vf8" => "TODO!"
  }
}
