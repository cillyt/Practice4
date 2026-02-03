package ua.univarsity;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Calculator {
    int divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException();
        }
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        Calculator operation = new Calculator();
        System.out.println(operation.divide(10, 5));
        System.out.println(operation.divide(10, 0));

    }

    @Test
    void testDiv(){
        Calculator operation = new Calculator();
        int result = operation.divide(8, 2);
        assertEquals(4, result);
    }

    @Test
    void testException(){
        Calculator operation = new Calculator();
        assertThrows(
                IllegalArgumentException.class, () -> {operation.divide(10,0);}
        );
    }


}
