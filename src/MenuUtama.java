import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

//Michael Steve
//03081210030
//UAS PBO

public class MenuUtama {
    
    public static ArrayList <Petugas> initPetugas(ArrayList <Petugas> petugas)
    {
        Petugas ptg1 =  new Petugas("0101", "Malih", "malih@gmail.com", "Sukaramai", "MalihGanteng", "MalihTheChipmonk");
        petugas.add(ptg1);
        Petugas ptg2 =  new Petugas("0201", "Budi", "budi@gmail.com", "Sukasepi", "BudiKece", "BudiBudi");
        petugas.add(ptg2);
        Petugas ptg3 =  new Petugas("0301", "Manite", "Manite@gmail.com", "Sukasendiri", "Maniterasi", "Mantap");
        petugas.add(ptg3);
        Petugas ptg4 =  new Petugas("0401", "Semi", "Semi@gmail.com", "Sukasukaaku", "Seminar", "MusimSemi");
        petugas.add(ptg4);
        Petugas ptg5 =  new Petugas("0501", "Poli", "Politron@gmail.com", "SukaLari", "Poligon", "Polisi");
        petugas.add(ptg5);
        return petugas;
    }        
    public static ArrayList <Member> initMember(ArrayList <Member> members)
    {
            Member mbr1 =  new Member (010001, "Karen", "Imam Bonjol", "0813777766554");
            members.add(mbr1);
            Member mbr2 =  new Member (010002, "Sem", "Lippo Plaza", "081276548765");
            members.add(mbr2);
            Member mbr3 =  new Member (010003, "Kevin", "Paladium", "08110983023");
            members.add(mbr3);
            Member mbr4 =  new Member (010004, "Gracia", "Pekalongan", "081226520938");
            members.add(mbr4);
            Member mbr5 =  new Member (010005, "Caiya", "Pesugihan", "081646973930");
            members.add(mbr5);
            return members;
    }
    
    public static ArrayList <Barang> initBarang(ArrayList <Barang> barangs)
        {
            Barang brg1 =  new Barang("010101","IoT", "Air Purify", 100, 1400000);
            barangs.add(brg1);
            Barang brg2 =  new Barang("020202","Smart Phone", "Samsung S22 Ultra", 50, 22000000);
            barangs.add(brg2);
            Barang brg3 =  new Barang("030303","Smart Phone", "Iphone 13", 34, 14499000);
            barangs.add(brg3);
            Barang brg4 =  new Barang("040404", "Smart Phone", "Iphone 10", 25, 10799000);
            barangs.add(brg4);
            Barang brg5 =  new Barang("050505", "IoT", "AC", 20, 2700000);
            barangs.add(brg5);
            Barang brg6 =  new Barang("060606", "IoT", "Tesla", 5, 1000000000);
            barangs.add(brg6);
            Barang brg7 =  new Barang("070707", "Smart Phone", "Samsung Galaxy Note Ultra 20", 20, 20000000);
            barangs.add(brg7);
            Barang brg8 =  new Barang("080808", "Smart Phone", "Oppo F1s", 5, 3000000);
            barangs.add(brg8);
            Barang brg9 =  new Barang("090909","IoT", "Lampu", 100, 200000);
            barangs.add(brg9);
            Barang brg10 =  new Barang("101010","IoT", "Vacum Cleaner", 100, 3400000);
            barangs.add(brg10);
            return barangs;
        }
    
