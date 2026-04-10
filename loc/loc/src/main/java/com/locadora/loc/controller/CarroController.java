package com.locadora.loc.controller;

import com.locadora.loc.model.Carro;
import com.locadora.loc.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping("/salvar")
    public String salvarCarro(@ModelAttribute Carro carro) {
        carroService.salvar(carro);
        // Redireciona para a página de pedidos para que o novo carro já apareça na lista
        return "redirect:/pedidos-page";
    }
}