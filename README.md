# Sistema de Aluguel de Carros - PUC Minas

Este projeto é um sistema Web desenvolvido para apoiar a gestão de aluguéis de automóveis, permitindo operações via Internet como efetuar, cancelar e modificar pedidos. O software foi construído seguindo a arquitetura **MVC** em **Java**, conforme os requisitos da disciplina de Laboratório de Desenvolvimento de Software.

## Requisitos e Regras de Negócio (Sprint 03)

O protótipo atual contempla as seguintes funcionalidades e regras extraídas da especificação:
* **Cadastro Prévio**: O sistema exige o registro de usuários e automóveis antes de qualquer operação.
* **Perfis de Usuário**: 
    * **Clientes**: Podem introduzir, consultar e modificar seus pedidos.
    * **Agentes (Bancos/Empresas)**: Podem avaliar e modificar pedidos.
* **Análise Financeira**: Todo pedido passa por um parecer financeiro dos agentes antes da execução do contrato.
* **Gestão de Automóveis**: Registro detalhado contendo matrícula, ano, marca, modelo e placa.
* **Propriedade e Crédito**: Suporte para automóveis registrados como propriedade de clientes, empresas ou bancos, além de associação com contratos de crédito bancário.

## Tecnologias Utilizadas

* **Linguagem**: Java 17+
* **Framework**: Spring Boot (Spring MVC, Spring Data JPA)
* **Template Engine**: Thymeleaf (Construção dinâmica de páginas)
* **Banco de Dados**: H2 (In-memory)
* **Arquitetura**: MVC (Model-View-Controller)

## Como Executar o Projeto

1. **Clonar o Repositório**:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/diogotorres13/Sistema_de_Aluguel_de_Carros.git)

2. **Executar via Terminal (Maven)**:
   ```bash
   .\mvnw spring-boot:run

3. **Acesso Local**:
   Abra o navegador em http://localhost:8080

## Guia de Uso (Fluxo do Protótipo)

Para realizar uma demonstração completa do sistema, siga este fluxo:

1.  **Cadastrar Automóvel**: Acesse a nova tela de cadastro para registrar veículos com matrícula, ano, marca, modelo, placa e proprietário legal.
2.  **Cadastrar Cliente**: Insira os dados de identificação (RG, CPF) e os rendimentos conforme solicitado no formulário.
3.  **Solicitar Aluguel**: Crie um pedido vinculando o cliente ao carro desejado e defina se há contrato de crédito e qual o banco agente.
4.  **Consultar Status**: Visualize o status **"AGUARDANDO ANALISE"**, simulando a etapa necessária para avaliação dos agentes (Bancos/Empresas).

## Documentação UML (Sprint 03)

O repositório contém a versão final dos modelos UML atualizados:

* **Diagrama de Classes**: Refletindo as entidades `Carro`, `Cliente` e `Pedido` com seus respectivos atributos e associações.
* **Diagrama de Componentes**: Representação da visão lógica e organização dos módulos do sistema.
* **Diagrama de Implantação**: Detalhamento da infraestrutura física, mostrando o servidor central conectado aos clientes e agentes via Internet.

---

**Curso:** Engenharia de Software - PUC Minas  
**Professor:** João Paulo Carneiro Aramuni  
**Aluno:** Diogo Torres
