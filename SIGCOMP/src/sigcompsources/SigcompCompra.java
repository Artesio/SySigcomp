/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigcompsources;

import javax.swing.JOptionPane;

/**
 *
 * @author Artesio
 */
public class SigcompCompra {

    private String produto, oProduto;
    private double preco, oPreco, saldoInicial = 1000, saldoActual = 1000, trocos, PreTotalCOmpra;
    private int quantidade, oQuantidade;

    public String getProduto() {

        return produto;
    }

    public double getPreTotalCOmpra() {
        return PreTotalCOmpra;
    }

    public void setPreTotalCOmpra(double PreTotalCOmpra) {
        this.PreTotalCOmpra = PreTotalCOmpra;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getoProduto() {
        return oProduto;
    }

    public void setoProduto(String oProduto) {
        this.oProduto = oProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getoPreco() {
        return oPreco;
    }

    public void setoPreco(double oPreco) {
        this.oPreco = oPreco;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getTrocos() {
        return trocos;
    }

    public void setTrocos(double trocos) {
        this.trocos = trocos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getoQuantidade() {
        return oQuantidade;
    }

    public void setoQuantidade(int oQuantidade) {
        this.oQuantidade = oQuantidade;
    }

    public void EfectuarCompra(double price, int quantie, String producto, double oprice, int oquantie, String product, boolean check) {

        //setTrocos(saldoActual - price);
//        setPreTotalCOmpra(getPreco());
//        setTrocos(getSaldoActual() - getPreTotalCOmpra());
//        setSaldoActual(getSaldoActual()-getPreTotalCOmpra());
//        setSaldoActual(getSaldoActual()+getTrocos());
        if (price > this.saldoActual) {
            JOptionPane.showMessageDialog(null, "O valor da compra e maior que o disponivel!...");
            //this.trocos = this.saldoActual;
        } else {
            
            this.saldoActual = this.saldoActual - price;
            if(this.saldoActual>price){
               this.trocos=this.saldoActual;
            }
            setProduto(producto);
            setQuantidade(quantie);
            setPreco(price);
            setTrocos(trocos);
            setPreTotalCOmpra(price);

        }
        if (check == true) {
            EfectuarOcompra(oprice, oquantie, product);
        }

    }

    public void EfectuarOcompra(double oprice, int oquantie, String product) {

        setoProduto(product);
        setoQuantidade(oquantie);
        setoPreco(oprice);
        setPreTotalCOmpra(getPreco() + getoPreco());
        setTrocos(getSaldoActual() - getPreTotalCOmpra());
    }

    public void Verificar(double vprice, double vinitialBalance, double vactualBalance, int vquantie, double voprice, int voquantie) {

    }
}
