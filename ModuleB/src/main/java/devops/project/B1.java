package devops.project;

public class B1 extends A2 {
    private boolean bool;

    public B1(String text, int number, boolean bool) {
        super(text, number);
        this.bool = bool;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }
}
