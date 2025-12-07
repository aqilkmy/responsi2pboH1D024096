class Customer {
    protected String nama;
    protected String idCustomer;
    protected int totalBelanja;

    Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    String getIdCustomer() {
        return this.idCustomer;
    }

    void setTotalBelanja(int totalBelanja) {
        this.totalBelanja = totalBelanja;
    }

    int getTotalBelanja() {
        return this.totalBelanja;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + idCustomer + " | Total Belanja: Rp " + totalBelanja);
    }
}
