package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {
    // 1014 Calcule o consumo médio de um automóvel sendo fornecidos a distância total
    // percorrida (em Km) e o total de combustível gasto (em litros).

    public void calculaConsumo(){

        System.out.println("Digite a distancia total percorrida em KM e o total de combustível gasto");
        Scanner sc = new Scanner(System.in);

        int distaciaTotal = sc.nextInt();
        double combustivel = sc.nextDouble();
        double consumoMedio = distaciaTotal / combustivel;

        System.out.println(new DecimalFormat("#0.###").format(consumoMedio));


        sc.close();

    }
}
