/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaLacteos;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO 11
 */
public class Productos {

   private int precio;
   private String color;
   private String variedad;
   private int cantidad;
   private String NombreCliente;
   private int Identificacion;
   
    public void Productos(int precio, String color, String variedad, int cantidad) {
        this.setPrecio(precio);
        this.setColor(color);
        this.setVariedad(variedad);
        this.setCantidad(cantidad);
    }

    public void CapturarDatosCliente() {
        setNombreCliente(JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario"));
        setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de identificación ")));
    }

    public void MostrarDatosC() {
    JOptionPane.showMessageDialog(null, "El cliente es:"+getNombreCliente()+"\nSu identificación es:"+getIdentificacion());
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

}
