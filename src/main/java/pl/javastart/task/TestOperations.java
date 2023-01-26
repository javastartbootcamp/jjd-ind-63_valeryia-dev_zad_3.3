package pl.javastart.task;

public class TestOperations {

    public static void main(String[] args) {
    Operations op1 = new Operations();
       op1.printInfoBoolean (op1.isEven(4));
       op1.printInfoBoolean(op1.isOdd(3));
       op1.printInfoDouble(op1.circleField(8.0));
       op1.printInfoInt(op1.power(5));
    }
}
