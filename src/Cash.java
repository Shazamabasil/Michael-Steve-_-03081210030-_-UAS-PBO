public class Cash extends Pembayaran{
    
    int i;
    int x;

    public Cash(int i, int x) 
    {
        this.i = i;
        this.x = x;
    }
    
    @Override
    public double MetodeByr() {
        return (i-x);
    }
}