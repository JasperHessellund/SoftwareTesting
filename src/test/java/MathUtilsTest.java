import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test //Main test
    void test() {
    }
    @Test
    void add() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected, actual, "The add method should have 2 numbers");
    }
    @Test
    void computeCircleRadius() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653689793, mathUtils.computeCircleArea(10) ,"Should return right circle area");
    }
}