package Bridge;

public class JavaCompiler extends Compiler {
    JavaCompiler(Platform platform) {
        super(platform);
    }

    boolean isJavaFile(String file) {
        return true;
    }

    void Compile(String file) {
        if (isJavaFile(file))
            this.platform.compile(file);
    }

}
