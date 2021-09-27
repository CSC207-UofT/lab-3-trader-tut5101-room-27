import org.junit.Test;

import static org.junit.Assert.*;

public class MagicBikeTest {

    @Test(timeout = 50)
    public void testHallucinate() {
        MagicBike bike = new MagicBike();
        assert !bike.hallucinate(true);
    }

}