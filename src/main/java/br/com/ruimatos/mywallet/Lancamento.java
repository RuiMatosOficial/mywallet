package br.com.ruimatos.mywallet;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@Entity
@Table(name = "lancamentos", schema = "carteira")
public class Lancamento {
	
	/*  @Column information in table the column
	 * For example
	 * @Column(name = "seu_campo")
	 * private String seu_campo;
	 * 
	 * É obrigatório apenas quando nome do campo entidade
	 * é diferente do nome campo Banco de Dados. 
	*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "mes")
	private Integer mes;
	@Column(name = "ano")
	private Integer ano;
	@Column(name = "valor")
	private BigDecimal valor;
    @Column(name = "tipo")
	private String tipo;
	@Column(name = "status")
	private String status;
	@ManyToOne
	@JoinColumn(name = "id_usuario" )
	private Usuario usuario;
    
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.class )
	private LocalDate datacadastro;
}
