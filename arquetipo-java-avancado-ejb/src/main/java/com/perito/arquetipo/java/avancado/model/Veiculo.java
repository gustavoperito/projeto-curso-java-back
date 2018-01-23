package com.perito.arquetipo.java.avancado.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "VEICULOS")
public class Veiculo implements MyEntity, Serializable {
    @Id
    @Column(name = "CODIGO_VEICULO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O nome é obrigatório")
    @Size(min = 1, max = 100, message = "O nome deve ter no máximo {max} caracteres")
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @NotNull(message = "A marca é obrigatório")
    @Size(min = 1, max = 100, message = "A marca deve ter no máximo {max} caracteres")
    @Column(name = "MARCA", length = 100, nullable = false)
    private String marca;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
