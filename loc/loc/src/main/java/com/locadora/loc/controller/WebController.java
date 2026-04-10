package com.locadora.loc.controller;

import com.locadora.loc.model.Pedido;
import com.locadora.loc.model.Carro;
import com.locadora.loc.model.Cliente;
import com.locadora.loc.service.ClienteService;
import com.locadora.loc.service.PedidoService;
import com.locadora.loc.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private CarroService carroService;

    // Página Inicial / Menu
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Rota para a página de cadastro de Clientes
    @GetMapping("/clientes-page")
    public String clientePage(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente";
    }

    // Rota para a página de cadastro de Carros (Novo para a Sprint 03)
    @GetMapping("/carros-page")
    public String carroPage(Model model) {
        model.addAttribute("carro", new Carro());
        return "carro";
    }

    // Rota para a página de criação de Pedidos
    @GetMapping("/pedidos-page")
    public String pedidoPage(Model model) {
        // Envia as listas para os campos de seleção (Select) no HTML
        model.addAttribute("clientes", clienteService.listar());
        model.addAttribute("carros", carroService.listar());
        model.addAttribute("pedido", new Pedido());
        return "pedido";
    }

    // Rota para a página de Consulta de Status (Exigência Lab02S03)
    @GetMapping("/consulta-page")
    public String consultaPage(Model model) {
        // Recupera todos os pedidos para exibir na tabela com seus respectivos status
        model.addAttribute("pedidos", pedidoService.listarTodos());
        return "consulta";
    }
}