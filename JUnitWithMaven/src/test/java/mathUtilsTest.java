import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathUtilsTest {
    @Test
    void add() {
        mathUtils m1 = new mathUtils();
        int add = m1.add(5, 5);
        assertEquals(10, add);
    }

    @Test
    void sub() {
        mathUtils m1 = new mathUtils();
        int sub = m1.sub(10, 2);
        assertEquals(8, sub);
    }

    @Test
    void multiply() {
        mathUtils m1 = new mathUtils();
        int mult = m1.multiply(8, 4);
        assertEquals(32, mult);
    }

    @Test
    void divide() {
        mathUtils m1 = new mathUtils();
        double div = m1.divide(75, 0);
        assertEquals(-1, div);
    }
}