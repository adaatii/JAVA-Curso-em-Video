/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author adaatii
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota:");
        float n1 = obj.nextFloat();
        System.out.println("Digite o valor da segunda nota: ");
        float n2 = obj.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if(m > 9){
            System.out.println("Parabéns");
        }else{
            System.out.println("Não foi dessa vez que sua nota foi maior que 9");
        }
    }
    
}
