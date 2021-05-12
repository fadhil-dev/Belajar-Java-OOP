class Dosen{
    String nama= "bayu";
    String NID = "293";
    Dosen (String nama, String NID){
        System.out.println(nama+NID);
        System.out.println(this.nama+this.NID);
    }

    void setNama(String nama){
        this.nama=nama;
    }

    String pesan(String pesanku){
        return "halo "+this.nama+","+pesanku;
    }
}


public class Main{
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Kuli", "193");
        System.out.print(dosen1.nama);
        System.out.println(dosen1.NID);
        dosen1.setNama("naruto");
        System.out.println(dosen1.nama);
        String datapesan = dosen1.pesan("Semangat!");
        System.out.println(datapesan);
    }
}
