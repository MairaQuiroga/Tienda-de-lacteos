/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaLacteos;

import javax.swing.JOptionPane;


public class main {
public static void main(String[] args) {
   
    Queso N1=new Queso();
    JOptionPane.showMessageDialog(null, "Queso 1:");
    N1.CapturarDatosCliente();
    N1.MostrarDatosC();
    N1.CapturarDatos();
    N1.MostrarDatos();

    Queso N2=new Queso();
    JOptionPane.showMessageDialog(null, "Queso 2:");
    N2.CapturarDatosCliente();
    N2.MostrarDatosC();
    N2.CapturarDatos();
    N2.MostrarDatos();
  
    Yogurt P1=new Yogurt();
    JOptionPane.showMessageDialog(null, "Yogurt 1");
    P1.CapturarDatosCliente();
    P1.MostrarDatosC();
    P1.CapturarDatos();
    P1.MostrarDatos();
  
    Yogurt P2=new Yogurt();
    JOptionPane.showMessageDialog(null, "Yogurt 2:");
    P2.CapturarDatosCliente();
    P2.MostrarDatosC();
    P2.CapturarDatos();
    P2.MostrarDatos();
}
}
