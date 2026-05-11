package main;

public class HamburguerBuilder {

    private Hamburguer hamburguer;

    public HamburguerBuilder() {
        hamburguer = new Hamburguer();
    }

    public Hamburguer build() {
        if (hamburguer.getNumero() == 0) {
            throw new IllegalArgumentException("Número do pedido inválido");
        }
        if (hamburguer.getNome().equals("")) {
            throw new IllegalArgumentException("Nome do hambúrguer inválido");
        }
        return hamburguer;
    }

    public HamburguerBuilder setNumero(int numero) {
        hamburguer.setNumero(numero);
        return this;
    }

    public HamburguerBuilder setNome(String nome) {
        hamburguer.setNome(nome);
        return this;
    }

    public HamburguerBuilder setTipoPao(String tipoPao) {
        hamburguer.setTipoPao(tipoPao);
        return this;
    }

    public HamburguerBuilder setTipoCarne(String tipoCarne) {
        hamburguer.setTipoCarne(tipoCarne);
        return this;
    }

    public HamburguerBuilder setTemQueijo(boolean temQueijo) {
        hamburguer.setTemQueijo(temQueijo);
        return this;
    }

    public HamburguerBuilder setTemBacon(boolean temBacon) {
        hamburguer.setTemBacon(temBacon);
        return this;
    }

    public HamburguerBuilder setTemAlface(boolean temAlface) {
        hamburguer.setTemAlface(temAlface);
        return this;
    }

    public HamburguerBuilder setTemTomate(boolean temTomate) {
        hamburguer.setTemTomate(temTomate);
        return this;
    }

    public HamburguerBuilder setTemCebola(boolean temCebola) {
        hamburguer.setTemCebola(temCebola);
        return this;
    }

    public HamburguerBuilder setTemPickle(boolean temPickle) {
        hamburguer.setTemPickle(temPickle);
        return this;
    }

    public HamburguerBuilder setMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }

    public HamburguerBuilder setTamanho(String tamanho) {
        hamburguer.setTamanho(tamanho);
        return this;
    }

    public HamburguerBuilder setTemOvo(boolean temOvo) {
        hamburguer.setTemOvo(temOvo);
        return this;
    }

    public HamburguerBuilder setTemAbacaxi(boolean temAbacaxi) {
        hamburguer.setTemAbacaxi(temAbacaxi);
        return this;
    }

    public HamburguerBuilder setQuantidadeCarnes(int quantidadeCarnes) {
        hamburguer.setQuantidadeCarnes(quantidadeCarnes);
        return this;
    }

    public HamburguerBuilder setQuantidadeQueijos(int quantidadeQueijos) {
        hamburguer.setQuantidadeQueijos(quantidadeQueijos);
        return this;
    }

    public HamburguerBuilder setObservacoes(String observacoes) {
        hamburguer.setObservacoes(observacoes);
        return this;
    }

}