package pl.javastart.task;

public class Operations {
    boolean isEven(int a) {
        return a % 2 == 0;
    }

    boolean isOdd(int a) {
        return a % 2 != 0;
    }

    double circleField(double r) {
        double pi = 3.14;
        return pi * r * r;
    }

    int power(int a) {
        return (int) Math.pow(a, 2);
    }
}
