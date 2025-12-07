class mesinMotor extends defaultMesin {
    private String tipeMotor;

    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    void setTipeMotor(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }

    String getTipeMotor() {
        return this.tipeMotor;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
