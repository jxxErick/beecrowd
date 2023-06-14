package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Bhaskara {

    public void formulaDeBhaskara( ){
        System.out.println("Insira os valores de a b e c: ");
        Scanner sc = new Scanner(System.in);
        String numeros = sc.nextLine();
        String[ ] numero = numeros.split(" ");
        double a, b, c;
        a = Double.parseDouble(numero[0]);
        b = Double.parseDouble(numero[1]);
        c = Double.parseDouble(numero[2]);

        double delta = Math.pow(b, 2) - (4*a *c);

        if (Math.sign ){
            double primeiroResultado = ((- b) + Math.sqrt(delta)) / (2 * a);
            double segundoResultado = ((- b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + new DecimalFormat("0.#####").format(primeiroResultado));
            System.out.println("R2 = " + new DecimalFormat("0.#####").format(segundoResultado));

        } else {

            System.out.println("Impossivel Calcular! ");

        }
    }

}
