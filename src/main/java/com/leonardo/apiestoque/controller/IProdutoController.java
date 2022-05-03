package com.leonardo.apiestoque.controller;

import com.leonardo.apiestoque.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/produto")
public interface IProdutoController {

    @PostMapping
    ResponseEntity<Produto> incluir (@RequestBody Produto produto);

}
