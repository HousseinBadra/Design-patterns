package Bridge;

public class CppCompiler extends Compiler {
    CppCompiler(Platform platform) {
        super(platform);
    }

    boolean isCppFile(String file) {
        return true;
    }

    void Compile(String file) {
        if(isCppFile(file)) this.platform.compile(file);
    }

}
