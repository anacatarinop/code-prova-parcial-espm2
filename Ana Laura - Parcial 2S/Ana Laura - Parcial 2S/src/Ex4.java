import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		        // a) 
		        Scanner teclado = new Scanner(System.in);
		        
		        System.out.print("Informe a quantidade de modelos diferentes de aparelhos de TV que serão produzidos: ");
		        int qtdModelos = teclado.nextInt();
		        
		        int[] qtdValvulas = new int[qtdModelos];
		        int[] qtdAltoFalantes = new int[qtdModelos]; 
		        for (int i = 0; i < qtdModelos; i++) { 
		            
		        	System.out.print("Informe a quantidade de válvulas do modelo " + (i + 1) + ": ");
		            qtdValvulas[i] = teclado.nextInt(); 
		            
		            System.out.print("Informe a quantidade de alto falantes do modelo " + (i + 1) + ": ");
		            qtdAltoFalantes[i] = teclado.nextInt(); 
		        }
		        // b)
		        System.out.print("\nInforme a quantidade de meses que serão utilizados na estimativa: ");
		        int qtdMeses = teclado.nextInt(); 
		        int[][] qtdAparelhos = new int[qtdMeses][qtdModelos];
		        for (int i = 0; i < qtdMeses; i++) { 
		            for (int j = 0; j < qtdModelos; j++) { 
		                System.out.print("Informe a quantidade de aparelhos do modelo " + (j + 1) + " do mês " + (i + 1) + ": ");
		                qtdAparelhos[i][j] = teclado.nextInt(); 
		            }
		        }
		        // c)
		        for (int i = 0; i < qtdMeses; i++) {
		            int qtdValvulasMes = 0;
		            int qtdAltoFalantesMes = 0; 
		            for (int j = 0; j < qtdModelos; j++) { 
		                qtdValvulasMes += qtdValvulas[j] * qtdAparelhos[i][j]; 
		                qtdAltoFalantesMes += qtdAltoFalantes[j] * qtdAparelhos[i][j]; 
		            }
		            System.out.println("Mês " + (i + 1) + ": " + qtdValvulasMes + " válvulas e " + qtdAltoFalantesMes + " alto falantes");
		        }

	}
}



