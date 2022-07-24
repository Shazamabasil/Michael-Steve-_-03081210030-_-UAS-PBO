public class Pelanggan {
    int NoHP2;

    public Pelanggan() {
    }

    public Pelanggan(int NoHP2) {
        this.NoHP2 = NoHP2;
    }

    public int getNoHP2() {
        return this.NoHP2;
    }

    public void setNoHP2(int NoHP2) {
        this.NoHP2 = NoHP2;
    }

    @Override
    public String toString() {
        return "{" +
            " NoHP2='" + getNoHP2() + "'" +
            "}";
    }
     
 
}