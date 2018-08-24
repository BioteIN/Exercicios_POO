/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Control.ContaBancaria;
import Control.ContaCorrente;
import Control.ContaPoupanca;
import Control.Imprimivel;
import Control.Relatorio;

/**
 *
 * @author bONGANI
 */
public class Evecutavel {
    public static void main(String[] args) {
        ContaCorrente corrente1 = new ContaCorrente("123",2000,"vvvvvv",20);
        ContaPoupanca poupanca = new ContaPoupanca("000",2000,"bbbbbbb",5000);
        
        System.out.println("-------------------------------------6---------------------------------------------");

        corrente1.sacar(1000);
        corrente1.depositar(1);
        
        poupanca.sacar(6000);
        poupanca.depositar(200);
        
        System.out.println("---------------------------------------7-------------------------------------------");
        Relatorio rel = new Relatorio();
        rel.gerarRelatorio(poupanca);
        rel.gerarRelatorio( corrente1);

    }
}
