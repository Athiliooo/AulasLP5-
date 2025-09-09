/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.Date;


/**
 *
 * @author u10227590198
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor); 
            
        }
    }
    public static void limpar(JComponent ... components){
        for (int i = 0; i < components.length; i++){
            if ( components[i] instanceof JTextField ){
            ((JTextField)components[i]).setText("");    
            }
            if ( components[i] instanceof JComboBox){
            ((JComboBox)components[i]).setSelectedIndex(-1);    
            }
        }
    }
    public static void mensagem(String cad){
        JOptionPane.showMessageDialog(null, cad);
    }
    public static boolean pergunta(String cad){
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }
    public static int strToInt(String num){
        return Integer.parseInt(num);
    }
    public static String intToStr(int num) {
        return String.valueOf(num);
    }
    public static double strToDouble(String num){
        return Double.parseDouble(num);
    }
    public static String doubleToStr(double num){
        return String.valueOf(num);
    }
    public static Date strToDate(String data){
        return null;
    }
    public static String dateToStr(Date data){
        return "";
    }
}