    public static ArrayList <Transaksi> initTransaksi(ArrayList <Transaksi> transaksi)
        {  
            Transaksi trn1 = new Transaksi("Air Purify", 1, "11 July 2022", 1400000);
            transaksi.add(trn1);
            Transaksi trn2 = new Transaksi("Iphone 10", 1, "11 July 2022", 10799000);
            transaksi.add(trn2);
            Transaksi trn3 = new Transaksi("Lampu", 10, "11 July 2022", 2000000);
            transaksi.add(trn3);
            Transaksi trn4 = new Transaksi("Vacum Cleaner", 1, "11 July 2022", 3400000);
            transaksi.add(trn4);
            Transaksi trn5 = new Transaksi("AC", 3, "11 July 2022", 8100000);
            transaksi.add(trn5);
            return transaksi;
        }
    public static ArrayList <Kasir> initKasir(ArrayList <Kasir> kasirs) 
    //By Michael Steve (subclass)
    {
        Kasir ksr1 = new Kasir (" 2001", " Kenny ", 200000 );
        kasirs.add(ksr1);
        Kasir ksr2 = new Kasir (" 2002", " Patri ",100000 );
        kasirs.add(ksr2);
        Kasir ksr3 = new Kasir (" 2003", " Columbus ",300000 );
        kasirs.add(ksr3);
        Kasir ksr4 = new Kasir (" 2004", " Giant ",250000 );
        kasirs.add(ksr4);
        return kasirs;
    }
    
    
    
    
    public static void main(String[] args) throws Exception 
    {
        ArrayList <Petugas> petugas = new ArrayList <Petugas>();
        ArrayList <Member> members = new ArrayList <Member>();
        ArrayList <Barang> barangs = new ArrayList <Barang>();
        ArrayList <Penjualan> penjualans = new ArrayList<>();
        ArrayList <Keranjang> keranjangs = new ArrayList<>();
        ArrayList <Transaksi> transaksi = new ArrayList<>();
        ArrayList <Kasir> kasirs = new ArrayList <Kasir>();
        
        initBarang(barangs);
        initMember(members);
        initPetugas(petugas);
        initTransaksi(transaksi);
        initKasir (kasirs);
    
        Boolean Login = false;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Silahkan Login Terlebih Dahulu");
        System.out.println("==============================");
        do {
            menuBLMogin(petugas);
            Login = true;
            } while (Login == false);

        Scanner input = new Scanner(System.in);
        String yn="y";
        do 
        {
            
            MenuUtama();
            int pilihan = 0;
            pilihan = input.nextInt();
            if(pilihan==1)
            {
                String plhn = "y";
                do
                {
                    String IDPenjualan;
                    String IDPetugas;
                    String Tanggal;

                    Scanner dtl = new Scanner(System.in);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.print("Masukkan Tanggal Pembelian \t:");
                    Tanggal=dtl.nextLine();
                    System.out.print("ID Pembelian \t\t\t:");
                    IDPenjualan=dtl.nextLine();
                    System.out.print("ID Petugas  \t\t\t:");
                    IDPetugas=dtl.nextLine();
                    penjualans.add(new Penjualan(IDPenjualan, Tanggal, IDPetugas)); 

                    String Barcode;
                    String Jenis;
                    String NamaItem;
                    int Harga=0;
                    int Total=0;
                    int Total1=0;
                    double Total2=0;
                    int Kuantitas=0;
                    System.out.print ("\nSilahkan Masukkan Barang Belanjaan Anda\n");
                    System.out.print ("=======================================\n");
                    String yns = "t";
                    //Insert Barang
                    do 
                    {
                        Scanner inp2 = new Scanner(System.in);
                        System.out.print("Masukkan Kode Barcode \t\t:");
                        Barcode = inp2.nextLine();
                        System.out.print("Masukkan Nama Item \t\t:");
                        NamaItem= inp2.nextLine();
                        System.out.print("Masukkan Jenis Item \t\t:");
                        Jenis = inp2.nextLine();
                        System.out.print("Masukkan Harga Barang \t\t:");
                        Harga = inp2.nextInt();
                        System.out.print("Masukkan Kuantitas Barang \t:");
                        Kuantitas = inp2.nextInt();
                        Total = Harga * Kuantitas;
                        keranjangs.add(new Keranjang(Barcode, Jenis, NamaItem, Kuantitas, Harga, Total));
                        Total1 += Total;
                        System.out.print ("\nIngin Memasukkan Barang Pembelanjaan Lagi? (y/n)\t:");
                        yns = input.next();
                    }while (yns.equalsIgnoreCase("y"));
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    //List Barang

                    System.out.print ("\n\t\tKERANJANG \n =======================================\n");
                    for (Penjualan penjualan : penjualans) 
                    {
                        System.out.println("The Erafine" + penjualan);
                    }
                    System.out.println("QTY\t\tNama Item\t\tHarga");
                    for (Keranjang krjg : keranjangs) 
                    {
                        System.out.println(krjg);
                    }
                        System.out.println("\nTotal Pembelanjaan Anda : " + Total1 + "\n");
                    //menubarang melanjutkan pembayaran

                    System.out.println("MENU");
                    int plhn1=0;
                            
                    do
                    {
                        System.out.println("1. LANJUTKAN KE MENU PEMBAYARAN");
                        System.out.println("2. KELUAR");
                        System.out.print("Masukkan Pilihan Anda: ");
                        plhn1 = input.nextInt();
                        String z="";
                        String a;
                    
                        if (plhn1==1) 
                        {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\nTotal Pembelanjaan Anda : " + Total1);
                            System.out.println("\nMetode Pembayatan");
                            System.out.println("1. CASH");
                            System.out.println("2. KREDIT");
                            System.out.println("3. DEBIT");
                            int plhn4;
                            plhn4 = input.nextInt();
                            String k="";
                            
                            if (plhn4==1)
                                {
                                    int c;
                                    z = "CASH";
                                    System.out.println("Pembayaran Menggunakan Cash");
                                    System.out.println("==============================");
                                    Pembayaran cash = new Cash(Total1, 20000);
                                    System.out.println("TOTAL PEMBAYARAN SEBELUM DISKON : " + Total1);
                                    System.out.println("TOTAL PEMBAYARAN SETELAH DISKON : " + cash.MetodeByr());
                                    Total2 = cash.MetodeByr();
                                    System.out.print("UANG YANG DI TERIMA\t:");
                                    c = input.nextInt();
                                    System.out.println("PEMBAYARAN BERHASIL DILAKUKAN\t\n");
                                    System.out.print("INGIN MENCETAK BILL? (y/n)\t:");
                                    k = input.next();
                                    if (k.equals("y"))
                                    {
                                        System.out.print ("\n\t\tBILLING \n =======================================\n");
                                        for (Penjualan penjualan : penjualans) 
                                        {
                                            System.out.println("The Erafine" + penjualan);
                                        }
                                        System.out.println("QTY\t\tNama Item\t\tHarga");
                                        for (Keranjang krjg : keranjangs) 
                                        {
                                            System.out.println(krjg);
                                        }
                                        System.out.println("\nTotal Pembelanjaan Anda\t\t\t\t : " + Total1 + "\n");
                                        System.out.println("Total Pembelanjaan Anda Setelah Diskon \t: " + Total2 + "\n");
                                        System.out.println("Menggunakan Metode \t\t\t\t : " + z + "\n");
                                        System.out.println("TERIMA KASIH TELAH BERBELANJA DI ERAFIN");
                                        return;
                                    }
                                }
                                if (plhn4==2)
                                {
                                        z = "Kredit";
                                        Kredit kredit = new Kredit(Total1, 0.1);
                                        System.out.println("Pembayaran Menggunakan KREDIT");
                                        System.out.println("==============================");
                                        System.out.println("TOTAL PEMBAYARAN SEBELUM DISKON : " + Total1);
                                        System.out.println("TOTAL PEMBAYARAN SETELAH DISKON : " + kredit.MetodeByr());
                                        Total2 = kredit.MetodeByr();
                                        System.out.print("MASUKKAN NOMOR KARTU\t:");
                                        a = input.next();
                                        System.out.println("PEMBAYARAN BERHASIL DENGAN NOMOR KARTU\t:" + a + "\n");
                                        System.out.print("INGIN MENCETAK BILL? (y/n)\t:");
                                        k = input.next();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        if (k.equals("y"))
                                        {
                                            System.out.print ("\n\t\tBILLING \n =======================================\n");
                                            for (Penjualan penjualan : penjualans) 
                                            {
                                                System.out.println("The Erafine" + penjualan);
                                            }
                                            System.out.println("QTY\t\tNama Item\t\tHarga");
                                            for (Keranjang krjg : keranjangs) 
                                            {
                                                System.out.println(krjg);
                                            }
                                            System.out.println("\nTotal Pembelanjaan Anda\t\t\t\t : " + Total1 + "\n");
                                            System.out.println("Total Pembelanjaan Anda Setelah Diskon \t: " + Total2 + "\n");
                                            System.out.println("Menggunakan Metode \t\t\t\t : " + z + "\n");
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA DI ERAFIN");
                                            return;
                                        }
                                        else 
                                        return;
                                    
                                }
                                if (plhn4==3)
                                {
                                    z = "Debit";
                                    Debit debit = new Debit(Total, 0.05);
                                    System.out.println("Pembayaran Menggunakan DEBIT");
                                    System.out.println("==============================");
                                    System.out.println("TOTAL PEMBAYARAN SEBELUM DISKON : " + Total1);
                                    System.out.println("TOTAL PEMBAYARAN SETELAH DISKON : " + debit.MetodeByr());
                                    Total2 = debit.MetodeByr();
                                    System.out.print("MASUKKAN NOMOR REKENING\t:");
                                    a = input.next();
                                    System.out.println("PEMBAYARAN BERHASIL DENGAN No.Rek \t:" + a + "\n");
                                    System.out.print("INGIN MENCETAK BILL? (y/n)\t:");
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    k = input.next();
                                    if (k.equals("y"))
                                    {
                                        System.out.print ("\n\t\tKERANJANG \n =======================================\n");
                                        for (Penjualan penjualan : penjualans) 
                                        {
                                            System.out.println("The Erafine" + penjualan);
                                        }
                                        System.out.println("QTY\t\tNama Item\t\tHarga");
                                        for (Keranjang krjg : keranjangs) 
                                        {
                                            System.out.println(krjg);
                                        }
                                        System.out.println("\nTotal Pembelanjaan Anda\t\t\t\t : " + Total1 + "\n");
                                        System.out.println("Total Pembelanjaan Anda Setelah Diskon \t: " + Total2 + "\n");
                                        System.out.println("Menggunakan Metode \t\t\t\t : " + z + "\n");
                                        System.out.println("TERIMA KASIH TELAH BERBELANJA DI ERAFIN");
                                        return;
                                    }
                                    else 
                                    return;
                                }      
                        }                      
                        else if (plhn1==2)
                        {
                            System.out.println("KAMU INGIN KEMBALI KE MENU UTAMA? (y/t)\t : ");
                            plhn = input.next();
                        } 
                        else 
                            System.out.println("\nPILIHAN TIDAK TEPAT. COBA LAGI\n");
                            
                    }while (plhn1==0||plhn1>=3);
                } while (plhn.equalsIgnoreCase( "t"));
            }
            else if(pilihan==2)
            {
                String yn2="y";
                do
                {
                    MenuBarangDiErafine(); 
                        int pilihanbrng = 0;
                        pilihanbrng = input.nextInt();
        
                        if(pilihanbrng==1)//tambah data barang masuk
                        {
                            Scanner inbarang = new Scanner(System.in);
                            String Barcode;
                            String Jenis;
                            String NamaItem;
                            int Stok;
                            int Harga; 

                            System.out.print("Barcode Barang \t: ");
                            Barcode=inbarang.nextLine();
                            System.out.print("Jenis Barang \t: ");
                            Jenis=inbarang.nextLine();
                            System.out.print("Nama Barang \t: ");
                            NamaItem=inbarang.nextLine();
                            System.out.print("Stok Barang \t: ");
                            Stok=input.nextInt();
                            System.out.print("Harga Barang \t: ");
                            Harga=input.nextInt();

                            barangs.add(new Barang(Barcode, Jenis, NamaItem, Stok, Harga));
                            System.out.println("Data Berhasil Ditambahkan");
                        }

                        else if(pilihanbrng==2)//tampilkan data barang yg ada
                        {
                            cetakDatayangada(barangs);
                        }    

                        else if (pilihanbrng==3)//cari data barang
                        {
                            Scanner inbarang = new Scanner(System.in);
                            String databarang;
                            System.out.print("Masukkan nama Barang : ");
                            databarang = inbarang.nextLine();
                            pencariandatabarang(barangs, databarang);
                        }
                        else if(pilihanbrng==4)//keluar
                        {
                            break;
                        }
                        else{
                            continue;
                        }
                        System.out.print("Apakah anda ingin kembali ke menu Utama? (y/n): ");
                        System.out.flush();
                    }
                    while(yn2.equalsIgnoreCase("y"));
                }
                else if(pilihan==3)
                {
                    CetakHistoriTransaksi(transaksi);
                }
                else if(pilihan==4)
                {
                    System.out.println("Terima Kasih!");
                    System.out.println("");
                    break;
                }
                else if(pilihan==5) //By Michael Steve ( Cek petugas Kasir dan merupakan Overloading )
                {
                    menuKasir(kasirs);
                    System.out.println("\n\n ini merupakan OVERLOADING");
                    Kasir.methodoverloading();
                    break;
                }
                else if(pilihan==6) //By Michael Steve ( Baca File )
                {
                    Penjualan.Util.bacaFile();
                    break;
                }
                else if(pilihan==7)//By Michael Steve ( Menulis File )
                {
                    Penjualan.Util.tulisFile();
                    break;
                }
            } while (yn.equalsIgnoreCase("y"));
        
    }

    

