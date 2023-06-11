package ex;

import java.util.Scanner;

public class Idade {

    public void idadeEmTempo(    ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dias: ");
        int dias = sc.nextInt();
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;

        System.out.println(anos + " anos (s)");
        System.out.println(meses + " mes (es)");
        System.out.println(dias + " dia(s)");
        sc.close();
    }

}
