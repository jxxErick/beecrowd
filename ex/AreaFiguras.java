package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaFiguras {

    // 1011 - pede para criar algo que calcule a area de algumas figuras

    public void calculaArea (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informacoes");
        String x = sc.nextLine();

        String[] valores = x.split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        // a) area do triangulo retangulo
        double triangulo = (a * c) / 2;
        // b) area do circulo
        double circulo = 3.14159 * (c * c);
        // c) area do trapezio
        double trapezio = ((a + b) * c) / 2;
        // d) area do quadrado
        double quadrado = b * b;
        // e) area do retangulo
        double retangulo = a * b;

        System.out.println("Triangulo: " + new DecimalFormat("#0.###").format(triangulo));
        System.out.println("Circulo: " + new DecimalFormat("#0.###").format(circulo));
        System.out.println("Trapezio: " + new DecimalFormat("#0.###").format(trapezio));
        System.out.println("Quadrado: " + new DecimalFormat("#0.###").format(quadrado));
        System.out.println("Retangulo: " + new DecimalFormat("#0.###").format(retangulo));

        sc.close();

    }

}
