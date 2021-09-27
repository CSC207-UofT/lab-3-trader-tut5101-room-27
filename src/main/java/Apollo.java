public class Apollo implements Tradable, Drivable {
    private int Speed;

    public Apollo() {
        this.Speed = 11;
    }

    @Override
    public void upgradeSpeed() {
        this.Speed++;
    }

    @Override
    public void downgradeSpeed() {
        this.Speed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.Speed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
