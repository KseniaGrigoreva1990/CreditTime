public class CreditPaymentService {
    public int calculate(int summa, double perYear, int period) {


        double perMonth = (perYear /100) /  12;  //процент в месяц
        //разбила формулу на части для простоты
        double y = 1 + perMonth;
        double x = Math.pow(y, period);
        double payment = summa * (perMonth * x) / x - 1;
        return (int) payment;
    }
}

