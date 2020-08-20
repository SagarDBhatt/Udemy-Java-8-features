package section4_Junit5;

import org.junit.jupiter.api.*;

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
        //assertThrows(ArithmeticException.class, () -> utils.divide(1,0),"Divide by zero");
        assertAll(
                () -> assertThrows(ArithmeticException.class, () -> utils.divide(1,0),"Divide by zero"),
                () -> assertEquals(5,utils.divide(5,1)),
                () -> assertEquals(0, utils.divide(2,6))
        );
    }

//1. create a nested class to group test cases:

    @Nested
    class TestAddMethod{

        @Test
        void testAddPositiveNumbers() {
            //MathUtils mathUtils = new MathUtils();
            int actual = utils.add(1,1);
            int expected = 2;
            assertEquals(expected,actual,"The add method should add two numbers");
        }

        @Test
        void testAddNegativeNumbers() {
            //MathUtils mathUtils = new MathUtils();
            int actual = utils.add(-1,-1);
            int expected = -2;
            assertEquals(expected,actual,"The add method should add two numbers");
        }

    }

}