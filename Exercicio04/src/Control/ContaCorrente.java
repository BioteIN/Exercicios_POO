/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author bONGANI
 * 
 * 
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel{
private double taxaDeOperacao;
/**
 * Construtor

*/
    public ContaCorrente() {
    }
/**
 * 
 * @param numero
 * @param saldo
 * @param historico 
 */
    public ContaCorrente(String numero, double saldo, String historico) {
        super(numero, saldo, historico);
    }
   /**
    * 
    * @param string
    * @param i
    * @param vvvvvv
    * @param taxaDeOp 
    */ 

    public ContaCorrente(String string, double i, String vvvvvv, double taxaDeOp) {
        setNumero(string);
        setSaldo(i);
        vvvvvv = getHistorico();
        setHistorico(vvvvvv);
        this.taxaDeOperacao=taxaDeOp;
        
        
    }

   /**
    * 
    * @return 
    */
    

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }
/**
 * 
 * @param taxaDeOperacao 
 */
    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
/**
 * 
 * @param sac
 * @return double 
 */
    @Override
    public double sacar(double sac) {
        if((getSaldo()>sac)&&(getSaldo()>0)){double s = getSaldo()-taxaDeOperacao;
        
        setSaldo(s);
        double v = getSaldo()-sac;
        setSaldo(v);
            System.out.println("Saque feito com sucesso!");} else {
            System.out.println("Saldo Insuficiente!");
        }
    return getSaldo();
    }
/**
 * 
 * @param dep
 * @return 
 */
    @Override
    public double depositar(double dep) {
          double s = getSaldo()-taxaDeOperacao;
        setSaldo(s);
        System.out.println("Depositou "+dep+" "+"O saldo agora e de: "+s);
    return dep;
    }
/**
 * metodo sem parametros
 */
    @Override
    public void mostrarDados() {
        System.out.println("Atributos da conta poupanca"+getNumero()+getHistorico()+getSaldo()+getTaxaDeOperacao());
    }
    
}
