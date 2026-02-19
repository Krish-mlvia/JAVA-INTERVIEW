class Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of integers: "+c.add(5, 10));
        System.out.println("Sum of doubles: "+c.add(5, 10));
    }
    
}