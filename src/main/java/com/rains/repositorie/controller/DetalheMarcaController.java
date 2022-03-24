package com.rains.repositorie.controller;

import com.rains.repositorie.model.DetalheMarcaModel;
import com.rains.repositorie.model.MarcaModel;
import com.rains.repositorie.repository.DetalheMarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DetalheMarcaController {

    @Autowired
    private DetalheMarcaRepository repository;

    @GetMapping("/api/detalhe/listar")
    public List<DetalheMarcaModel> listar(){
        return repository.findAll();
    }

    @PostMapping("/api/detalhe/salvar")
    public DetalheMarcaModel salvar(@RequestBody DetalheMarcaModel detalhe){
        return repository.save(detalhe);
    }

}
