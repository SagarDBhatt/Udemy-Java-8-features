package section4_Junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void add() {
        assertEquals(2,MathUtils.add(1,1));
        System.out.println("This is test!");
    }
}