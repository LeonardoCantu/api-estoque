package com.leonardo.apiestoque.model;

import com.leonardo.apiestoque.system.GenericEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Categoria extends GenericEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String descricao;

//    @OneToMany(mappedBy = "categoria")
//    private List<Produto> produtos;

}
