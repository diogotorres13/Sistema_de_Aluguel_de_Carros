package com.locadora.loc.service;

import com.locadora.loc.model.Pedido;
import com.locadora.loc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    // Salva o pedido inicial com status pendente para análise financeira
    public Pedido salvar(Pedido pedido) {
        if (pedido.getStatus() == null) {
            pedido.setStatus("AGUARDANDO ANALISE");
        }
        return repository.save(pedido);
    }

    // Tópico 3: Permite que agentes avaliem o pedido (Requisito Sprint 03)
    public Pedido avaliarPedido(Long id, boolean aprovado, String observacaoAgente) {
        Pedido pedido = repository.findById(id).orElse(null);
        if (pedido != null) {
            if (aprovado) {
                pedido.setStatus("APROVADO - CONTRATO EM EXECUÇÃO");
            } else {
                pedido.setStatus("REJEITADO - " + observacaoAgente);
            }
            return repository.save(pedido);
        }
        return null;
    }

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Pedido buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}