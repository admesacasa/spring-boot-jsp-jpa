package br.com.bibliotea.model;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.bibliotea.model.Livro;
import br.com.bibliotea.model.Pessoa;

@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "emprestimo_idemprestimo_seq", sequenceName = "emprestimo_idemprestimo_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emprestimo_idemprestimo_gen")
	@NotNull
	@Column(name = "idemprestimo", updatable = false)
	private BigInteger id;
	
	private LocalDate dataEmprestimo;
	
	private LocalDateTime dataHoraDevolucao;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idlivro")
	Livro livro;


	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idpessoa")
	Pessoa pessoa;


	public BigInteger getId() {
		return id;
	}


	public void setId(BigInteger id) {
		this.id = id;
	}


	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}


	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}


	public LocalDateTime getDataHoraDevolucao() {
		return dataHoraDevolucao;
	}


	public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
		this.dataHoraDevolucao = dataHoraDevolucao;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livro == null) ? 0 : livro.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livro == null) {
			if (other.livro != null)
				return false;
		} else if (!livro.equals(other.livro))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

	
	

	
}
