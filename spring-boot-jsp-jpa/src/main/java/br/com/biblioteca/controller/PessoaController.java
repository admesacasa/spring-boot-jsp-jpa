package br.com.biblioteca.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotea.model.Pessoa;
import br.com.biblioteca.dao.PessoaDao;

@Controller
public class PessoaController {

	@RequestMapping("adicionaPessoa")
	public String adiciona(Pessoa pessoa) {
		PessoaDao dao = new PessoaDao();
		dao.adiciona(pessoa);
		return "pessoa-adicionada";
	}
	
	@RequestMapping("novaPessoa")
	  public String form() {
	    return "pessoa/formulario";
	  }
	
	@RequestMapping("listaPessoas")
	public String lista() {
		PessoaDao dao = new PessoaDao();
	  List<Pessoa> pessoas = dao.lista(); 
	  return "pessoa/lista";
	}
	
	
	
}
