public class Employee {
    private String nama;
    private int gaji;
    private int jamKerja;

    Employee(String nama, int gaji, int jamKerja){
        this.nama = nama;
        this.gaji = gaji;
        this.jamKerja = jamKerja;
    }

    public String getNama(){
        return this.nama;
    }

    public int getJamKerja(){
        return this.jamKerja;
    }

    public void kerja(){
        System.out.println(this.nama + " sedang bekerja dirumah sakit selama " + this.jamKerja + " jam.");
    }
    public void kerja(boolean pemalas){
        if (pemalas) {
            System.out.println(this.nama + " sedang bekerja dirumah sakit malas malasan");
        } else {
            System.out.println(this.nama + " sedang bekerja dirumah sakit dengan sangat rajin");
        }
    }

    public double kalkulasiBonus(){
        return gaji * 0.10;
    }
    

}
