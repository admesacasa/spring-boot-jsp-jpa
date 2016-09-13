package br.com.biblioteca.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class JpaRepository<T1, T2> {

	Class<T1> classe;
	EntityManager manager;

	public <T> void adiciona(T Objeto) {
		manager.persist(Objeto);
	}

	public <T> void atualiza(T Objeto) {
		manager.merge(Objeto);
	}

	public List<T1> lista() {
		return manager.createQuery(queryParaTodos(), classe).getResultList();
	}

	private String queryParaTodos() {
		return "select obj from " + classe.getName() + " obj order by obj.id";

	}

}
