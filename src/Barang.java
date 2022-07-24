public class Barang {
    String Barcode;
    String Jenis;
    String NamaItem;
    int Kuantitas;
    int Stok;
    int Harga; 


    public Barang() {
    }

    public Barang( int Stok) {
        this.Stok = Stok; 
    }

    public Barang(String Barcode, String Jenis, String NamaItem, int Kuantitas, int Harga) {
        this.Barcode = Barcode;
        this.Jenis = Jenis;
        this.NamaItem = NamaItem;
        this.Kuantitas = Kuantitas;
        this.Harga = Harga;
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

    public int getStok() {
        return this.Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
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
        return "\n" + 
            "BARCODE\t\t:" + getBarcode() +
            "\nJENIS\t\t:" + getJenis()  +
            "\nNAMA ITEM\t:" + getNamaItem() +
            "\nKUANTITAS \t:" + getKuantitas() + 
            "\nHARGA\t\t:" + getHarga() +
            "\nSTOK\t\t:" + getStok();
    }
   

}