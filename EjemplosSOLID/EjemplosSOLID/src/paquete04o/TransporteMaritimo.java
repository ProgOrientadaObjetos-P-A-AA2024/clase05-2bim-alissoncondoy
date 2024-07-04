/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author utpl
 */
public class TransporteMaritimo extends Transporte {
    
     private String cooperativaMaritima;
    
    public void establecerCooperativaMaritima(String n) {
        cooperativaMaritima = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 120 + 0.10;
    }

    public String obtenerCooperativaMaritima() {
        return cooperativaMaritima;
    }
    
}


    

