package com.leonardo.apiestoque.service.impl;

import com.leonardo.apiestoque.model.Produto;
import com.leonardo.apiestoque.service.IProdutoService;
import com.leonardo.apiestoque.system.GerenicService;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends GerenicService<Produto, Integer> implements IProdutoService {

    @Override
    public Produto incluir(Produto produto) {

        return save(produto);
    }

    private void prepareInsert(Produto produto) {

    }
}
