package com.rains.repositorie.controller;

import com.rains.repositorie.model.MarcaModel;
import com.rains.repositorie.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarcaController {
    @Autowired
    private MarcaRepository repository;



    @GetMapping("/api/status")
    public String status(){
        return "Online";
    }



    @PostMapping("/api/marca/salvar")
    public MarcaModel salvar(@RequestBody MarcaModel marca){
        return repository.save(marca);
    }


    @GetMapping("/api/marca/listar")
    public List<MarcaModel> listar(){
        return repository.findAll();
    }
}
