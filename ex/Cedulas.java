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
}
