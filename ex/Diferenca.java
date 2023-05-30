package ex;

import java.util.Scanner;

public class Diferenca {
   public void diferencaDeQuatroValores(){
       Scanner sc = new Scanner(System.in);

       int a, b, c, d, e;
       System.out.println("Insira os 4 valores: ");
       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt();
       d = sc.nextInt();
       e = (a*b) - (c*d);
       System.out.println(e);

       sc.close();
   }

}
