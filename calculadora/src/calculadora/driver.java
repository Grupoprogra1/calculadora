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
public class driver implements Calculadora{
    String operacion="";
    //Stack lista=new StackVector<Integer>();
    StackVector<Integer> lista;

    
    public void setString(String linea) {
        this.operacion = linea;
    }

    public void meterVector() {
         lista = new StackVector<Integer>();
    }

    public boolean calcularVector() {
        boolean validez=true;
        int operando1;
        int operando2;
        try{     
        for(int x=0; x<operacion.length(); x++){
            if(operacion.charAt(x)!=' ' && operacion.charAt(x)!='-' && operacion.charAt(x)!='*' && operacion.charAt(x)!='+' && operacion.charAt(x)!='/'){
                lista.push(Character.getNumericValue(operacion.charAt(x)));
            }
            else if(operacion.charAt(x)=='+'){
                operando1 = lista.pop();
                operando2 = lista.pop();
                lista.push(operando1+operando2);
                
            }
            else if(operacion.charAt(x)=='-'){
                operando1 = lista.pop();
                operando2 = lista.pop();
                lista.push(operando1-operando2);
            }
            else if(operacion.charAt(x)=='*'){
                operando1 = lista.pop();
                operando2 = lista.pop();
                lista.push(operando1*operando2);
            }
            else if(operacion.charAt(x)=='/'){
                operando1 = lista.pop();
                operando2 = lista.pop();
                lista.push(operando1/operando2);
            }
        }
        return true;
        }catch (Exception e) {
            return false;
      }
    }

    public int getResultado() {
        return lista.pop();
    }
    
}
