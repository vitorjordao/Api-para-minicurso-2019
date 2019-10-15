package com.minicursoapi.core.models;

public class Pessoa {
	private final String name;
	private final String email;
	private final int age;
	private final boolean tipo1;
	private final boolean tipo2;
	private final String genero;

	public Pessoa(final String name, final String email, final int age, final boolean tipo1, final boolean tipo2, final String genero) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.genero = genero;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isTipo1() {
		return this.tipo1;
	}

	public boolean isTipo2() {
		return this.tipo2;
	}

	public String getGenero() {
		return this.genero;
	}
	
	
}
