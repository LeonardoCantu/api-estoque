package com.leonardo.apiestoque.controller;

import com.leonardo.apiestoque.model.Produto;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(IProdutoController.PATH)
public interface IProdutoController {
    String PATH = "/produto";

    @PostMapping
    ResponseEntity<Produto> incluir(@RequestBody Produto produto);

    @PutMapping("/{id}")
    void editar(@RequestBody Produto produto, @RequestParam Integer id);

}
