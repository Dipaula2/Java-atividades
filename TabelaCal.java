package Tabela;
 public class TabelaCal {
    private int prato;
    private int sobremesa;
    private int bebida;
    private int caloriasPrato;
    private int caloriasBebidas;
    private int caloriasSobremesa;

    public TabelaCal() {

    }

    public int getPrato() {
        return prato;
    }

    public void setPrato(int prato) {
    this.prato = prato;
    switch (prato) {
        case 1 -> {
            setCaloriasPrato(180);
            System.out.println("Prato Vegetariano - " + getCaloriasPrato() + " calorias");
        }
        case 2 -> {
            setCaloriasPrato(230);
            System.out.println("Prato Peixe - " + getCaloriasPrato() + " calorias");
        }
        case 3 -> {
            setCaloriasPrato(250);
            System.out.println("Prato Frango - " + getCaloriasPrato() + " calorias");
        }
        case 4 -> {
            setCaloriasPrato(350);
            System.out.println("Prato Carne - " + getCaloriasPrato() + " calorias");
        }
        default -> {
            setCaloriasPrato(0);
            
        }
    }
}

    public int getSobremesa() {
        return sobremesa;
    }
public void setSobremesa(int sobremesa) {
    this.sobremesa = sobremesa;
    switch (sobremesa) {
        case 1 -> {
            setCaloriasSobremesa(75);
            System.out.println("Abacaxi - " + getCaloriasSobremesa() + " calorias");
        }
        case 2 -> {
            setCaloriasSobremesa(110);
            System.out.println("Sorvete Diet - " + getCaloriasSobremesa() + " calorias");
        }
        case 3 -> {
            setCaloriasSobremesa(170);
            System.out.println("Mouse Diet - " + getCaloriasSobremesa() + " calorias");
        }
        case 4 -> {
            setCaloriasSobremesa(200);
            System.out.println("Mouse chocolate - " + getCaloriasSobremesa() + " calorias");
        }
        default -> {
            setCaloriasSobremesa(0);
            
        }
    }
}
    
    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
    this.bebida = bebida;
    switch (bebida) {
        case 1 -> {
            setCaloriasBebida(20);
            System.out.println("Cha - " + getCaloriasBebida() + " calorias");
            }
        case 2 -> {
            setCaloriasBebida(70);
            System.out.println("Suco de Laranja - " + getCaloriasBebida() + " calorias");
            }
        case 3 -> {
            setCaloriasBebida(100);
            System.out.println("Suco de Melao - " + getCaloriasBebida() + " calorias");
            }
        case 4 -> {
            setCaloriasBebida(65);
            System.out.println("Refri Diet - " + getCaloriasBebida() + " calorias");
            }
        default -> setCaloriasBebida(0);
    }
}



    public int getCaloriasPrato() {
        return caloriasPrato;
    }

    public void setCaloriasPrato(int caloriasPrato) {
        this.caloriasPrato = caloriasPrato;
    }

    public int getCaloriasBebida() {
        return caloriasBebidas;
    }

    public void setCaloriasBebida(int caloriasBebidas) {
        this.caloriasBebidas = caloriasBebidas;
    }

    public int getCaloriasSobremesa() {
        return caloriasSobremesa;
    }

    public void setCaloriasSobremesa(int caloriasSobremesa) {
        this.caloriasSobremesa = caloriasSobremesa;
    }
    
    public int caloriasTotais() {
        int caloriasTotais = getCaloriasPrato() + getCaloriasBebida() + getCaloriasSobremesa();
        return caloriasTotais;
 
    }
    
   

}
