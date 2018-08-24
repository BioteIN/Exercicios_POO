/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import View.Teste11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
/**
 *
 * @author bONGANI
 * @version 01.1 
 */
public class Conta implements Imprimivel{
    /**
     * Atributos
     */
    private ArrayList<ContaBancaria>contas;
   /**
    * 
    * @param obj
    * @param i 
    */
    public void inserir(ContaBancaria obj,int i){
       contas = new ArrayList<>();
       for(int a=0; a<i;a++){
           contas.add(obj);
       }}
    
    /**
     * 
     * @param obj
     * @param i 
     */
       public void remover(ContaBancaria obj, int i){
       contas = new ArrayList<>();
       for(int a=0; a<i;a++){
           contas.remove(obj);
       }
       }
       /**
        * 
        * @param i
        * @param string
        * @return ContaBancaria
        */
       public ContaBancaria procurar( int i,String string){
       contas = new ArrayList<>();
        ContaBancaria o = null;
       for(int a=0; a<i;a++){
         if(string.equalsIgnoreCase(String.valueOf(contas))) {
            
           return o;  
         } else{
             return null;
         }
       } return null;
    }
/**
 * Mostrar Dados
 */
    @Override
    public void mostrarDados() {
        
            System.out.println(contas);
            JOptionPane.showMessageDialog(null, contas, null, 0);
        
    }

    

   
 }
      


