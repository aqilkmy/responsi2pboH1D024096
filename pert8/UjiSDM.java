public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== SISTEM MANAJEMEN SDM ===");
        System.out.println();

        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        System.out.println("--- PERHITUNGAN GAJI ---");
        andi.hitungGaji(160);
        System.out.println();

        System.out.println("--- STATUS CUTI ---");
        System.out.println("Status Cuti: " + andi.getStatusCuti());
        System.out.println();

        System.out.println("--- UJI LOGIN (PIN SALAH) ---");
        andi.login("9999");
        System.out.println();

        System.out.println("--- UJI LOGIN (PIN BENAR) ---");
        andi.login("1234");
        System.out.println();

        System.out.println("--- ROLE AKSES ---");
        System.out.println("Role Akses: " + andi.getRoleAkses());
        System.out.println();

        System.out.println("--- PERPANJANG KONTRAK ---");
        andi.perpanjangKontrak(6);
        System.out.println();

        System.out.println("--- LOGOUT ---");
        andi.logout();
    }
}
