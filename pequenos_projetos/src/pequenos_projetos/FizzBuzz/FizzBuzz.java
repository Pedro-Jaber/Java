package pequenos_projetos.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

    private FizzBuzz(){}
    
    public static void principal() {
        System.out.print("\033[H\033[2J"); //Limpa a tela
        System.out.println("|------------FizzBuzz------------|");
        System.out.println("|-1 para sair");
        
        int numero = 0;

        while (numero != -1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Numero > ");
            numero = scanner.nextInt();

            boolean div5 = numero%5 == 0;
            boolean div3 = numero%3 == 0;

            if (div5 && div3)
                System.out.println("FizzBuzz");
            else if (div5)
                System.out.println("Fizz");
            else if (div3)
                System.out.println("Buzz");
            else
                System.out.println(numero);
        }

    }

}   
