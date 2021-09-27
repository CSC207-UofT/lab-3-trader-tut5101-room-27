import org.junit.*;

import static org.junit.Assert.*;


public class MotorcycleTest {
    Motorcycle M;

    @Before
    public void setUp() throws Exception {
        M = new Motorcycle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, M.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        M.upgradeSpeed();
        assertEquals(6, M.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        M.downgradeSpeed();
        assertEquals(4, M.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, M.getPrice());
    }

}