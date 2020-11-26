/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EmpresaLacteos;

import javax.swing.JOptionPane;

public class Queso extends Productos {

    String empaque;

    public void Productos(int precio, String color, String variedad, int cantidad) {
        super.Productos(precio, color, variedad, cantidad);
        this.empaque = empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void CapturarDatos() {
        setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor estimado del queso")));
        setColor(JOptionPane.showInputDialog(null, "Ingrese el color "));
        setVariedad(JOptionPane.showInputDialog(null, "Ingrese la variedad"));
        setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad ")));
        setEmpaque(JOptionPane.showInputDialog(null, "Ingrese el empaque que desea"));
       
    }

    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null, "El valor unitario del queso es: " + getPrecio() + "\nSu color es de: " + getColor() + "\nSu variedad es: " + getVariedad() + "\nLa cantidad deseada fue: " + getCantidad()+"\nEl empaque deseado fue: "+getEmpaque());
    }
}
