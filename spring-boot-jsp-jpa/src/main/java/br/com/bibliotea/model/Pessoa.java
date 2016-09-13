package br.com.bibliotea.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "pesssoa")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

		@Id
	    @SequenceGenerator(name="pessoa_idpessoa_seq", sequenceName="pessoa_idpessoa_seq", allocationSize=1)
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pessoa_idpessoa_gen")
	    @NotNull
	    @Column(name = "idpessoa", updatable=false)
		private  BigInteger id;
		
		@Column(length=100)
		private String nome;
		
		private LocalDate dataNascimento;
		
		@Column(length=14)
		@CPF(message="CPF não é Válido")
		private String cpf;

		public BigInteger getId() {
			return id;
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public LocalDate getDatanascimento() {
			return datanascimento;
		}

		public void setDatanascimento(LocalDate datanascimento) {
			this.datanascimento = datanascimento;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
			Pessoa other = (Pessoa) obj;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			return true;
		}
		
		
		
	
}
