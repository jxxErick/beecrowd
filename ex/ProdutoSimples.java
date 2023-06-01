package ex;

import java.util.Scanner;

public class ProdutoSimples {

    //1004 - Produto Simples
    public int mp (){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quais numeros deseja multiplicar? ");
        a = sc.nextInt();
        b = sc.nextInt();
        return a * b;

    }
}
