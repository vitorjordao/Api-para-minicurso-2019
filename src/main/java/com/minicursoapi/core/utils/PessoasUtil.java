package com.minicursoapi.core.utils;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.minicursoapi.core.models.Pessoa;

@Repository
public class PessoasUtil {
	private static List<Pessoa> pessoas;
	
	public PessoasUtil() {
		final List<Pessoa> pessoas = List.of(
				new Pessoa("João", "joaobaojoao@gmail.com", 19, true, false, "male"),
				new Pessoa("Joana", "jonakpoper@hotmail.com", 15, false, false, "female"),
				new Pessoa("Mario", "mariomenescraft@gmail.com", 11, false, true, "male"),
				new Pessoa("Maria", "marialolzera@bol.com.br", 13, true, true, "female"),
				new Pessoa("Marcio", "trezecentímetros@gmail.com", 10, false, false, "male"),
				new Pessoa("Marcela", "marcelinhadohabbo@joaoconstrucoes.com.br", 18, true, true, "female")
				);
		PessoasUtil.pessoas = new ArrayList<>(pessoas);
	}
	
	public List<Pessoa> getPessoas() {
		return PessoasUtil.pessoas;
	}
	
	public void add(final Pessoa... pessoas) {
		
		PessoasUtil.pessoas.addAll(List.of(pessoas));
	}
}
