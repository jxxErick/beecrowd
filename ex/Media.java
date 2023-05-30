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
}
