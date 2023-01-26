package pl.javastart.task;

public class TestOperations {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        System.out.println(op1.isEven(4));
        System.out.println(op1.isOdd(3));
        System.out.println(op1.circleField(6.5));
        System.out.println(op1.power(5));
    }
}
