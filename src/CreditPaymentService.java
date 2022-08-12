public class CreditPaymentService {
    public double calculate(int summa, double perYear, int period) {
        double perMonth = (perYear / 12) / 100;
        double payment = summa * (perMonth * Math.pow(1.0 + perMonth, period)) / Math.pow(1.0 + perMonth, period) - 1;
        return payment;
    }
}