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
public class Yogurt extends Productos {
   private String Sabor;
       public void Productos(int precio, String color, String variedad, int cantidad) {
        super.Productos(precio, color, variedad, cantidad);
        this.Sabor=Sabor;
       }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public String getSabor() {
        return Sabor;
    }
        public void CapturarDatos() {
        setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor estimado del yogurt")));
        setColor(JOptionPane.showInputDialog(null, "Ingrese el color "));
        setVariedad(JOptionPane.showInputDialog(null, "Ingrese la variedad"));
        setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad ")));
        setSabor(JOptionPane.showInputDialog(null, "Ingrese el color "));
    }

    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null, "El valor unitario del yogurt es: " + getPrecio() + "\nSu color es de: " + getColor() + "\nSu variedad es: " + getVariedad() + "\nLa cantidad deseada fue: " + getCantidad()+"\nSu sabor es de: "+getSabor());
    }
}
