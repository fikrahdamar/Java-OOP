public class App {
    public static void main(String[] args) throws Exception {
       Employee karyawan1 = new Employee("Topek", 3000000, 9);
       Dokter karyawan2 = new Dokter("Peditok", 10000000, 6, "Kardiologi", 10, 100000);
       DokterBedah karyawan3 = new DokterBedah("Damars", 25000000, 5, "Bedah Saraf", 15, 150000, "AB", 96.0);

        //display kerja
        System.out.println("\n");
        karyawan1.kerja();
        karyawan1.kerja(true);
        karyawan2.kerja();
        karyawan3.kerja();

        // display kalkulasi bonus
        System.out.println("\nBonus karyawan 1 : " + karyawan1.kalkulasiBonus());
        System.out.println("Bonus karyawan 2 : " + karyawan2.kalkulasiBonus());
        System.out.println("Bonus karyawan 2 dengan konsultasi : " + karyawan2.kalkulasiBonus(true));
        System.out.println("Bonus karyawan 3 : " + karyawan3.kalkulasiBonus());
        System.out.println("Bonus karyawan 3 dengan konsultasi : " + karyawan3.kalkulasiBonus(true));

        // operasi pada subclass dokterbedah
        System.out.println("\n");
        karyawan3.operasi();
        karyawan3.operasi("papao");
        karyawan3.operasi("piping", true);
        karyawan3.operasi("piping", false);

    }
}
