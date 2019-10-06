package com.minicursoapi.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minicursoapi.core.models.Pessoa;
import com.minicursoapi.core.utils.PessoasUtil;

@Controller
public class ApiController {
	
	@Autowired
	private PessoasUtil pessoasUtil;
	
	@ResponseBody
	@RequestMapping(value = "/getPessoas", method = RequestMethod.GET)
	public List<Pessoa> getDadosForm() {
		return this.pessoasUtil.getPessoas();
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public HttpStatus getDadosForm(@RequestBody final Pessoa pessoa) {
		this.pessoasUtil.add(pessoa);
		return HttpStatus.OK;
	}
}
