/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuadradoATV;

/**
 *
 * @author SENAI
 */
public class Quadrado {

    private int Lados;

    public Quadrado(int Lados) {
        this.Lados = Lados;
    }

    

    public int getLado() {

        return Lados;
    }
    
    public void setLado(int Lados){
      this.Lados = Lados;
    }
    
    public int CalculaArea(){
     return Lados * Lados;
    }

}
