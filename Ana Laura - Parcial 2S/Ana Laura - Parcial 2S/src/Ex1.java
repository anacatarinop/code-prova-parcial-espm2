import java.util.Scanner;

public class Ex1 {

		
		    // a)
		    public static void preencheVetor(int[] vetor){
		        Scanner teclado = new Scanner(System.in);
		        for(int i = 0; i < vetor.length; i++){
		            System.out.print("Digite o valor da posição " + i + ": ");
		            vetor[i] = teclado.nextInt();
		        }
		    }
		    // b)
		    public static int contaRepeticoes(int[] vetor1, int[] vetor2){
		        int cont = 0;
		        for(int i = 0; i < vetor2.length; i++){
		            if(vetor1[0] == vetor2[i]){
		                cont++;
		            }
		        }
		        return cont;
		    }
		    // main
		    public static void main(String[] args){
		        int[] vetor1 = new int[5];
		        int[] vetor2 = new int[5];
		        System.out.println("\nPreenchendo o primeiro vetor: ");
		        preencheVetor(vetor1);
		        
		        System.out.println("\nPreenchendo o segundo vetor: ");
		        preencheVetor(vetor2);
		       
		        System.out.println("\nO número " + vetor1[0] + " armazenado na primeira posição do primeiro vetor se repete " + contaRepeticoes(vetor1, vetor2) + " vezes no segundo vetor.");
		    }
		}
		

	


