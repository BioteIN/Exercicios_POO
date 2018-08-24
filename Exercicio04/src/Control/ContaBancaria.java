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
public abstract class ContaBancaria {
    private String numero;
    private double saldo;
    private String historico;
/**
 * 
 * @param numero
 * @param saldo
 * @param historico 
 */
    public ContaBancaria(String numero, double saldo, String historico) {
        this.numero = numero;
        this.saldo = saldo;
        this.historico = historico;
    }
/**
 * @since 
 */
    
    public ContaBancaria() {
    }
/**
 * @return String
 */
    public String getNumero() {
        return numero;
    }
/**
 * 
 * @param numero 
 */
    public void setNumero(String numero) {
        this.numero = numero;
    }
/**
 * 
 * @return Double
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * 
 * @param saldo 
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * 
 *@return  String 
    */
    public String getHistorico() {
        return historico;
    }
/**
 * 
 * @param historico 
 */
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    /**
     *Metodo abstrato sacar
     * @return
     */
    public abstract double sacar(double sac);
    /**
     * Metodo abstrato depositar
     * @param dep
     * @return 
     */
    public abstract double depositar(double dep);
    /**
     * 
     * @param db
     * @param contaBanc 
     */
    public void transferir(double db, ContaBancaria contaBanc){
      if(getSaldo()>db){  this.sacar(db);
        contaBanc.depositar(db);} else {
          System.out.println("Saldo insuficiente");
      }
    }
}
