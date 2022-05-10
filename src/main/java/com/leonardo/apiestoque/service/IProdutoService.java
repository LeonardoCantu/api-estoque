package com.leonardo.apiestoque.service;

import com.leonardo.apiestoque.model.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public interface IProdutoService   {

    Produto incluir(Produto produto);

}
