package aula2.aplication;

import aula2.entities.Contract;
import aula2.entities.Installment;
import aula2.services.ContratService;
import aula2.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        ContratService contratService = new ContratService(new PaypalService());
        contratService.processContract(obj, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getList()){
            System.out.println(installment);
        }

        sc.close();
    }
}
