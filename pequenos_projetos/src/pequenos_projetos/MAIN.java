package pequenos_projetos;

import java.util.Scanner;

import pequenos_projetos.CalculadorHipoteca.CalculadorHipoteca;
import pequenos_projetos.FizzBuzz.FizzBuzz;

public class MAIN {
    
    public static String menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(
            "|-------------Menu-------------| %n" + 
            "[1] - Calculador de Hipoteca %n" +
            "[2] - FizzBuzz %n" + 
            "[0] - Sair %n" + 
            " > ");

        return scanner.nextLine();
        
    }

    public static void main(String[] args) {
        
        while(true){
            System.out.print("\033[H\033[2J"); // Limpa a tela

            String opc = menu();

            if(opc.equals("0")){
                System.out.print("\033[H\033[2J"); // Limpa a tela
                System.out.println("Até logo ;)");
                break;
            }
            else if (opc.equals("1")) {
                //System.out.println("CalculadorHipoteca");
                CalculadorHipoteca.principal();
            }
            else if (opc.equals("2")) {
                //System.out.println("FizzBuzz");
                FizzBuzz.principal();
            }
        }
    }
}
