package section4_Junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {

    MathUtils utils;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This is before all method");
    }

    @BeforeEach
    void init(){
        utils = new MathUtils();
    }

    @Test
    void add() {
       //MathUtils mathUtils = new MathUtils();
       int actual = utils.add(1,1);
       int expected = 2;
      assertEquals(expected,actual,"The add method should add two numbers");
    }

    @Test
    void testCalcCircleArea(){
        //MathUtils utils = new MathUtils();

        double expectedArea = 314.0;
        double actual = utils.calcCircleArea(10);

        boolean flag = false;
        if(actual<0) {
            flag = true;
        }
        assumeTrue(flag);

        assertEquals(expectedArea,actual,"The area of the circle should match");
    }

    @Test
    void testDivide(){
        //MathUtils utils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> utils.divide(1,0),"Divide by zero");
    }
}