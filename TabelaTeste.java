
package Tabela;

import java.util.Scanner;


public class TabelaTeste {

    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
         TabelaCal cliente1 = new TabelaCal();
         
         
       System.out.println("Pratos: 1 - vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne;");
       int prato = scanner.nextInt();
       cliente1.setPrato(prato);
       
       System.out.println("Sobremesa: 1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet, 4 - Mouse chocolate;");
       int sobremesa = scanner.nextInt();
       cliente1.setSobremesa(sobremesa);
       
       System.out.println("Bebida: 1 - Cha, 2 - Suco de laranja, 3 - Suco de melao, 4 -1 Refrigerante diet;");
       int bebida = scanner.nextInt();
       cliente1.setBebida(bebida);
        
         System.out.println("Caloreias Totais :");
         System.out.println(cliente1.caloriasTotais());
        
    }
   
}
