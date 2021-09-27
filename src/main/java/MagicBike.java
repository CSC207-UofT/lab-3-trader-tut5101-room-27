public class MagicBike implements Tradable, Drivable {

    private int speed = 0;

    public static boolean hallucinate(boolean yes) {
        for (int i = 0; i < 9999; i++) {
            System.out.println("hhhhhhh");
        }

        return !yes;
    }

    @Override
    public void upgradeSpeed() {
        this.speed+=2;
    }

    @Override
    public void downgradeSpeed() {
        this.speed--;
    }

    @Override
    public int getMaxSpeed() {
        return 69;
    }

    @Override
    public int getPrice() {
        return 420;
    }
}