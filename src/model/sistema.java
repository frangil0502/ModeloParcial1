/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class sistema {

    private List<mercancia> lstMercancia;

    public sistema() {
        this.lstMercancia = new ArrayList<>();
    }

    public mercancia traerMercancia(String codMercancia) {
        mercancia retorno = null;
        for (mercancia m : lstMercancia) {
            if (m.getCodMercancia().equals(codMercancia)) {
                retorno = m;
            }
        }
        return retorno;
    }

    public List<mercancia> traerMercancia(boolean enOferta) throws NotFoundException {
        List<mercancia> mercanciasEnOferta = new ArrayList<>();

        for (mercancia m : lstMercancia) {
            if (m instanceof producto && enOferta == true) {
                if (((producto) m).isEsDescuentoEn2daUnidad()) {
                    mercanciasEnOferta.add(m);
                }
            } else if (m instanceof servicio && enOferta == true) {
                if (((servicio) m).isEnPromocion()) {
                    mercanciasEnOferta.add(m);
                }

            }

        }

        if (mercanciasEnOferta.isEmpty()) {
            throw new NotFoundException("No se encontraron mercancías en oferta");
        }
        return mercanciasEnOferta;
    }

    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
        boolean retorno = false;
        if (traerMercancia(codMercancia) == null) {
            producto productoNuevo = new producto(producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad, codMercancia);
            retorno = true;
            lstMercancia.add(productoNuevo);
        } else {
            throw new Exception("El producto ya existe");

        }
        return retorno;
    }

    public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception {
        boolean retorno = false;
        if (traerMercancia(codMercancia) == null) {
            servicio servicioNuevo = new servicio(servicio, presupuesto, porcentajeDescuento, enPromocion, codMercancia);
            retorno = true;
            lstMercancia.add(servicioNuevo);
        } else {
            throw new Exception("El servicio ya existe");

        }
        return retorno;
    }

}
