package com.leonardo.apiestoque.service.impl;

import com.leonardo.apiestoque.model.Produto;
import com.leonardo.apiestoque.service.IProdutoService;
import com.leonardo.apiestoque.system.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends GenericRepository<Produto, Integer> implements IProdutoService {

    @Override
    public Produto incluir(Produto produto) {
        persist(produto);
        return produto;
    }
}
