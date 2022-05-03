package com.leonardo.apiestoque.controller.impl;

import com.leonardo.apiestoque.controller.IProdutoController;
import com.leonardo.apiestoque.model.Produto;
import com.leonardo.apiestoque.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ProdutoController implements IProdutoController {

    @Autowired
    private IProdutoService iProdutoService;

    @Override
    public ResponseEntity<Produto> incluir(Produto produto) {
        iProdutoService.incluir(produto);
        return ResponseEntity.ok(produto);
    }
}
