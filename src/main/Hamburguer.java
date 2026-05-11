package main;

public class Hamburguer {

    private int numero;
    private String nome;
    private String tipoPao;
    private String tipoCarne;
    private boolean temQueijo;
    private boolean temBacon;
    private boolean temAlface;
    private boolean temTomate;
    private boolean temCebola;
    private boolean temPickle;
    private String molho;
    private String tamanho;
    private boolean temOvo;
    private boolean temAbacaxi;
    private int quantidadeCarnes;
    private int quantidadeQueijos;
    private String observacoes;

    public Hamburguer() {
        this.numero = 0;
        this.nome = "";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isTemQueijo() {
        return temQueijo;
    }

    public void setTemQueijo(boolean temQueijo) {
        this.temQueijo = temQueijo;
    }

    public boolean isTemBacon() {
        return temBacon;
    }

    public void setTemBacon(boolean temBacon) {
        this.temBacon = temBacon;
    }

    public boolean isTemAlface() {
        return temAlface;
    }

    public void setTemAlface(boolean temAlface) {
        this.temAlface = temAlface;
    }

    public boolean isTemTomate() {
        return temTomate;
    }

    public void setTemTomate(boolean temTomate) {
        this.temTomate = temTomate;
    }

    public boolean isTemCebola() {
        return temCebola;
    }

    public void setTemCebola(boolean temCebola) {
        this.temCebola = temCebola;
    }

    public boolean isTemPickle() {
        return temPickle;
    }

    public void setTemPickle(boolean temPickle) {
        this.temPickle = temPickle;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isTemOvo() {
        return temOvo;
    }

    public void setTemOvo(boolean temOvo) {
        this.temOvo = temOvo;
    }

    public boolean isTemAbacaxi() {
        return temAbacaxi;
    }

    public void setTemAbacaxi(boolean temAbacaxi) {
        this.temAbacaxi = temAbacaxi;
    }

    public int getQuantidadeCarnes() {
        return quantidadeCarnes;
    }

    public void setQuantidadeCarnes(int quantidadeCarnes) {
        this.quantidadeCarnes = quantidadeCarnes;
    }

    public int getQuantidadeQueijos() {
        return quantidadeQueijos;
    }

    public void setQuantidadeQueijos(int quantidadeQueijos) {
        this.quantidadeQueijos = quantidadeQueijos;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}