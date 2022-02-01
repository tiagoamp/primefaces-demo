package mbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Pessoa;


@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas = new ArrayList<>();
	
	
	public void adicionarPessoa() {
		pessoas.add(pessoa);
		limparCampos();
	}
	
	public void limparCampos() {
		this.pessoa = new Pessoa();
	}
	
	
	/* getters & setters */
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}
