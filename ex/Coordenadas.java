package ex;

import java.util.Scanner;

public class Coordenadas {
    // verifica coordenas em um plano cartesiano
    public void calculaCoordenadas ( ) {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    if (x > 0 && y < 0) {
        System.out.println("Q4");
    } else if (x > 0 && y > 0) {
        System.out.println("Q1");
    } else if (x < 0  && y < 0) {
        System.out.println("Q3");
    } else if (x < 0 && y > 0){
        System.out.println("Q2");
    }  else { System.out.println("Origem");
    }     sc.close();

    }

}
