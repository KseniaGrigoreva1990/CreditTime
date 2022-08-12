public class Main {
    public static void main(String[] args) {
        CreditPaymentService program = new CreditPaymentService();

        double payment = program.calculate(1000000, 9.99, 12);
        System.out.println(Math.round(payment));

        double payment2 = program.calculate(1000000, 9.99, 24);
        System.out.println(Math.round(payment2));

        double payment3 = program.calculate(1000000, 9.99, 36);
        System.out.println(Math.round(payment3));
    }


}