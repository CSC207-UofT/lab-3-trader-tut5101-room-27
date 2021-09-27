public class Motorcycle implements Tradable, Drivable {
    private int maxSpeed;

    public Motorcycle() {
        this.maxSpeed = 5;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public void upgradeSpeed() { this.maxSpeed++;

    }

    @Override
    public void downgradeSpeed() { this.maxSpeed--;

    }

    @Override
    public int getMaxSpeed() { return this.maxSpeed;
    }


}
