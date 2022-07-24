public class Keranjang {
    String Barcode;
    String Jenis;
    String NamaItem;
    int Kuantitas;
    int Harga; 
    int Total;

    public Keranjang() {
    }


    public Keranjang(String Barcode, String Jenis, String NamaItem, int Kuantitas, int Harga, int Total) {
        this.Barcode = Barcode;
        this.Jenis = Jenis;
        this.NamaItem = NamaItem;
        this.Kuantitas = Kuantitas;
        this.Harga = Harga;
        this.Total = Total;
    }
    public int getTotal() {
        return this.Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    public String getBarcode() {
        return this.Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getJenis() {
        return this.Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getNamaItem() {
        return this.NamaItem;
    }

    public void setNamaItem(String NamaItem) {
        this.NamaItem = NamaItem;
    }

    public int getKuantitas() {
        return this.Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

    public int getHarga() {
        return this.Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    
    @Override
    public String toString() 
    {
        return 
            getKuantitas() + "\t\t" +
            getNamaItem() + "\t\t\t" +  
            getHarga();
    }
   

}