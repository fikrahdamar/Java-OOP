public class Dokter extends Employee {
    private String spesialis;
    private int pengalamanKerja;
    private double biayaKonsultasi;


    Dokter(String nama, int gaji, int jamKerja, String spesialis, int pengalamanKerja, double biayaKonsultasi){
        super(nama, gaji, jamKerja);
        this.spesialis = spesialis;
        this.pengalamanKerja = pengalamanKerja;
        this.biayaKonsultasi = biayaKonsultasi;
    }
    // override
    public void kerja(){
        System.out.println(getNama() + " adalah seorang " + this.spesialis +  " yang sedang bekerja dirumah sakit selama " + getJamKerja() + " jam.");
    }

    // override
    public double kalkulasiBonus(){
        return super.kalkulasiBonus() + (this.pengalamanKerja*100);
    }
    // override dan overloading
    public double kalkulasiBonus(boolean adaBiayaKonsultasi){
        if(adaBiayaKonsultasi){
            return kalkulasiBonus() + (biayaKonsultasi*0.5);
        } 
        return kalkulasiBonus() + (this.pengalamanKerja*100);
    }

}
