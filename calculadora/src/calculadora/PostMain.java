/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import javax.swing.*;
/**
 *
 * @author DiegoJossué
 */
public class PostMain {
    public static void main(String[] args) {
        boolean validez;
        Calculadora calc=new driver();
        String op;
        int resultado;
        JOptionPane.showMessageDialog(null, "Bienvenido a Calculadora Postfix");
        Object[] possibleValues = { "Hacer una Operación", "Salir" };
        Object selected="";
        while(selected!="Salir"){
            selected=JOptionPane.showInputDialog(null, "Seleccione operación a realizar:", "Calculadora Postfix",JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
            if(selected=="Hacer una Operación"){
                op=JOptionPane.showInputDialog("Ingrese la operación en notación postfix");
                calc.meterVector();
                calc.setString(op);
                validez=calc.calcularVector();
                if(validez==true){
                    try{
                    resultado=calc.getResultado();
                    JOptionPane.showMessageDialog(null, "El resultado es: \n"+resultado);
                    }catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"No puede ingresar una cadena vacia");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Operación no valida");
                }
                
            }
        }
    }
}
