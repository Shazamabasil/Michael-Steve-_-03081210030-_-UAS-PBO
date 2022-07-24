import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Penjualan {
    String IDPenjualan;
    String Tanggal;
    String IDPetugas;



    public Penjualan() {
    }

    public Penjualan(String IDPenjualan, String Tanggal, String IDPetugas) {
        this.IDPenjualan = IDPenjualan;
        this.Tanggal = Tanggal;
        this.IDPetugas = IDPetugas;
    }

    public String getIDPenjualan() {
        return this.IDPenjualan;
    }

    public void setIDPenjualan(String IDPenjualan) {
        this.IDPenjualan = IDPenjualan;
    }

    public String getTanggal() {
        return this.Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getIDPetugas() {
        return this.IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        this.IDPetugas = IDPetugas;
    }

    @Override
    public String toString() {
        return
            
            "\t\t" + getTanggal() +
            "/" + getIDPenjualan() +
            "/" + getIDPetugas()
            ;
    }
//Untuk bisa membaca, menulis dan simpan File dengan juga memakai Exception Handling untuk setiap data 
//by Michael Steve
    public static ArrayList<Penjualan> initPenjualan(ArrayList <Penjualan> penjualan)
    {
        Penjualan pnjl = new Penjualan ( "10101", " 11 July 2022 ", "0101");
        penjualan.add(pnjl);
        Penjualan pnjl2 = new Penjualan ( "20202", " 11 July 2022 ", "0202");
        penjualan.add(pnjl2);
        Penjualan pnjl3 = new Penjualan ( "30303", " 11 July 2022 ", "0303");
        penjualan.add(pnjl3);
        Penjualan pnjl4 = new Penjualan ( "40404", " 11 July 2022 ", "0404");
        penjualan.add(pnjl4);
        Penjualan pnjl5 = new Penjualan ( "50505", " 11 July 2022 ", "0505");
        penjualan.add(pnjl5);
        Penjualan pnjl6 = new Penjualan ( "60606", " 11 July 2022 ", "0606");
        penjualan.add(pnjl6);
        Penjualan pnjl7 = new Penjualan ( "70707", " 11 July 2022 ", "0707");
        penjualan.add(pnjl7);
        Penjualan pnjl8 = new Penjualan ( "80808", " 11 July 2022 ", "0808");
        penjualan.add(pnjl8);
        Penjualan pnjl9 = new Penjualan ( "90909", " 11 July 2022 ", "0909");
        penjualan.add(pnjl9);
        return penjualan;
    }
    public class Util {
        static String lokasiInput= "D:\\Uas\\Michael Steve _ 03081210030 _ UAS PBO\\src\\Tulis.txt";
        static String lokasiOutput= "D:\\Uas\\Michael Steve _ 03081210030 _ UAS PBO\\src\\Baca.txt";
        static ArrayList <Penjualan> penjualans=new ArrayList<Penjualan>();
        
    public static ArrayList<Penjualan> bacaFile(){
        String data;

        try 
        {
            File myFile = new File (lokasiOutput);
            Scanner FileReader = new Scanner(myFile);
            do
            {
                data = FileReader.nextLine();
                System.out.println(data);
            }
            while(FileReader.hasNextLine());
        } 
        catch (Exception e) 
        {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        }
        return penjualans;
    }
    public static ArrayList<Penjualan> tulisFile()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data : ");
        String Tulis = input.next();
        try 
        {
            FileWriter fileWriter = new FileWriter(lokasiInput);
            fileWriter.write(Tulis);
            fileWriter.close();
            System.out.println("File Telah Berhasil ditambahkan");
        }
        catch (IOException e)
        {
            System.out.println("Terjadi kesalah karena :" + e.getMessage());
        }
        return penjualans;
    }
}

}