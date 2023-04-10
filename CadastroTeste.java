
package Cadastro;

import java.util.Scanner;


public class CadastroTeste {

   
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
         Cadastro pessoa1 = new Cadastro();
         Cadastro pessoa2 = new Cadastro();
         Cadastro pessoa3 = new Cadastro();
         Cadastro pessoa4 = new Cadastro();
         
         
         
      
        System.out.println("Sexo (M - Masculino, F - Feminino):");
        String sexo1 = scanner.nextLine();
        pessoa1.setSexo(sexo1);

        System.out.println("Cor dos Olhos (A - Azul, V - Verde, C - Castanho, P - Preto):");
        String corOlho1 = scanner.nextLine();
        pessoa1.setCorOlho(corOlho1);

        System.out.println("Cor do Cabelo (L - Loiro, C - Castanho, P - Preto, R - Ruivo):");
        String corCabelo1 = scanner.nextLine();
        pessoa1.setCabelo(corCabelo1);

        System.out.println("Idade :");
        int idade1 = scanner.nextInt();
        pessoa1.setIdade(idade1);

        System.out.println("Salario:");
        double salario1 = scanner.nextDouble();
        pessoa1.setSalario(salario1);
        
        scanner.nextLine(); // Limpa o buffer do Scanner
        
       System.out.println("Sexo (M - Masculino, F - Feminino):");
        String sexo2 = scanner.nextLine();
        pessoa2.setSexo(sexo2);

        System.out.println("Cor dos Olhos (A - Azul, V - Verde, C - Castanho, P - Preto):");
        String corOlho2 = scanner.nextLine();
        pessoa2.setCorOlho(corOlho2);

        System.out.println("Cor do Cabelo (L - Loiro, C - Castanho, P - Preto, R - Ruivo):");
        String corCabelo2 = scanner.nextLine();
        pessoa2.setCabelo(corCabelo2);

        System.out.println("Idade :");
        int idade2 = scanner.nextInt();
        pessoa2.setIdade(idade2);

        System.out.println("Salario:");
        double salario2 = scanner.nextDouble();
        pessoa2.setSalario(salario2);
        
        scanner.nextLine(); // Limpa o buffer do Scanner
       
        System.out.println("Sexo (M - Masculino, F - Feminino):");
        String sexo3 = scanner.nextLine();
        pessoa3.setSexo(sexo3);

        System.out.println("Cor dos Olhos (A - Azul, V - Verde, C - Castanho, P - Preto):");
        String corOlho3 = scanner.nextLine();
        pessoa3.setCorOlho(corOlho3);

        System.out.println("Cor do Cabelo (L - Loiro, C - Castanho, P - Preto, R - Ruivo):");
        String corCabelo3 = scanner.nextLine();
        pessoa3.setCabelo(corCabelo3);

        System.out.println("Idade :");
        int idade3 = scanner.nextInt();
        pessoa3.setIdade(idade3);

        System.out.println("Salario:");
        double salario3 = scanner.nextDouble();
        pessoa3.setSalario(salario3);
        
        scanner.nextLine(); // Limpa o buffer do Scanner
        
        System.out.println("Sexo (M - Masculino, F - Feminino):");
        String sexo4 = scanner.nextLine();
        pessoa4.setSexo(sexo4);

        System.out.println("Cor dos Olhos (A - Azul, V - Verde, C - Castanho, P - Preto):");
        String corOlho4 = scanner.nextLine();
        pessoa4.setCorOlho(corOlho4);

        System.out.println("Cor do Cabelo (L - Loiro, C - Castanho, P - Preto, R - Ruivo):");
        String corCabelo4 = scanner.nextLine();
        pessoa4.setCabelo(corCabelo4);

        System.out.println("Idade :");
        int idade4 = scanner.nextInt();
        pessoa4.setIdade(idade4);

        System.out.println("Salario:");
        double salario4 = scanner.nextDouble();
        pessoa4.setSalario(salario4);

    
               
        System.out.println("Informacoes Pessoa 1: " + pessoa1.toString());
        System.out.println("Informacoes Pessoa 2: " + pessoa2.toString());
        System.out.println("Informacoes Pessoa 3: " + pessoa3.toString());
        System.out.println("Informacoes Pessoa 4: " + pessoa4.toString());
         
                  
    }
       
    
}
