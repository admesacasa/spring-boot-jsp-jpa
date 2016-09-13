package br.com.biblioteca.dao;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Period;

import javax.annotation.ManagedBean;

import br.com.bibliotea.model.Emprestimo;

@ManagedBean
public class EmprestimoDao extends Repositorio<Emprestimo, BigInteger> {

	public boolean temIdadeParaRetirar(Emprestimo emprestimo) {
		Period periodo = Period.between(emprestimo.getPessoa().getDatanascimento(), LocalDate.now());
		if (periodo.getYears() >= emprestimo.getLivro().getClassificacao()) {
			return true;
		}
		return false;
	}

	public boolean jaEstaEmprestado() {
		return false;
	}

	public boolean jaTemDoisLivros() {
		return false;
	}
}
