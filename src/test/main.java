/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.List;
import model.producto;
import model.servicio;
import model.sistema;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try{
       // System.out.println("1-1");
        //servicio NuevoServicio1_1 = new servicio("Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true, "897323");
        //System.out.println("1-2");
        //servicio NuevoServicio1_2 = new servicio("Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true, "8973231");  
        System.out.println("1-4");
        producto NuevoProducto1_4 = new producto("Manguera de desagote lavarropa", 650.0, 15.0, true, "4325971");
        System.out.println("1-3");
        producto NuevoProducto1_3 = new producto("Manguera de desagote lavarropa", 650.0, 15.0, true, "432597");
        
        }catch(Exception e){
        System.out.println(e.getMessage());  
        }
        
        try{
        System.out.println("2-1");
        servicio Servicio2_1 = new servicio("Mantenimiento máquina de cortar pasto", 2500.0, 0.0, true, "4325971");
        producto Producto2_2 = new producto("manguera de desagote lavarropa", 650.0, 15.0, true, "4325971");
        double precioFinalServicio = Servicio2_1.calcularPrecioFinal();
        double precioFinalProducto = Producto2_2.calcularPrecioFinal();
        System.out.println("Precio final del servicio: " + precioFinalServicio);
        System.out.println("Precio final del producto: " + precioFinalProducto);
        } catch(Exception e){
        System.out.println(e.getMessage());
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        sistema NuevoSistema = new sistema();
        System.out.println("3-1");
        try{
        NuevoSistema.agregarProducto("3892871", "Aceite para máquinas", 430.0, 10.0, true);
        NuevoSistema.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0.0, true);
        NuevoSistema.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
        NuevoSistema.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 0.0, false);
        
        
        System.out.println("se agrego el prducto");
        System.out.println("3-2");
        //NuevoSistema.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0.0, true);
        System.out.println("3-3");
        NuevoSistema.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("4");
        try{
        List listaDescuento = NuevoSistema.traerMercancia(true);
        for(Object s: listaDescuento){
            System.out.println(s.toString());
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    
    }
    
}
