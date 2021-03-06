package br.com.prog3.atividade8aula12.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import br.com.prog3.atividade8aula12.model.Aluno;
import br.com.prog3.atividade8aula12.persistence.AlunoDaoImp;

@ManagedBean
public class AlunoController {
	private Integer matricula;
	private String nome;
	private String ra;
	private Aluno aluno;
	private String mensagem;

	public void addAluno() {
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.save(aluno));
		aluno = new Aluno();
	}

	private void setMensagem(String save) {
		this.mensagem = mensagem;
	}

	public void editAluno() {
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.update(aluno));
	}

	public void deleteAluno() {
		AlunoDaoImp ad = new AlunoDaoImp();
		setMensagem(ad.delete(matricula));
	}

	public List<Aluno> getAlunos() {
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.list();
	}

	public Aluno findAluno() {
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.findByMatricula(matricula);
	}
	// get/set
}