package com.basico;

import java.util.Date;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Arrays;

public class BasicoJava {
    
    public static void main(String[] args) {

        System.out.println("\n/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");

        System.out.println("Hello, World!");

        // Variaveis Primitivas //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Variaveis Primitivas-=-=-=-=-=-=-=-=-=-=-=/"); 

        int idade = 19;        // byte/short/int/long (L)
        double altura = 1.7;   // float (F)/double
        float alturaf = 1.7F;   // float/double
        char letra = 'P';
        boolean top = true;

        System.out.printf("Idade:  %d %n", idade);
        System.out.printf("Altura: %.2f %n", alturaf);
        System.out.printf("Altura: %.2f %n", altura);
        System.out.printf("Letra:  %c %n", letra);
        System.out.printf("Top:    %b %n", top);

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Expressões Aritméticas //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Expressões Aritméticas-=-=-=-=-=-=-=-=-=-=/"); 

        final float PI = 3.14F; // Constante

        double areaCirculo = PI * (Math.pow(5,2));
        System.out.printf("Área do Círculo = %.2f %n", areaCirculo);
        System.out.printf("Metade da Área do Círculo = %.2f %n", areaCirculo/2);


        System.out.printf("%d %n", 3 + 2);
        System.out.printf("%d %n", 5 - 12);
        System.out.printf("%.2f %n", 10 / (float)4);
        System.out.printf("%d  %n", 6 * 3);

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Variaveis por referência //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Variaveis por referência-=-=-=-=-=-=-=-=-=/"); 

        String nome = "Pedro";
        Date hoje = new Date();

        System.out.println(hoje);
        System.out.printf("Nome:   %s %n", nome);

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // String //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=String-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 

        String Ledro = nome.replace("P", "L");
        System.out.println(Ledro);

        System.out.println(nome.toUpperCase());

        System.out.println("\"c:\\Windows\\Pedro\"");

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // IF, ELSE //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=IF, ELSE-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 

        double temperatura = 15;

        if(temperatura > 30) {
            System.out.println("Muito Quente");
        } 
        else if (temperatura > 25 ) {
            System.out.println("Quente");
        } 
        else {
            System.out.println("Hmmmm! Cobertor Gostoso :)");
        }

        double passagem = 10_500;
        String classe = passagem > 5_000 ? "Primeira" : "Economica"; //If de uma linha

        System.out.println("Classe: " + classe);

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Switch Case //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Switch Case=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 

        String user = "admin";

        switch (user) {

            case "admin":
                System.out.println("Você é um usuario administrador!");
                break;

            case "moderador":
                System.out.println("Você é um usuario Moderador!");
                break;

            case "normal":
                System.out.println("Você é um usuario normal!");
                break;

            default:
                System.out.println("Você é um usuario valido!");
        }

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Imput //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Imput=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua idade > ");
            byte idadeB = scanner.nextByte();

            System.out.println("Sua idade é " + idadeB);

            System.out.print("Digite seu nome > ");
            scanner.nextLine(); // "Limpar o buffer"
            String nomeS = scanner.nextLine().trim().toUpperCase();
            
            System.out.println("Sua nome é " + nomeS);
        }

        

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Listas //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Listas-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 

        int[] numeros = new int[5]; // new int[5] /OR/ {1,2,3,4,5}
        int[] numeros2 = {5,6,10,9,1};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i*5;
        }

        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros2);
        System.out.println(Arrays.toString(numeros2));

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Matrizes //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Matrizes-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 

        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //matriz[i][j] = (i+1)*(j+1);
                matriz[i][j] = (int)(Math.random() * 100);
                //System.out.printf("[%d][%d] = %d %n", i, j, matriz[i][j]);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("[%3d]",matriz[i][j]);
            }
            System.out.println("");
        }
        //System.out.println(Arrays.deepToString(matriz));

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // For //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("=-For=-=-=-=-=-=-=-=-=-=-=-");

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                int num = (i + 1) * (j + 1);
                System.out.printf("[%3d]", num);
            }
            System.out.println("");
        }

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // For-Each //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=For-Each-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/"); 
        
        int[] numeros3 = {999, 666, 111, 777, 222};

        for (int numero : numeros3) {
            System.out.println(numero);
        }

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // While //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=-While-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/");
        int ctt = 0;

        while(ctt <= 10) {

            System.out.println(ctt);

            ctt++; //ctt += 1  / ctt = ctt + 1
        }

        /*
        do {

            System.out.println(ctt);

            ctt++;

        } while (ctt <= 10);
        */
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Formatação de numeros //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=Formatação de numeros=-=-=-=-=-=-=-=-=-=-=/");

        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        System.out.println(moeda.format(4513.609)); //R$ 4.513,61

        NumberFormat porcento = NumberFormat.getPercentInstance();
        System.out.println(porcento.format(0.65)); // 65%

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        System.out.println("/=-=-=-=-=-=-=-=-=-=-=-=/");


        System.out.println("\n/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");

    }
}
