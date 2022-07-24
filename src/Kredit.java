public class Kredit extends Pembayaran{
    
    double i;
    double x;

    public Kredit(int i, double x) 
    {
        this.i = i;
        this.x = x;
    }
    
    @Override
    public double MetodeByr() {
        return (i=i - i*x);
    }
}