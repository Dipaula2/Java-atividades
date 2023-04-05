package Main;


import javax.swing.JOptionPane;


public class EmpregadoTeste {
    
    public static void main(String[] args ){
        
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        
        String nome = JOptionPane.showInputDialog("Digite o Nome do Primeiro Empregado:");
        empregado1.setNome(nome);
        
        String sobreNome = JOptionPane.showInputDialog("Digite o Sobrenome do Primeiro Empregado:");
        empregado1.setSobreNome(sobreNome);
        
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Primeiro Empregado:"));
        empregado1.setSalario(salario);
        
        String nome2 = JOptionPane.showInputDialog("Digite o Nome do Segundo Empregado:");
        empregado2.setNome(nome2);

        String sobreNome2 = JOptionPane.showInputDialog("Digite o Sobrenome do Segundo Empregado:");
        empregado2.setSobreNome(sobreNome2);

        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Segundo Empregado:"));
        empregado2.setSalario(salario2);
 
      


        
        JOptionPane.showMessageDialog(null, "Nome 1: " + empregado1.getNome() + " " + empregado1.getSobreNome()
        + "\nSalario Normal: " + empregado1.getSalario() + "\nSalrio Novo: " + empregado1.getReajuste()
        + "\nNome 2: " + empregado2.getNome() + " " + empregado2.getSobreNome()
        + "\nSalario Normal: " + empregado2.getSalario() + "\nSalrio Novo: " + empregado2.getReajuste());

       
    }
    
    
    
}
