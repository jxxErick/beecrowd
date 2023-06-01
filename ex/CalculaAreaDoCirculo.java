package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaAreaDoCirculo {

    // 1002 - area do circulo
    public void calculaArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do raio que deseja calcular a area: ");
            double a = sc.nextDouble();
            double b = 3.14159 * (a * a);
            System.out.println("A = " + new DecimalFormat("0.####").format(b));

        sc.close();
    }


}
