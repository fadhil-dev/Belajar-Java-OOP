//class tanpa constructor
class Mahasiswa{
    String nama;
    String npm;
    double ipk;
}

//class dengan constructor
/*Constructor adalah method khusus yang akan dieksekusi
 pada saat pembuatan objek (instance) dan diakses pertama kali */
class MahasiswaC{
    String nama;
    String npm;
    double ipk;

    //constructor-nya
    MahasiswaC(String namanya, String npmnya, double ipknya){
        nama = namanya;
        npm = npmnya;
        ipk = ipknya;
        System.out.println(nama);
        System.out.println(npm);
        System.out.println(ipk);
    }
}

public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "fadhil";
        mahasiswa1.npm = "G1A020036";
        mahasiswa1.ipk = 4.0;
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.npm);
        System.out.println(mahasiswa1.ipk);

        MahasiswaC mahasiswaC1 = new MahasiswaC("ilham", "G1A020036", 3.9);
    }
}

