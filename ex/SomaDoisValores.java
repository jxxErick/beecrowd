package ex;

import java.util.Scanner;

public class SomaDoisValores {

    public void soma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva os valores a serem somados");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("x = " + c);
        sc.close();
    }
}
