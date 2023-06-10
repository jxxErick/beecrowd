package ex;

import java.util.Scanner;

public class Tempo {

    // 1019 - converter segundos recebidos em tempo formatado
    public void conversaoDeTempo( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que deseja converter: ");
        int n = sc.nextInt();
        int horas = n / 3600;
        int minutos =  (n % 3600) / 60;
        int segundos = n % 60;

        System.out.printf("%d:%02d:%02d%n", horas, minutos, segundos);

        sc.close();
    }

}
