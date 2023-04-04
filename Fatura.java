package main;


public class Fatura {
    public String numero;
    public String descrição;
    public int item;
    public double preço;   
    public double fatura;
    
    
    public Fatura(){
       
    }
    
 public void setNumero(String numero){
  this.numero = numero;
}
public String getNumero(){
  return numero;
}
     public void setDescrição(String descrição){
  this.descrição = descrição;
}
public String getdescrição(){
  return descrição;
}
 public void setItem(int item){
  this.item = item;
}
public int getItem(){
  return item;
}
public void setPreço(Double preço){
  this.preço = preço;
}
public Double getPreço(){
    if(preço <= 0){
        preço = 0;
    }
        return preço;
    
    

} 
 
public void setTotalFatura(Double fatura){
  this.fatura = fatura;
}

public Double  getTotalFatura(){
    if(fatura <= 0){
        fatura = 0;
    }
        return fatura = preço * item;
    
}
  
  
}

