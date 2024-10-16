/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public abstract class mercancia {

    public String getCodMercancia() {
        return codMercancia;
    }

    protected String codMercancia;

    public mercancia(String codMercancia) throws Exception {
        if (codMercancia.length() != 7){
            throw new Exception("No tiene justo 7 caracteres");
        }
        this.codMercancia = codMercancia;
    }

    public abstract double calcularPrecioFinal();

}
