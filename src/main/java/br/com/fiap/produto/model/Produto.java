package br.com.fiap.produto.model;

import br.com.fiap.fornecedor.model.Fornecedor;

import java.time.LocalDateTime;

public abstract class Produto {
    private Long id;
    private String nome;
    private int qtde;
    private String desc;
    private LocalDateTime dataFabricacao;
    private Fornecedor fabricante;

    public Produto() {}

    public Produto(Long id, String nome, int qtde, String desc, LocalDateTime dataFabricacao, Fornecedor fabricante) {
        this.id = id;
        this.nome = nome;
        this.qtde = qtde;
        this.desc = desc;
        this.dataFabricacao = dataFabricacao;
        this.fabricante = fabricante;
    }

    public Produto(String nome, int qtde, String desc, LocalDateTime dataFabricacao, Fornecedor fabricante) {
        this.nome = nome;
        this.qtde = qtde;
        this.desc = desc;
        this.dataFabricacao = dataFabricacao;
        this.fabricante = fabricante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDateTime dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Fornecedor getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fornecedor fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", qtde=" + qtde +
                ", desc='" + desc + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", fabricante=" + fabricante +
                '}';
    }
}
