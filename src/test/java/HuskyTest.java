import org.junit.*;

import static org.junit.Assert.*;

public class HuskyTest {
    Husky h;
    Husky s;

    @Before
    public void setUp() throws Exception {
        h = new Husky();
        s = new Husky(100);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Aaaawwww!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(40000, h.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetIQ() {
        assertEquals(0, h.GetIQ());
        assertEquals(100, s.GetIQ());}
}
