class Member extends Customer {
    private int poinReward;
    private String level;

    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.level = level;
    }

    void setPoinReward(int poinReward) {
        this.poinReward = poinReward;
    }

    int getPoinReward() {
        return this.poinReward;
    }

    void setLevel(String level) {
        this.level = level;
    }

    String getLevel() {
        return this.level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}
