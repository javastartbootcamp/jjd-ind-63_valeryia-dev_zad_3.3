package pl.javastart.task;

public class Operations {
    boolean isEven(int a){
      return a%2 == 0;
    }
    boolean isOdd(int a){
        return a%2 != 0;
    }
    void printInfoBoolean(boolean a){
        System.out.println(a);
    }
    double circleField(double r){
        double pi = 3.14;
        double field = pi*r*r;
        return field;
    }
    void printInfoDouble(double a) {
        System.out.println(a);
    }
    int power(int a){
        return (int) Math.pow(a,2); //dlaczego tutaj było przetwarzać w int?
    }
    void printInfoInt(int a) {
        System.out.println(a);
    }
}
