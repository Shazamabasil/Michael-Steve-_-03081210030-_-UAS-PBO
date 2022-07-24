public class Transaksi {
    String Namabrg;
    int Kuantitas;
    String tgl;
    int Harga;


    public String getNamabrg() {
        return this.Namabrg;
    }

    public void setNamabrg(String Namabrg) {
        this.Namabrg = Namabrg;
    }

    public int getKuantitas() {
        return this.Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

    public String getTgl() {
        return this.tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public int getHarga() {
        return this.Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }


    public Transaksi(String Namabrg, int Kuantitas, String tgl, int Harga) {
        this.Namabrg = Namabrg;
        this.Kuantitas = Kuantitas;
        this.tgl = tgl;
        this.Harga = Harga;
    }


    @Override
    public String toString() {
        return
            " Nama Barang\t= " + getNamabrg() + "\n" +
            " Kuantitas\t= " + getKuantitas() + "\n" +
            " Tanggal\t= " + getTgl() + "\n" +
            " Total Harga\t= " + getHarga() + "\n";
    }

}