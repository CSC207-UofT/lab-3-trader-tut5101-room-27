public class Husky implements Domesticatable, Tradable{
    private int iQ;

    public Husky(){
        this.iQ = 0;
    }

    public Husky(int iQ) {
        this.iQ = iQ;
    }

    public int GetIQ() {
        return this.iQ;
    }

    @Override
    public String sound() {
        return "Aaaawwww!";
    }

    @Override
    public int getPrice() {
        return 40000;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (IQ: " + this.iQ + ")";
    }
}
