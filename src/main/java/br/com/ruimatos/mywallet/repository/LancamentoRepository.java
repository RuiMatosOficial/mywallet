package br.com.ruimatos.mywallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ruimatos.mywallet.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
