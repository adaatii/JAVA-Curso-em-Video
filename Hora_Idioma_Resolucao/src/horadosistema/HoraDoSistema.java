/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author adaatii
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale local = Locale.getDefault();
        local.getDisplayLanguage();
        System.out.print("A linguagem do sistema é: ");
        System.out.println(local.toString());
        
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: "  + d.width + " X "  + d.height);
        
        
    }
    
}
