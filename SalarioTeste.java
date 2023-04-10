package Objeto;
import java.util.Scanner;

public class SalarioTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Salario salario1 = new Salario(3000.0, 500.0);
        
        System.out.println("Informe o numero de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        salario1.setCarros(carrosVendidos);
  
        System.out.println("Salario Fixo:");
        System.out.println(salario1.getSalarioFixo());
        System.out.println("Valor de Cada carro vendido:");
        System.out.println(salario1.getValorCarros());
        System.out.println("Salario Final:");
        System.out.println(salario1.contaFinal());
    }
}
