package com.locadora.loc.model;

import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String status; // Ex: AGUARDANDO ANALISE, APROVADO, REJEITADO
    
    // Tópico 3: Associação com crédito e agentes
    private String bancoAgente; 
    private boolean temContratoCredito;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getBancoAgente() { return bancoAgente; }
    public void setBancoAgente(String bancoAgente) { this.bancoAgente = bancoAgente; }

    public boolean isTemContratoCredito() { return temContratoCredito; }
    public void setTemContratoCredito(boolean temContratoCredito) { this.temContratoCredito = temContratoCredito; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }
}