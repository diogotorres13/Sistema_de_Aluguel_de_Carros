package com.locadora.loc.controller;

import com.locadora.loc.model.Pedido;
import com.locadora.loc.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/salvar")
    public String salvarPedido(@ModelAttribute Pedido pedido) {
        pedido.setStatus("AGUARDANDO ANALISE"); // Regra da Sprint 03
        pedidoService.salvar(pedido);
        return "redirect:/consulta-page";
    }
}