package ex;

import java.util.Scanner;

public class SomaDoisValores {

    // 1001 - Soma basica
    public void soma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva os valores a serem somados");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("x = " + c);
        sc.close();
    }
    // 1003 - Soma simples
    public int somaSimples (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva os valores a serem somados");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }
}