   //MenuUtama Blm Login
   public static void menuBLMogin(ArrayList <Petugas> petugas)
   {
        Scanner input = new Scanner(System.in);
        String UName1;
        String Pass1;     
        Boolean Login1=false;
        do 
        {
            System.out.print("Masukkan User Name \t: ");
            UName1 = input.next();
            for (Petugas ptg : petugas) 
            {
                if (ptg.getUName().equals(UName1))
                {
                System.out.print("Masukkan Password \t: ");
                Pass1 = input.next();
                for (Petugas ptg2 : petugas) 
                {
                    if(ptg2.getPass().equals(Pass1))
                    {
                        Login1 = true;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                    else 
                    {
                        System.out.println("PASSWORD YANG DIMASUKKAN SALAH");
                    }
                }
                }
            } 
        } 
        while (Login1 == false);
    }
    public static void MenuUtama(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nSelamat Datang Kembali Michael");
        System.out.println("=======================================");
        System.out.println("1. Transaksi");
        System.out.println("2. Barang");
        System.out.println("3. Cetak Detail Histori Transaksi");
        System.out.println("4. Keluar");
        System.out.println("5. Tampilkan Petugas Kasir");
        System.out.println("6. Baca File txt");
        System.out.println("7. Tulis File txt");
        System.out.print("Masukkan Pilihan Anda: ");
    }
    public static void MenuBarangDiErafine()
    {
        System.out.println("Data Barang di Erafine");
        System.out.println("1. Tambah data barang yang masuk di Erafine");
        System.out.println("2. Tampilkan data barang yang ada");
        System.out.println("3. Pencarian data barang");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }
    public static void cetakDatayangada(ArrayList <Barang> barangs)
    {
        System.out.println ("-------------------------------------------------------------");
        System.out.println("Daftar Barang");
        System.out.println ("-------------------------------------------------------------");
        for (Barang barang : barangs) 
        {
            System.out.println(barang);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void CetakHistoriTransaksi(ArrayList <Transaksi> transaksi)
    {
        System.out.println ("-------------------------------------------------------------");
        System.out.println("HIstori Transaksi");
        System.out.println ("-------------------------------------------------------------");
        for (Transaksi transaksis : transaksi) 
        {
            System.out.println(transaksis);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void pencariandatabarang (ArrayList <Barang> barangs, String databarang)
    {
        for (Barang barang : barangs) {
            if (barang.getNamaItem().equalsIgnoreCase(databarang))
            {
                System.out.println("Barang yang anda cari : \n" + "Jenis barang\t\t: \t" + barang.getJenis() + "\nNama Barang \t\t:\t" + barang.getNamaItem() + "\nStok Barang \t\t:\t" + barang.getStok() + "\nHarga Barang\t\t:\t" + barang.getHarga());
            }
        }
    }

    //public static void 
    /*public static void PenjualanDTL()
    {
        String IDPenjualan;
        String IDPetugas;
        String Tanggal;
        ArrayList <Penjualan> penjualans = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Pembelian \t:");
        Tanggal=input.nextLine();
        System.out.println("ID Pembelian \t:");
        IDPenjualan=input.nextLine();
        System.out.println("ID Petugas  \t:");
        IDPetugas=input.nextLine();
        penjualans.add(new Penjualan(IDPenjualan, Tanggal, IDPetugas));      
    }*/

    public static void menuBarang(ArrayList <Barang> barangs)
    {
        System.out.println ("------------------------------------------------");
        for (Barang barang : barangs) 
        {
            System.out.println(barang);
        }
    }

    public static void menuKasir(ArrayList <Kasir> kasirs)
//By Michael Steve untuk menampilkan petugas Kasir
    {
        System.out.println("--------------------------------------------------");
        for (Kasir kssr : kasirs)
        {
            System.out.println(kssr);
        }
    }
}
        