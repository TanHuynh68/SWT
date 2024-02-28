import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCalculator {
    @Test
    public void test1(){
        assertTrue(Calculator.add(2,5,7));
        assertFalse(Calculator.add(2,5,8));
    }
    @Test
    public void test2(){
        assertTrue(Calculator.sub(2,5,-3));
        assertFalse(Calculator.sub(2,5,4));
    }
    @Test
    public void test3(){
        assertTrue(Calculator.pro(2,5,10));
        assertFalse(Calculator.pro(2,5,11));
    }
    @Test
    public void test4(){
        assertTrue(Calculator.divide(2,5,0));
        assertFalse(Calculator.divide(2,5,10));
    }
}