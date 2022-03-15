package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author adaatii
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Saída de Dados 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é %.1f\n",nome, nota);
        System.out.format("A nota de %s é %.1f\n",nome, nota);
    }
    
}
