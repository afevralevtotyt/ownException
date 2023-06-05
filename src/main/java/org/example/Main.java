package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            sumTwoNumbers(10000, 100);
        } catch (TooBigIntegerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumTwoNumbers(int x, int y) throws TooBigIntegerException {
        if(x>1000){
            throw new TooBigIntegerException("Число слишком большое");
        }
        return x+y;
    }
}
