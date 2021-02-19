package devops.project;

public class A2 extends A1{
    private int number;

    public A2(String text, int number) {
        super(text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
