public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditProgram = new CreditPaymentService();

        double payment = creditProgram.calculate(1000000, 9.99, 12);
        System.out.println(Math.round(payment));

        double payment2 = creditProgram.calculate(1000000, 9.99, 24);
        System.out.println(Math.round(payment2));

        double payment3 = creditProgram.calculate(1000000, 9.99, 36);
        System.out.println(Math.round(payment3));
    }


}