package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort {

    public void sortSimples( ){
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String[] y = x.split(" ");

        List<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(y[0]));
        numeros.add(Integer.parseInt(y[1]));
        numeros.add(Integer.parseInt(y[2]));

        List<Integer> numerosOrdenados = numeros.stream().sorted().collect(Collectors.toList());

        System.out.println(numerosOrdenados);

        System.out.println(numeros);

        sc.close();
    }
}
