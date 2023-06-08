package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distancia {

        // Distancia entre dois pontos recebendo x e y e usando a formula estabelecida
    public void distanciaEntreDoisPontos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os primeiros x e y");
        String x = sc.nextLine();
        String[] numeros = x.split(" ");
        double a, b;
        a =  Double.parseDouble(numeros[0]);
        b =  Double.parseDouble(numeros[1]);

        System.out.println("Digite os segundos x e y");
        String x2 = sc.nextLine();
        String[] numeros2 = x2.split(" ");
        double c, d;
        c =  Double.parseDouble(numeros2[0]);
        d =  Double.parseDouble(numeros2[1]);

        double distancia = Math.sqrt(Math.pow(2, (c - a)) + Math.pow(2, (d - b)));
        System.out.print(new DecimalFormat("#0.####").format(distancia));
        sc.close();
    }

    // Distancia de dois carros, calcular o tempo que se leva para um (x) passar o outro (y)

    public void distanciaDeDoisCarrosEmMinutos ( ) {
        System.out.println("Digite a kilometragem que deseja saber ");
        Scanner sc = new Scanner (System.in);
        int distancia  = sc.nextInt();
        int tempoMinutos = distancia * 2;
        System.out.println(tempoMinutos + " minutos");
        sc.close();
    }


}
