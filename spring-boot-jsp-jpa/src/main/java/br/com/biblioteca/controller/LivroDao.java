package br.com.biblioteca.controller;

import java.math.BigInteger;

import br.com.bibliotea.model.Livro;
import br.com.biblioteca.dao.JpaRepository;

public class LivroDao  extends JpaRepository<Livro, BigInteger>{

}
