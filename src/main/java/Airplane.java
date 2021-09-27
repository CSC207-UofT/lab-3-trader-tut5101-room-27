public class Airplane implements Tradable, Drivable, Domesticatable{
    private int maxSpeed;

    public Airplane() {
        this.maxSpeed = 10;
    }
    public String m0del() {
        return "Boeing 111";
    }

    public void crash_into(Airplane airplane) {
        return "Oh no, " + airplane.m0del() "has crashed into this.m0del"
    }

    @Override
    public String sound() {
        return "brrrrr";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10000;
    }


}
