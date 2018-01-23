package com.perito.arquetipo.java.avancado.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "VENDAS")
public class Venda implements MyEntity, Serializable {

    @Id
    @Column(name = "CODIGO_VENDA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor;

    @Column(name = "ANO", nullable = false)
    private Double ano;

    @Column(name = "ESTADO", nullable = false)
    private String estado;

    @Column(name = "CIDADE", nullable = false)
    private String cidade;

    @Column(name = "BAIRRO", nullable = false)
    private String BAIRRO;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "TELEFONE", nullable = false)
    private Integer telefone;

    @ManyToOne
    @JoinColumn(name = "VEICULO", nullable = false,
            foreignKey = @ForeignKey(name = "FK_VENDA_VEICULO", value = ConstraintMode.CONSTRAINT))
    private Veiculo veiculo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Double getAno() {
        return ano;
    }

    public void setAno(Double ano) {
        this.ano = ano;
    }
}
