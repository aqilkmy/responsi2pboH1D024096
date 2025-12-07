public class EWalletPayment implements PaymentMethod {
    private String providerName;
    private double saldo;
    private double nominalTransaksi;

    public EWalletPayment(String providerName, double saldo, double nominalTransaksi) {
        this.providerName = providerName;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNominalTransaksi() {
        return nominalTransaksi;
    }

    public void setNominalTransaksi(double nominalTransaksi) {
        this.nominalTransaksi = nominalTransaksi;
    }

    @Override
    public void processPayment() {
        double totalBiaya = nominalTransaksi + getTransactionFee();
        if (saldo >= totalBiaya) {
            saldo -= totalBiaya;
            System.out.println("Pembayaran berhasil!");
            System.out.println("Total yang dibayar: Rp " + totalBiaya);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak mencukupi.");
            System.out.println("Saldo saat ini: Rp " + saldo);
            System.out.println("Total yang dibutuhkan: Rp " + totalBiaya);
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Provider: " + providerName + " | Nominal Transaksi: Rp " + nominalTransaksi + " | Biaya Admin: Rp " + getTransactionFee();
    }

    @Override
    public double getTransactionFee() {
        return nominalTransaksi * 0.01;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
