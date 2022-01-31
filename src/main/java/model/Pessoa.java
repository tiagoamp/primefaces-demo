package model;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Date dataDeNascimento;
	private Date dataDeInscricao;
	private String senha;
	private Float salario;
	private String website;
	private String cidade;
	private Float nota;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public Date getDataDeInscricao() {
		return dataDeInscricao;
	}
	public void setDataDeInscricao(Date dataDeInscricao) {
		this.dataDeInscricao = dataDeInscricao;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota = nota;
	}
	
}
