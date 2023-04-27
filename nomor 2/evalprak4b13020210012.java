package EvalPrak4B13020210012;

public class evalprak4b13020210012 {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Mobil mobil = new Mobil();
        Pesawat pesawat = new Pesawat();
        Jet jet = new Jet();
        
        mobil.merk = "Avanza";
        pesawat.merk = "Garuda";
        jet.merk = "Cleaner";
        
        System.out.println("Merk Mobil: " + mobil.merk);
        System.out.println("Jenis Kendaraan: ");
        mobil.tampilkanKendaraan();
        
        System.out.println("Merk Pesawat: " + pesawat.merk);
        System.out.println("Jenis Kendaraan: ");
        pesawat.tampilkanKendaraan();
        
        System.out.println("Merk Jet: " + jet.merk);
        System.out.println("Jenis Kendaraan: ");
        jet.tampilkanKendaraan();
    }  
}
