import java.util.Scanner;

public class Ex2 {


	 
		    public static String inverteFrase(String frase){
		      
		            // Array de String com a frase separada por espaços
		            String fraseInvertida = "";
		            // Para cada palavra da frase, inverte a ordem das letras
		            for(int i = frase.length() - 1; i >= 0; i--){ // Percorre a frase de trás pra frente
		                fraseInvertida += frase.charAt(i); // Adiciona a letra na frase invertida
		            }
		            return fraseInvertida; 
		        }
		        public static void main(String[] args) {
		            Scanner teclado = new Scanner(System.in); 
		            System.out.print("Digite uma frase: "); 
		            String frase = teclado.nextLine(); 
		            System.out.println("Frase invertida: " + inverteFrase(frase)); 
		           
		        }
		    }
