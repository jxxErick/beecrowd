package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche {

    // Lanche - Basicamente, analise o codigo de uma determinada tabela de preço, e retorna o lanche em especifico
    // multiplicado pela quantidade, iniciei o array com 0 pra anular a posição 0
    public void calculaLanche () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo dos lanches: ");
        String codigos = sc.nextLine();
        String codigo[] = codigos.split(" ");

        int cod1 = Integer.parseInt(codigo[0]);
        int quantidade = Integer.parseInt(codigo[1]);

        double valores[] = {0.00, 4.00 , 4.50, 5.00, 2.00, 1.50};
        double total = valores[cod1] * quantidade;

        System.out.println("Total: R$ " + new DecimalFormat("0.##").format(total));
        sc.close();
    }
}
