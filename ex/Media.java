package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

    public void mediaAluno(){
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Qual as notas");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.println("Media: " + new DecimalFormat("0.#####").format(c));
        sc.close();
    }
    public void mediaAlunoDois(){
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Qual as notas");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a <= 10 && b <= 10 && c <= 10) {
            d = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.println("Media: " + new DecimalFormat("0.#####").format(d));
        }
            else {
                System.out.println("As notas devem ser menores que 10.");
        }
        sc.close();
    }
}
