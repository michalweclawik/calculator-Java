package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.example.Calculator.calculate;

public class CalculatorTest extends TestCase {

@Test
@DisplayName("Adding two numbers")
    public void testCalculateAdd() {
    double firsNumber=1;
    double secondNumber=2;
    double expectedResult =3;
    double result= calculate(firsNumber,secondNumber,"+");
assertEquals(expectedResult,result);
    }
@Test
@DisplayName("Substraction two numbers")
    public void testCalculateSubs() {
    double firsNumber=5;
    double secondNumber=2;
    double expectedResult =3;
    double result= calculate(firsNumber,secondNumber,"-");
assertEquals(expectedResult,result);
    }


    public void testIsRunning() {
    }

    public void testSetRunning() {
    }

}