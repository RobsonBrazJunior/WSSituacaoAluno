package negocio;

import java.io.Serializable;

public class Nota implements Serializable {
    private float valor;
    private int peso;
    
    public float getValor() {
        return valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
