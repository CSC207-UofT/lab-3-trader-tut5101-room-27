import org.junit.*;
import static org.junit.Assert.*;

public class ScooterTest {
    Scooter scooter;

    @Before
    public void setUp() {
        scooter = new Scooter();
    }

    @Test(timeout=10)
    public void TestGetPrice() {
        assertEquals(88, scooter.getPrice());
    }

    @Test(timeout=10)
    public void TestMaxSpeed () {
        assertEquals(100, scooter.getMaxSpeed());
    }

    @Test(timeout=10)
    public void TestUpgradeSpeed () {
        scooter.upgradeSpeed();
        assertEquals(150, scooter.getMaxSpeed());
    }

}
