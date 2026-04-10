package com.locadora.loc;

import com.locadora.loc.model.Carro;
import com.locadora.loc.model.Cliente;
import com.locadora.loc.repository.CarroRepository;
import com.locadora.loc.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LocApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CarroRepository carroRepo, ClienteRepository clienteRepo) {
		return args -> {
			// Criando um carro de teste para evitar o Erro 500 no Pedido
			Carro c1 = new Carro();
			c1.setMarca("Fiat");
			c1.setModelo("Doblo");
			c1.setPlaca("ABC-1234");
			c1.setMatricula("MAT-001");
			c1.setAno(2023);
			c1.setProprietario("EMPRESA"); // Atende ao requisito de propriedade [cite: 14]
			carroRepo.save(c1);

			// Criando um cliente de teste
			Cliente cl1 = new Cliente();
			cl1.setNome("Diogo Torres");
			cl1.setCpf("123.456.789-00");
			cl1.setRg("MG-12.345.678");
			clienteRepo.save(cl1);
		};
	}
}