public class Kasir extends Petugas {
//UAS
//Michael Steve 
//03081210030
//subclass
    String IDKasir;
    String NamaKasir;
    int gaji;
//Membuat Nama petugas Kasir, ID petugas Kasir dan Gaji petugas Kasir
    public Kasir(){
    }

    public Kasir(String IDKasir, String NamaKasir, int gaji) {
        this.IDKasir = IDKasir;
        this.NamaKasir = NamaKasir;
        this.gaji = gaji;
    }

    public String getIDKasir() {
        return this.IDKasir;
    }

    public void setIDKasir(String IDKasir) {
        this.IDKasir = IDKasir;
    }

    public String getNamaKasir() {
        return this.NamaKasir;
    }

    public void setNamaKasir(String NamaKasir) {
        this.NamaKasir = NamaKasir;
    }

    public int getGaji() {
        return this.gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return 
            "IDKasir\t:" + getIDKasir() +
            " \tNama Kasir\t:" + getNamaKasir() +
            "\tgaji\t:" + getGaji() 
            ;
    }
//Method Overloading untuk menampilkan Nama Kasir, ID Kasir dan gaji by Michael Steve
static void menampilkan (String NamaKasir, String IDKasir){
    System.out.println("Nama Kasir adalah " +NamaKasir+"IDKasir adalah : " +IDKasir );
}
static void menampilkan (int gaji){
    System.out.println("Gaji yang didapatkan adalah " +gaji);
}
public static void methodoverloading(){
    menampilkan("MIKE","007");
    menampilkan(10000);
}

//QuickSort by Michael Steve
public static void quickSort(int a[], int lo, int hi){
    int i=lo, j=hi, h;
    int pivot=a[lo];
    //pembagian
    do{
        while (a[i] <pivot) i++;
        while (a[j] >pivot) j--;
        if (i<=j){
            h=a[i]; a[i]=a[j]; a[j]=h;
            i++; j--;
        }
    }
        while (i<=j);

    //pengurutan
    if (lo<j) quickSort (a,lo,j);
    if (i<hi) quickSort (a,i,hi);

}
//Untuk merapikan Gaji petugas Kasir by Michael Steve
public static void main(String[] args){
    int tabInt [] = {200000,100000,300000,250000};
    int i, n=4;
    for ( i = 0; i < n; i++){
        System.out.println(tabInt[i]+"");
    }
    System.out.println("\n");
    quickSort(tabInt,0,n-1);

     for ( i = 0; i < n; i++){
     System.out.println(tabInt[i]+"");
    }

}

}
