class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] mesinArray = new defaultMesin[5];

        mesinArray[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesinArray[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesinArray[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesinArray[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesinArray[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin mesin : mesinArray) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa: " + mesin.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin mesin : mesinArray) {
            if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }

        System.out.println();
        System.out.println("=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin mesinTerbaik = mesinArray[0];
        double performaTertinggi = mesinArray[0].nilaiPerforma();
        
        for (defaultMesin mesin : mesinArray) {
            if (mesin.nilaiPerforma() > performaTertinggi) {
                performaTertinggi = mesin.nilaiPerforma();
                mesinTerbaik = mesin;
            }
        }
        
        mesinTerbaik.tampilInfo();
        System.out.println("Performa: " + performaTertinggi);

        System.out.println();
        System.out.println("=== TOP 3 MESIN TERBAIK ===");
        
        for (int i = 0; i < mesinArray.length - 1; i++) {
            for (int j = 0; j < mesinArray.length - i - 1; j++) {
                if (mesinArray[j].nilaiPerforma() < mesinArray[j + 1].nilaiPerforma()) {
                    defaultMesin temp = mesinArray[j];
                    mesinArray[j] = mesinArray[j + 1];
                    mesinArray[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + mesinArray[i].getNamaMesin() + " - Performa: " + mesinArray[i].nilaiPerforma());
        }
    }
}
