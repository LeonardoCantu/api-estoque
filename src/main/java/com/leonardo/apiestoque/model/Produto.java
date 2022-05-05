package com.leonardo.apiestoque.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.leonardo.apiestoque.system.GenericEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Produto extends GenericEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String descricao;

    private String ean;

    private boolean ativo;

    private BigDecimal valor;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_categoria", referencedColumnName = "id", nullable = false)
//    private Categoria categoria;

}
