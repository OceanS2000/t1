# This file was generated by nvfetcher, please do not modify it manually.
{ fetchgit, fetchurl, fetchFromGitHub, dockerTools }:
{
  arithmetic = {
    pname = "arithmetic";
    version = "4a81e23e1794844b36c53385d343475d4d7eca49";
    src = fetchFromGitHub {
      owner = "sequencer";
      repo = "arithmetic";
      rev = "4a81e23e1794844b36c53385d343475d4d7eca49";
      fetchSubmodules = false;
      sha256 = "sha256-tQwzECNOXhuKzpwRD+iKSEJYl1/wlhMQTJULJSCdTrY=";
    };
    date = "2024-01-23";
  };
  berkeley-hardfloat = {
    pname = "berkeley-hardfloat";
    version = "26f00d00c3f3f57480065e02bfcfde3d3b41ec51";
    src = fetchFromGitHub {
      owner = "ucb-bar";
      repo = "berkeley-hardfloat";
      rev = "26f00d00c3f3f57480065e02bfcfde3d3b41ec51";
      fetchSubmodules = false;
      sha256 = "sha256-gA1Ol7xnzC+10lGwK9+ftfJcMhKsC0KhjENQvUg3u88=";
    };
    date = "2024-06-05";
  };
  chisel = {
    pname = "chisel";
    version = "e6df4cf02fb68191ea76387f046dc63f7cef9820";
    src = fetchFromGitHub {
      owner = "chipsalliance";
      repo = "chisel";
      rev = "e6df4cf02fb68191ea76387f046dc63f7cef9820";
      fetchSubmodules = false;
      sha256 = "sha256-l4hNHDwWYnTC1T8yH58UIFVKszdDOmstK5ljk0R1nhg=";
    };
    date = "2024-08-06";
  };
  chisel-interface = {
    pname = "chisel-interface";
    version = "79703e44fb6010a535e6750249f6be0471fa0046";
    src = fetchFromGitHub {
      owner = "chipsalliance";
      repo = "chisel-interface";
      rev = "79703e44fb6010a535e6750249f6be0471fa0046";
      fetchSubmodules = false;
      sha256 = "sha256-1VTN2OfsauJvf+JM/j0uhvixD0+aCnyGOoO74YrCFPA=";
    };
    date = "2024-06-17";
  };
  riscv-opcodes = {
    pname = "riscv-opcodes";
    version = "07b21cc5143a15959eda12e30aa40cea0971efe0";
    src = fetchFromGitHub {
      owner = "riscv";
      repo = "riscv-opcodes";
      rev = "07b21cc5143a15959eda12e30aa40cea0971efe0";
      fetchSubmodules = false;
      sha256 = "sha256-B9njfBxZfm7xkSKBD8JOUWIKEzL8ra/X9FKC3CJ2gK8=";
    };
    date = "2024-07-24";
  };
  rvdecoderdb = {
    pname = "rvdecoderdb";
    version = "6f22826d2c8facb6bf0b41f4bea26a2225751220";
    src = fetchFromGitHub {
      owner = "sequencer";
      repo = "rvdecoderdb";
      rev = "6f22826d2c8facb6bf0b41f4bea26a2225751220";
      fetchSubmodules = false;
      sha256 = "sha256-4Hwa2Z4mmALy4ZElWzxFgqC+7EsyBhahVYlVUzyYKF4=";
    };
    date = "2024-07-25";
  };
}
