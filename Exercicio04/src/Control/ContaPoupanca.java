/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author bONGANI
 * @since <17-07-2018/>
 * 
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    /**
     * Atributos da classe ContaPoupanca
     */
private double limite;
/**
 * Construtor sem parametros
 */
    public ContaPoupanca() {
    }
/**
 * 
 * @param numero
 * @param saldo
 * @param historico 
 */
    public ContaPoupanca(String numero, double saldo, String historico) {
        super(numero, saldo, historico);
    }
    /**
     * 
     * @param string
     * @param i
     * @param bbbbbbb
     * @param limite 
     */

    public ContaPoupanca(String string, double i, String bbbbbbb, double limite) {
        setNumero(string);
        setSaldo(i);
        setHistorico(bbbbbbb);
        this.limite=limite;
    }
/**
 * 
 * @return double
 */
    public double getLimite() {
        return limite;
    }
/**
 * 
 * @param limite 
 */
    public void setLimite(double limite) {
        this.limite = limite;
    }
    /**
     * 
     * @param sac
     * @return double
     */

    @Override
    public double sacar(double sac) {
        if(sac<this.getSaldo()+limite){
         double s = getSaldo()-sac;
        setSaldo(s);
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    return sac;
    }
/**
 * 
 * @param dep
 * @return double
 */
    @Override
    public double depositar(double dep) {
        double d = getSaldo()+dep;
        setSaldo(d);
        System.out.println("Depositou "+dep+" "+"Agora o teu saldo e de "+d);
        return getSaldo();
        
    }
    /**
     * Metodo Mostrar Dados
     */

    @Override
    public void mostrarDados() {
        System.out.println("Atributos da conta poupanca"+getNumero()+getHistorico()+getSaldo()+getLimite());
    }
    
}
