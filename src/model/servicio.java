/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class servicio extends mercancia {

    private String servicio;
    private double presupuesto;
    private double porcentajeDescuento;
    private boolean enPromocion;

    public servicio(String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion, String codMercancia) throws Exception {
        super(codMercancia);
        this.servicio = servicio;
        this.presupuesto = presupuesto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }

    @Override
    public double calcularPrecioFinal() {
        double retorno = this.presupuesto;
        if (this.enPromocion) {
            double descuento = this.porcentajeDescuento * this.presupuesto / 100;
            retorno = this.presupuesto - descuento;
        }
        return retorno;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    @Override
    public String toString() {
        return "servicio{" + "servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }

}
