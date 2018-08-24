/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author bONGANI
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Ficheiros {
    
      
    public static ArrayList<ContaBancaria> contas=new ArrayList<>();
    
    static String ficheiro="C:\\Users\\bONGANI\\Desktop\\Trab01\\Multi-Talentos\\EventosCadastrados.dat";

    public Ficheiros() {
       
        
        gravar(new ContaCorrente());
    }

    public static void main(String[] args) {
        new Ficheiros();
    }
    
    
    
    
    
    public static void gravar(ContaBancaria f){
        ler();
        contas.add(f);
        
        try{
            FileOutputStream meuFicheiro = new FileOutputStream(ficheiro); 
            ObjectOutputStream os = new ObjectOutputStream(meuFicheiro);

            os.writeObject(contas);
            meuFicheiro.flush(); 
            meuFicheiro.close();
             os.flush(); 
             os.close(); 
            
             JOptionPane.showMessageDialog(null, "Salvo Com Sucesso!");
        } catch(Exception e) {
            e.printStackTrace( );   
        }
    }
      



    
      
      
      
      
      
      
      
    
    public static void ler(){
        try{
                FileInputStream fis = new FileInputStream(ficheiro);
                ObjectInputStream ois = new ObjectInputStream(fis);
                contas = (ArrayList<ContaBancaria>) ois.readObject();
                ois.close();
                
        } catch(Exception e){
            System.out.println(e);

           }
    }
    
    
    
  
    
    
    
    
    
    
    
    public static int verificar(String  serie){   /////verifica a existencia do objecto passado como o parametro a serie
        
        for(int i =0;i<contas.size();i++){

            if(contas.get(i).getNumero()==serie){
                          return i;    
                        }
                     
                    } 
        return -1;
    }
    
   
  
    
    
    
    
    
    
    
    
       public static void editar(ContaBancaria c, String encontrado){
       int posicao=-1;
       
       ler();
           for(int i =0;i<Ficheiros.contas.size();i++){
                        if(Ficheiros.contas.get(i).getNumero()==encontrado){
                          posicao= i;    
                        }
                     
                    }
           String numero=c.getNumero();
           double saldo=c.getSaldo();
           String historico=c.getHistorico();
          
           
      
           
          
        if(posicao!=-1){
            contas.get(posicao).setNumero(numero);
           contas.get(posicao).setSaldo(saldo);
           contas.get(posicao).setHistorico(historico);
          
          
           
               
        }
           sv();
      
         }
        
       
            
    
       
       
       
       
       
       
       
       
       
    
    public static void sv(){
   
        try{
            FileOutputStream meuFicheiro = new FileOutputStream(ficheiro); 
            ObjectOutputStream os = new ObjectOutputStream(meuFicheiro);

            os.writeObject(contas);
            meuFicheiro.flush(); 
            meuFicheiro.close();
             os.flush(); 
             os.close(); 
             System.out.println("Sucesso!"); 
             JOptionPane.showMessageDialog(null, "Sucesso!");
        } catch(Exception e) {
            e.printStackTrace( );
           
        }
        
        
    }}    
    
    
    
    
    
    
    
    
//    
//    public static void eliminar(int n){
//     ler();
//    for(int i=0;i<array.size();i++){
//     if(array.get(i).get()==n){
//      System.out.println(n); 
// 
//    array.get(i).setEstado("nao");
//
//        }
//              }
//       sv();  
//          } 
//          
//          
//         
