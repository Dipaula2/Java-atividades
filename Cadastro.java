
package Cadastro;


public class Cadastro {
    
    private String sexo;
    private String cabelo;
    private String corOlho;
    private int idade;
    private double salario;
    
    public Cadastro() {
       
    }
   

 public void setCabelo(String cabelo) {
        switch (cabelo.toLowerCase()) {
            case "l":
                this.cabelo = "loiro";
                break;
            case "c":
                this.cabelo = "castanho";
                break;
            case "p":
                this.cabelo = "preto";
                break;
            case "r":
                this.cabelo = "ruivo";
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }

   
    
    // Essa parte de cima eu tive que pesquisar pq eu não sabia Fazer isso em Java
    

    public String getCabelo() {
        return cabelo;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        switch (corOlho.toLowerCase()) {
            case "a":
                this.corOlho = "Azul";
                break;
            case "v":
                this.corOlho = "Verde";
                break;
            case "p":
                this.corOlho = "Preto";
                break;
            case "c":
                this.corOlho = "Castanhos";
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }

    public int getIdade() {
        
        return idade;
    }

    public void setIdade(int idade) {
       if (idade >= 10 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Idade Invalida.");
            this.idade = 18;
        }
    }

    public double getSalario() {
        
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Nao pode ser negativo.");
            this.salario = 0;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        switch (sexo.toLowerCase()) {
            case "m":
                this.sexo = "Masculino";
                break;
            case "f":
                this.sexo = "Feminino";
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
    
    @Override
    public String toString() {
        return "Sexo: " + sexo + ", Cor dos olhos: " + corOlho + ", Cor do cabelo: " + cabelo +
               ", Idade: " + idade + " anos, Salario: " + salario;
    }
   
}
