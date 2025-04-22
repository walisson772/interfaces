package exercicio.aplication;

import exercicio.entities.Produtos;
import exercicio.service.Pagamento;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        Pagamento is = new Produtos(nome, quantidade, valor);
        System.out.println("Valor a ser pago: "+ String.format("%.2f",is.pagar()));

        sc.close();
    }
}
