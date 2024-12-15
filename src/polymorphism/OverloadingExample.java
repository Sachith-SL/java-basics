package polymorphism;

public class OverloadingExample {

    public int add(int a, double b){
        return a+(int)b;
    }

    public double add(double a, int b){
        return 1.0;
    }
}
