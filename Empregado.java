package Main;


public class Empregado {

    public String nome;
    public String sobreNome;
    public Double salario;
    public Double salarioNovo;
    
    
    public Empregado(){
        
    }
  
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }
    
    public String getSobreNome(){
        return sobreNome;
    }
    
    public void setSalario(Double salario){
        if (salario <= 0) {
             System.out.println("Salario negativo nao pode");
             System.exit(0);
        }
        this.salario = salario;

    }
    
    public Double getSalario(){
        
        return salario;
    }
  
     public void setReajuste(Double salarioNovo){
        if(salarioNovo <= 0.0){
            salarioNovo = 0.0;
        }
        this.salario = salarioNovo * 1.1;
    }
    
    public Double getReajuste(){
        return salario * 1.1;
    }
           
   
   
}
