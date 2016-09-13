package br.com.biblioteca.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotea.model.Emprestimo;
import br.com.bibliotea.model.Pessoa;
import br.com.biblioteca.dao.EmprestimoDao;
import br.com.biblioteca.dao.PessoaDao;

@Controller
public class EmprestimoController {
	


	@RequestMapping("adicionaEmprestimo")
	public String adiciona(Emprestimo emprestimo) {
		EmprestimoDao dao = new EmprestimoDao();
		
		if (dao.jaTemDoisLivros() && dao.jaEstaEmprestado() && dao.temIdadeParaRetirar(emprestimo)) {
			dao.adiciona(emprestimo);
			return "emprestimo-adicionado";
		} else {
			return "emprestimo-erro";
		}

	}

	@RequestMapping("listaEmprestimos")
	public String lista() {
		EmprestimoDao dao = new EmprestimoDao();
		List<Emprestimo> emprestimos = dao.lista();
		return "emprestimos/lista";
	}

}
