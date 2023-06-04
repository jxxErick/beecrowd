package ex;

import java.util.Scanner;

public class Maior {

    public void maiorNumero(){
        System.out.println("Digite os numeros: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] numeros = x.split(" ");
        int a, b, c;
        a =  Integer.parseInt(numeros[0]);
        b =  Integer.parseInt(numeros[1]);
        c =  Integer.parseInt(numeros[2]);

        int maior = (a + b + Math.abs(a - b)) / 2;
        int resultado = (maior + c + Math.abs(maior - c)) / 2;

        System.out.println(resultado + " eh o maior");
        sc.close();

    }


}

