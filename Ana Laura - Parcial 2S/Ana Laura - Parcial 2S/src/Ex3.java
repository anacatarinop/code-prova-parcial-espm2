import java.util.Scanner;

public class Ex3 {


		    public static void main(String[] args) {
		        // a) 
		        Scanner teclado = new Scanner(System.in);
		        System.out.print("Digite a quantidade de cidades: ");
		        int qtdCidades = teclado.nextInt();
		        
		       
		        teclado.nextLine();
		        String[] cidades = new String[qtdCidades]; // Criando o vetor de cidades
		        for (int i = 0; i < qtdCidades; i++) { // Preenchendo o vetor de cidades
		            System.out.print("Digite o nome da cidade " + (i + 1) + ": ");
		            cidades[i] = teclado.nextLine();
		        }
		        
		        // b)
		        int[][] tempos = new int[qtdCidades][qtdCidades]; // Criando a matriz de tempos
		        for (int i = 0; i < qtdCidades; i++) { // Preenchendo a matriz de tempos
		            for (int j = 0; j < qtdCidades; j++) { // Preenchendo a linha da matriz de tempos
		                if (i == j) { // Se for a mesma cidade, o tempo é 0
		                    tempos[i][j] = 0; // Preenchendo a diagonal principal com 0
		                    
		                } else {
		                	
		                    
		                    if (tempos[j][i] != 0) {
		                        tempos[i][j] = tempos[j][i]; 
		                    } else {
		                        tempos[i][j] = gerarTempo(); 
		                    }
		                }
		            }
		        }
		        
		       
		        System.out.println("Matriz de tempos:");
		        for (int i = 0; i < qtdCidades; i++) {
		            for (int j = 0; j < qtdCidades; j++) {
		                System.out.print(tempos[i][j] + " ");
		            }
		            System.out.println();
		        }
		        // c)
		        imprimirTempos(tempos, cidades); 
		        
		        // d)
		        System.out.print("Digite o nome da cidade de origem: ");
		        String origem = teclado.nextLine();
		        
		        System.out.print("Digite o nome da cidade de destino: ");
		        String destino = teclado.nextLine();
		        
		        int origemIndex = -1;// Índice da cidade de origem
		        int destinoIndex = -1; // Índice da cidade de destino
		        for (int i = 0; i < qtdCidades; i++) { // Percorrendo o vetor de cidades
		            if (cidades[i].equals(origem)) { // Se a cidade for a de origem
		                origemIndex = i; // Guardando o índice da cidade de origem
		            }
		            if (cidades[i].equals(destino)) { // Se a cidade for a de destino
		                destinoIndex = i; // Guardando o índice da cidade de destino
		            }
		        }
		        if (origemIndex == -1 || destinoIndex == -1) { // Caso não encontre a cidade
		            System.out.println("\nCidade não encontrada");
		        } else {
		            System.out.println("\nO tempo de voo entre " + origem + " e " + destino + " é de " + tempos[origemIndex][destinoIndex] + " horas");
		        }

		    }

		    public static void imprimirTempos(int[][] tempos, String[] cidades) {
		        System.out.println("\nTempos de voo entre as cidades:");
		        for (int i = 0; i < cidades.length; i++) {                       
		            for (int j = 0; j < cidades.length; j++) { 
		                if (i != j) { 
		                    System.out.println(cidades[i] + " - " + cidades[j] + ": " + tempos[i][j] + " horas"); // Imprimindo o tempo
		                }
		            }
		        }
		    }

		    public static int gerarTempo() {
		        return (int) (Math.random() * 10) + 1; 
		    }
		}
