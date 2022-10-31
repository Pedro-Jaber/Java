package pequenos_projetos.CalculadorHipoteca;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculadorHipoteca {

    private CalculadorHipoteca(){}

    public static void principal() {
    

        final byte MESES = 12;
        final byte PORCENTO = 100;
        
        double pagaMensal;
        double emprestimo = 0;
        float taxaAnual = 0;
        int anos = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); //Limpa a tela
        System.out.println("|-Calculador de Hipoteca (USA)-|");
        System.out.println("| 0 para sair");


        while(true) {
            System.out.print("Valor do Emprestimo > ");
            emprestimo = scanner.nextDouble();
            if(emprestimo >= 1000 && emprestimo <= 1_000_000 || emprestimo == 0)
                break;
            System.out.println("ERRO: O valor deve ser entre R$1K e R$1M");
        }
        if(emprestimo != 0){
        
            while(true) {
                System.out.print("Taxa anual (%)> ");
                taxaAnual = scanner.nextFloat();
                if(taxaAnual > 0 && taxaAnual <= 30)
                    break;
                System.out.println("ERRO: O valor deve ser > 0 e <= 30");
            } 
            
            while(true) {
                System.out.print("Tempo de pagamento (anos) > ");
                anos = scanner.nextInt();
                if(anos >= 1 && anos <= 30)
                    break;
                System.out.println("ERRO: O valor deve ser entre 1 e 30");
            } 
        

            double taxaMensal = (taxaAnual / PORCENTO) / MESES;
            int meses = anos * MESES;
            

            double umMaisR = 1 + taxaMensal;
            double divpart1 = (taxaMensal * Math.pow(umMaisR, meses));
            double divpart2 = (Math.pow(umMaisR, meses) - 1);

            pagaMensal = emprestimo * (divpart1/divpart2);

            NumberFormat moeda = NumberFormat.getCurrencyInstance();
            System.out.printf("%nHipoteca: %s %n", moeda.format(pagaMensal));

            System.out.printf("%nENTER para sair ");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}