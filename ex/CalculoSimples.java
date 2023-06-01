package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.String.format;

public class CalculoSimples {

    // 1010 - Calculo simples
    public void calculoPeca(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informacoes do prod 1");
        String a = sc.nextLine();

        System.out.println("Insira as informacoes do prod 2");
        String b = sc.nextLine();

        String[] valoresProdA = a.split(" ");
        int codProdA = Integer.parseInt(valoresProdA[0]);
        int qtdProdA = Integer.parseInt(valoresProdA[1]);
        double valorProdA = Double.parseDouble(valoresProdA[2]);

        String[] valoresProdB = b.split(" ");
        int codProdB = Integer.parseInt(valoresProdB[0]);
        int qtdProdB = Integer.parseInt(valoresProdB[1]);
        double valorProdB = Double.parseDouble(valoresProdB[2]);

        double total = (valorProdA * qtdProdA) + (valorProdB * qtdProdB);

        System.out.println("VALOR A PAGAR: " +  new DecimalFormat("#0.##").format(total));
        sc.close();

    }

}
