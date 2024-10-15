package Bridge;

abstract class Compiler {
    protected Platform platform;

    Compiler(Platform platForm) {
        this.platform = platForm;
    }

    abstract void Compile(String file);
}
