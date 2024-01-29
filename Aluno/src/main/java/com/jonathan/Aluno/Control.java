package com.jonathan.Aluno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonathan.Aluno.dl.Ativador.AtivadorAluno;
import com.jonathan.dl.aluno.Aluno;

@Controller
public class Control {
	
	private AtivadorAluno ativadorAluno;
	
	public Control(AtivadorAluno ativadorAluno) {
		this.ativadorAluno = ativadorAluno;
		ativadorAluno = this.ativadorAluno;
		}
	
	@GetMapping("/cadastro")
	@ResponseBody
	public String cadatro() {
		
		Aluno jonathan = new Aluno("Jonthan", "Ciencia da computação", "24702580", "jonathanTI@gmail.com");
		
		ativadorAluno.ativar(jonathan);
		
		return "Aluno";
	}
	
}
