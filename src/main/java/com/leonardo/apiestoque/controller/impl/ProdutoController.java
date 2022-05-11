package com.leonardo.apiestoque.controller.impl;

import com.leonardo.apiestoque.controller.IProdutoController;
import com.leonardo.apiestoque.model.Produto;
import com.leonardo.apiestoque.service.IProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProdutoController implements IProdutoController {

    private final IProdutoService iProdutoService;

    @Override
    public ResponseEntity<Produto> incluir(Produto produto) {
        iProdutoService.incluir(produto);
        return ResponseEntity.ok(produto);
    }

    @Override
    public void editar(Produto produto, Integer id) {
        iProdutoService.editar(produto, id);
    }
}
