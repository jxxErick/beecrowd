package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {
    // 1005 - Media 1
    public void mediaAluno(){
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Qual as notas");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.println("Media: " + new DecimalFormat("0.#####").format(c));
        sc.close();
    }

    // 1006 - Media 2
    public void mediaAlunoDois(){
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Qual as notas");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a <= 10 && b <= 10 && c <= 10) {
            d = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.println("Media: " + new DecimalFormat("0.#####").format(d));
        }
            else {
                System.out.println("As notas devem ser menores que 10.");
        }
        sc.close();
    }

    // 1040 - media 3

    public void mediaCompleta () {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira as notas: ");

    String numeros = sc.nextLine();
    String numero[] = numeros.split(" ");

    // notas com peso

    double nUm = Double.parseDouble(numero[0]) * 2;
    double nDois = Double.parseDouble(numero[1]) * 3;
    double nTres = Double.parseDouble(numero[2]) * 4;
    double nQuatro = Double.parseDouble(numero[3]);

    // media
    double media = (nUm + nDois + nTres + nQuatro) / 10;


    System.out.println("Media: " + new DecimalFormat("0.#").format(media));
    if (media <= 7 && media >= 5) {
        System.out.println("Aluno em exame");
        System.out.println("Insira a nota do Exame: ");
        double nCinco = Double.parseDouble(sc.next());

        System.out.println("Nota do exame: " + nCinco);
        double mediaComExame = (media + nCinco) / 2;

        if (mediaComExame >= 5){
            System.out.println("Aluno Aprovado");
            System.out.println("Media final: " + new DecimalFormat("0.#").format(mediaComExame));

        }  else {
            System.out.println("Media: " + new DecimalFormat("0.#").format(mediaComExame));
            System.out.println("Aluno reprovado! ");

        }
    } else if (media >= 7){
        System.out.println("Media: " + new DecimalFormat("0.#").format(media));
        System.out.println("Aluno Aprovado");

    } else {
        System.out.println("Media: " + new DecimalFormat("0.#").format(media));
        System.out.println("Aluno reprovado! ");

    }

    sc.close();
    }
}
