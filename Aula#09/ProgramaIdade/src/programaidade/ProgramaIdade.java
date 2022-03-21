/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author adaatii
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        System.out.println("Em que ano você nasceu ?");
        int nasc = s.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Sua idade é: " + idade);
        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
