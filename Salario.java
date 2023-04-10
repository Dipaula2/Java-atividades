
package Objeto;


public class Salario {
     private int carros;
     private double salarioFixo;
     private double valorCarros;
            
   public Salario(double salarioFixo, double valorCarros) {
    this.salarioFixo = salarioFixo;
    this.valorCarros = valorCarros;
   
}
    
    public void setCarros( int carros){
        this.carros = carros;
    }
    public int getCarros(){
        return carros;
    }
 

    public double getSalarioFixo() {
        return salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double getValorCarros() {
        return valorCarros;
    }
    
    public void setValorCarros(double valorCarros) {
        this.valorCarros = valorCarros;
    }
     
public double reajusteFinal() {
    double reajusteFinal = (this.carros * this.valorCarros) + (500 * this.carros * 0.05);
    return reajusteFinal;
}

     
     public double contaFinal() {
        double contaFinal = this.salarioFixo + reajusteFinal();
                 return contaFinal;
    }
     
     
     
       
    
}
