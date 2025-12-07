class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai;

    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    void setKapasitasBaterai(double kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    double getKapasitasBaterai() {
        return this.kapasitasBaterai;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Baterai: " + kapasitasBaterai + " kWh | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}
