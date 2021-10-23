package br.com.ruimatos.mywallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ruimatos.mywallet.model.Usuario;

@SpringBootApplication
public class MywalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywalletApplication.class, args);
	    
		Usuario usuario = new Usuario();
		usuario.setNome("Rui");
	}

}
