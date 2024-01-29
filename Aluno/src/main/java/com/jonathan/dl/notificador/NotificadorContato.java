package com.jonathan.dl.notificador;

import org.springframework.stereotype.Component;
import com.jonathan.dl.aluno.Aluno;

@Component
public class NotificadorContato implements Notificador {

	@Override
	public void notificar(Aluno aluno, String mensagem) {
		System.out.printf("Notificamos %s aluno do curso %s de matricula %$ e de contato %s: %s \n",
				aluno.getNome(), aluno.getCurso(), aluno.getMatricula(), aluno.getContato(), mensagem);
	}
	
	
}
