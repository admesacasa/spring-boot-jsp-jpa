package br.com.biblioteca.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotea.model.Livro;
import br.com.bibliotea.model.Pessoa;
import br.com.biblioteca.dao.PessoaDao;

@Controller
public class LivroController {

	@RequestMapping("adicionaLivro")
	public String adiciona(Livro livro) {
		LivroDao dao = new LivroDao();
		dao.adiciona(livro);
		return "pessoa-adicionada";
	}
	
	@RequestMapping("novoLivro")
	  public String form() {
	    return "livro/formulario";
	  }
	
	@RequestMapping("listaLivros")
	public String lista() {
		LivroDao dao = new LivroDao();
	  List<Livro> livros = dao.lista(); 
	  return "livro/lista";
	}
	
	
	@RequestMapping("removeLivro")
	public String remove(Livro livro) {
		LivroDao dao = new LivroDao();
	  dao.remove(livro);
	  return "forward:listaLivros";
	}
	
}
