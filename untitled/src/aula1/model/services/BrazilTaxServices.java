package aula1.model.services;

public class BrazilTaxServices implements TaxServices{

    public double tax(double amount){
        if (amount <= 100){
            return amount * 0.2;
        }else{
            return amount * 0.15;
        }
    }
}
