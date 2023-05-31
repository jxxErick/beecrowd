package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.String.format;

public class Salario {

    public void calcularSalario(){
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Insira o numero do funcionário, horas trabalhadas e ganho por hora respectivamente: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = b * c;
        System.out.println("Number: " + a );
        System.out.println("Salary: U$ " + new DecimalFormat("0.##").format(d) );
        sc.close();
    }

    public void calcularSalarioComBonus(){
        Scanner sc = new Scanner(System.in);
        double b, c, d;
        String a;
        System.out.println("Insira o nome do funcionário, salario e vendas: ");
        a = sc.nextLine();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = b + (c*0.15);
        System.out.println(a);
        System.out.println("Salary: U$ " + new DecimalFormat("0.##").format(d) );
        sc.close();
    }


}
