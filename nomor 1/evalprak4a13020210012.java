package EvalPrak4A13020210012;

public class evalprak4a13020210012 {
    public static void main(String[] args) {
        Penduduk penduduk = new Penduduk();
        
        penduduk.setNama("Indah Nirwana");
        penduduk.setNik("737109531");
        
        String nama = penduduk.getNama();
        String nik = penduduk.getNik();
              
        System.out.println("Nama Penduduk: " + penduduk.getNama());
        System.out.println("Nik Penduduk: " + penduduk.getNik());
    }   
}
