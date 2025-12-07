class defaultMesin {
    protected String namaMesin;
    protected int tenagaHP;

    defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }

    void setNamaMesin(String namaMesin) {
        this.namaMesin = namaMesin;
    }

    String getNamaMesin() {
        return this.namaMesin;
    }

    void setTenagaHP(int tenagaHP) {
        this.tenagaHP = tenagaHP;
    }

    int getTenagaHP() {
        return this.tenagaHP;
    }

    void tampilInfo() {
        System.out.println("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    double nilaiPerforma() {
        return tenagaHP * 1.0;
    }

    String kategoriMesin() {
        return "Mesin Umum";
    }
}
