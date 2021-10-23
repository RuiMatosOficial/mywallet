package br.com.ruimatos.mywallet.service;

import br.com.ruimatos.mywallet.model.Usuario;

public interface UsuarioService {
	
	//TDD
	
	Usuario autenticar(String email, String senha);

	Usuario cadastrarUsuario(Usuario usuario);
	
	void validarEmail(String email);
}
