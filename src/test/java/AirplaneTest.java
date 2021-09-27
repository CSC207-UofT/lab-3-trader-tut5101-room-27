
import org.junit.*;

import static org.junit.Assert.*;


public class AirplaneTest {
    Airplane A;

    @Before
    public void setUp() throws Exception {
        A = new Airplane();
    }



    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, A.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        A.downgradeSpeed();
        assertEquals(0, A.getMaxSpeed());
    }
    @Test(timeout = 100)
    public void Test_model() {
        A.m0del();
    }

}

