
package main;
 
import java.util.Scanner;
import javax.swing.JOptionPane;




public class FaturaTeste {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Fatura fatura1 = new Fatura();
        
        //System.out.println("Digite o número do Item: ");
        //String numero = sc.nextLine();
        //fatura1.setNumero(numero);
        
        //System.out.println("Digite a descrição do Item: ");
        //String descrição = sc.nextLine();
        //fatura1.setDescrição(descrição);
        
        //System.out.println("Digite a quantidade de Itens:");
        //int item = sc.nextInt();
        //fatura1.setItem(item);
        
        //System.out.println("Digite o preço dos Itens:");
        //double preço = sc.nextDouble();
        //fatura1.setPreço(preço);
 
        
        
        //System.out.println(fatura1.getNumero());
        //System.out.println(fatura1.getdescrição());
        //System.out.println(fatura1.getItem());
        //System.out.println(fatura1.getPreço());
        
        
        //System.out.println("Total da Fatura:");
        //System.out.println("" +fatura1.getTotalFatura());
        
        
        
        
        String numero = JOptionPane.showInputDialog("Digite o número do item:");
        fatura1.setNumero(numero);
        
        String descrição = JOptionPane.showInputDialog("Digite a descrição do item:");
        fatura1.setDescrição(descrição);
        
        int item = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item:"));
        fatura1.setItem(item);
        
        double preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item:"));
        fatura1.setPreço(preço);
        

JOptionPane.showMessageDialog(null, "Número do Item: " + fatura1.getNumero()
        + "\nDescrição: " + fatura1.getdescrição()
        + "\nQuantidade do Item: " + fatura1.getItem()
        + "\nPreço do Item: " + fatura1.getPreço()
        + "\nFatura:" + fatura1.getTotalFatura()); 
        
        
    }
    
}
