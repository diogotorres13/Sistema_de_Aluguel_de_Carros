package com.locadora.loc.service;

import com.locadora.loc.model.Carro;
import com.locadora.loc.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public List<Carro> listar() {
        return repository.findAll();
    }

    public Carro salvar(Carro carro) {
        return repository.save(carro);
    }
}