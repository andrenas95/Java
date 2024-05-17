package secao03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        //variaveis
        int metros, centimetros;
        Scanner xuxa = new Scanner(System.in);

        //Entradas
        System.out.println(" Informe o valor em metros: ");
        metros = xuxa.nextInt();

        //Processamento
        centimetros = (metros * 100);

        //Saída
        System.out.println(metros + " metros em centímetros é " + centimetros);

        xuxa.close();

    }

}