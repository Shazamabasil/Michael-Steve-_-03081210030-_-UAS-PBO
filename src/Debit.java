public class Debit extends Pembayaran{
    
    double i;
    double x;

    public Debit(double i, double x) 
    {
        this.i = i;
        this.x = x;
    }
    
    @Override
    public double MetodeByr() {
        return (i= i - (i*x) + (i*x));
    }
}