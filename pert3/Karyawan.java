class Karyawan {
    protected String nama;
    protected double gajiPokok;
    
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    
    String getNama() {
        return this.nama;
    }
    
    void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    double getGajiPokok() {
        return this.gajiPokok;
    }
    
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}