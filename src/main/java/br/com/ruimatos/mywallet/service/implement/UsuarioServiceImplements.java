package br.com.ruimatos.mywallet.service.implement;

import br.com.ruimatos.mywallet.model.Usuario;
import br.com.ruimatos.mywallet.repository.UsuarioRepository;
import br.com.ruimatos.mywallet.service.UsuarioService;
import br.com.ruimatos.mywallet.service.exception.UsuarioException;

public class UsuarioServiceImplements implements UsuarioService{

	private UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImplements(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario cadastrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		
		if(usuarioRepository.existsByEmail(email)) {
			throw new UsuarioException("Já existe um email cadastrado");
		}
	}

}
