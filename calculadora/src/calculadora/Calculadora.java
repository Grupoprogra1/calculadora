/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author diegofelix
 */
public interface Calculadora {
    
    public void setString(String linea);
    
    public void meterVector();
    
    public boolean calcularVector();
    
    public int getResultado();
}
