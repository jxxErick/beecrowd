package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaCirculo {

    // 1002 - area do circulo
    public void calculaArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do raio que deseja calcular a area: ");
            double a = sc.nextDouble();
            double b = 3.14159 * (a * a);
            System.out.println("A = " + new DecimalFormat("0.####").format(b));

        sc.close();
    }

    // 1011 - calcula volume
    public void calculaVolume(){
        System.out.println("Qual o raio da esfera que deseja calcular o volume? ");
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double r, v;
        r = sc.nextDouble();
        v = (4.0/3.0) * pi * Math.pow(r, 3);
        System.out.println("Volume: " + new DecimalFormat("#0.###").format(v));
        sc.close();
    }

}
