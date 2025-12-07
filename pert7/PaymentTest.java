public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PEMBAYARAN E-WALLET ===");
        System.out.println();

        EWalletPayment gopay = new EWalletPayment("GoPay", 500000, 150000);

        System.out.println("--- DATA SEBELUM TRANSAKSI ---");
        System.out.println(gopay.getPaymentDetails());
        System.out.println("Saldo: Rp " + gopay.getBalance());
        System.out.println();

        System.out.println("--- PROSES PEMBAYARAN ---");
        gopay.processPayment();
        System.out.println();

        System.out.println("--- DATA SETELAH TRANSAKSI ---");
        System.out.println(gopay.getPaymentDetails());
        System.out.println("Saldo: Rp " + gopay.getBalance());
        System.out.println();

        EWalletPayment dana = new EWalletPayment("Dana", 50000, 100000);

        System.out.println("--- DATA SEBELUM TRANSAKSI (DANA) ---");
        System.out.println(dana.getPaymentDetails());
        System.out.println("Saldo: Rp " + dana.getBalance());
        System.out.println();

        System.out.println("--- PROSES PEMBAYARAN (DANA) ---");
        dana.processPayment();
    }
}
