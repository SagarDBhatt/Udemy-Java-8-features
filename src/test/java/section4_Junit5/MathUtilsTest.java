package section4_Junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void add() {
       MathUtils mathUtils = new MathUtils();
       int actual = mathUtils.add(1,1);
       int expected = 2;

      /* if (actual == expected)
           System.out.println("This test passed!!");*/
      assertEquals(expected,actual,"The add method should add two numbers");
    }

    @Test
    void testCalcCircleArea(){
        MathUtils utils = new MathUtils();

        double expectedArea = 314.0;
        double actual = utils.calcCircleArea(10);
        assertEquals(expectedArea,actual,"The area of the circle should match");
    }
}