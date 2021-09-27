public class Scooter implements Tradable, Drivable{
    private int maxSpeed;

    public Scooter(){
        maxSpeed = 100;
    }

    public int getPrice() {
        return 88;
    }

    /**
     * Increase the speed of the scooter by 50.
     */
    @Override
    public void upgradeSpeed() {
        maxSpeed += 50;
    }

    /**
     * Decrease the speed of the scooter by 1.
     */
    @Override
    public void downgradeSpeed() {
        maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
