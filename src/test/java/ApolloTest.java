import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApolloTest {
    Apollo a;

    @Before
    public void setUp() throws Exception {
        a = new Apollo();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(11, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        a.upgradeSpeed();
        assertEquals(12, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        a.downgradeSpeed();
        assertEquals(10, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, a.getPrice());
    }

}