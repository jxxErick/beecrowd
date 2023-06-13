package ex;

import java.util.Scanner;

public class TesteDeSelecao {

    // 1035 - Testando valores
    public void testeDeValores (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores: ");
        String numeros = sc.nextLine();
        String [] numerosEmArray = numeros.split(" ");
        int a = Integer.parseInt(numerosEmArray[0]);
        int b = Integer.parseInt(numerosEmArray[1]);
        int c = Integer.parseInt(numerosEmArray[2]);
        int d = Integer.parseInt(numerosEmArray[3]);

            if ( b > c && d > a && (c + d) > (a + b) && c >= 0 && d >= 0 && a%2 == 0){
                System.out.println("Valores aceitos! ");
            } else {
                System.out.println("Valores nao aceitos! ");
            }

        sc.close();
    }

}
