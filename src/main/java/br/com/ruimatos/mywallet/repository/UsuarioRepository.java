package br.com.ruimatos.mywallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ruimatos.mywallet.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
   
	//SELECT * FROM usuario WHERE EXIST
	// boolean existsByEmailAndNome(String email, String nome); 
	boolean existsByEmail(String email);
}
