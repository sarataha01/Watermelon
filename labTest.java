package testing;
import org.junit.Test;
import static org.junit.Assert.*;

public class labTest {

    @Test
    public void testChecker() {
        lab we = new lab();
        assertEquals("correct",1,we.checker(6));
    }
    @Test
    public void testChecker1() {
        lab we = new lab();
        assertEquals("correct",-1,we.checker(7));
    }
    @Test
    public void testChecker2() {
        lab we = new lab();
        assertEquals("correct",0,we.checker(110));
    }
    @Test
    public void testChecker3() {
        lab we = new lab();
        assertEquals("correct",0,we.checker(-10));
    }
    @Test
    public void testChecker4() {
        lab we = new lab();
        assertEquals("correct",-1,we.checker((float) 2.8));
    }
}