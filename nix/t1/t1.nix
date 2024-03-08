{ lib
, stdenv
, fetchMillDeps
, makeWrapper
, jdk21

  # chisel deps
, mill
, espresso
, circt-full
, jextract
, strip-nondeterminism

, submodules
}:

let
  self = stdenv.mkDerivation rec {
    name = "t1";

    src = with lib.fileset; toSource {
      root = ./../..;
      fileset = unions [
        ./../../build.sc
        ./../../common.sc
        ./../../t1
        ./../../subsystem
        ./../../rocket
        ./../../emuhelper
        ./../../ipemu/src
        ./../../elaborator
        ./../../configgen
      ];
    };

    passthru.millDeps = fetchMillDeps {
      inherit name;
      src = with lib.fileset; toSource {
        root = ./../..;
        fileset = unions [
          ./../../build.sc
          ./../../common.sc
        ];
      };
      millDepsHash = "sha256-Ri0aB4SxBdwuNOnBvvsTwVdAnvtiKIW5EMrulDX4sVo=";
      nativeBuildInputs = [ submodules.setupHook ];
    };

    passthru.editable = self.overrideAttrs (_: {
      shellHook = ''
        setupSubmodulesEditable
        mill mill.bsp.BSP/install 0
      '';
    });

    shellHook = ''
      setupSubmodules
    '';

    nativeBuildInputs = [
      mill
      circt-full
      jextract
      strip-nondeterminism

      makeWrapper
      passthru.millDeps.setupHook

      submodules.setupHook
    ];

    env.CIRCT_INSTALL_PATH = circt-full;

    outputs = [ "out" "configgen" "elaborator" ];

    buildPhase = ''
      mill -i '__.assembly'
    '';

    installPhase = ''
      mkdir -p $out/share/java

      strip-nondeterminism out/elaborator/assembly.dest/out.jar
      strip-nondeterminism out/configgen/assembly.dest/out.jar

      mv out/configgen/assembly.dest/out.jar $out/share/java/configgen.jar
      mv out/elaborator/assembly.dest/out.jar $out/share/java/elaborator.jar

      mkdir -p $configgen/bin $elaborator/bin
      makeWrapper ${jdk21}/bin/java $configgen/bin/configgen --add-flags "-jar $out/share/java/configgen.jar"
      makeWrapper ${jdk21}/bin/java $elaborator/bin/elaborator --add-flags "--enable-preview -Djava.library.path=${circt-full}/lib -jar $out/share/java/elaborator.jar"
    '';
  };
in
self
