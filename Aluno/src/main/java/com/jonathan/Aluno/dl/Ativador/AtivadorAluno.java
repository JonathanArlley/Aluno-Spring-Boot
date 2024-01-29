package com.jonathan.Aluno.dl.Ativador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.jonathan.dl.aluno.Aluno;

@Component
public class AtivadorAluno {


	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Aluno aluno) {
		aluno.ativar();
		
		eventPublisher.publishEvent(new AlunoAtivado(aluno));
	}
	
}
