/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class producto extends mercancia {
    
    private String producto;
    private double precioProducto;
    private double porcentajeDescuento;
    private boolean esDescuentoEn2daUnidad;

    public producto(String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad, String codMercancia) throws Exception {
        super(codMercancia);
        this.producto = producto;
        this.precioProducto = precioProducto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

   
    @Override
    public double calcularPrecioFinal() {
        double retorno = this.precioProducto;
        if(this.esDescuentoEn2daUnidad){
            double descuento = (this.porcentajeDescuento / 2) * this.precioProducto / 100;
            retorno = this.precioProducto - descuento;
        }else{
        double descuento = this.porcentajeDescuento * this.precioProducto / 100;
        retorno = this.precioProducto - descuento;
        }
        return retorno;
    
    }

    public boolean isEsDescuentoEn2daUnidad() {
        return esDescuentoEn2daUnidad;
    }

    @Override
    public String toString() {
        return "producto{" + "producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento=" + porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + '}';
    }
    
}
