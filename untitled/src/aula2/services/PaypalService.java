package aula2.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amonth){
        return amonth * 0.02;
    }

    @Override
    public double interest(double amonth, int months){
        return amonth * 0.01 * months;
    }
}
