package ex;

import java.util.Scanner;

public class Cedulas {
    // Cedulas - 1018, conta quantas cedulas tem de cada
    public void contaCedula (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor");
        int valor = sc.nextInt();
        System.out.println(valor);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            System.out.printf("%d nota(s) de %d\n", quantidadeNotas, nota);
            valor %= nota;
        }

        sc.close();
    }

    // 1021 - separa notas e cedulas
    public void contaCedulaEMoeda () {

        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        System.out.println("NOTAS:");
        int notas100 = (int) (valor / 100);
        valor %= 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", notas100);

        int notas50 = (int) (valor / 50);
        valor %= 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", notas50);

        int notas20 = (int) (valor / 20);
        valor %= 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", notas20);

        int notas10 = (int) (valor / 10);
        valor %= 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", notas10);

        int notas5 = (int) (valor / 5);
        valor %= 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", notas5);

        int notas2 = (int) (valor / 2);
        valor %= 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", notas2);

        System.out.println("MOEDAS:");
        int moedas1 = (int) valor;
        valor %= 1;
        System.out.printf("%d moeda(s) de R$ 1.00%n", moedas1);

        int moedas50 = (int) (valor / 0.50);
        valor %= 0.50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas50);

        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedas25);

        int moedas10 = (int) (valor / 0.10);
        valor %= 0.10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedas10);

        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedas5);

        int moedas1cent = (int) (valor / 0.01);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedas1cent);

        sc.close();


        sc.close();
    }


}
