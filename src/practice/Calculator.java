package practice;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) throws MyException {
        try {
             return a/b;
         } catch (ArithmeticException e){
                System.out.println(e.getMessage());
                throw new MyException("My exception");
        }
    }
}
