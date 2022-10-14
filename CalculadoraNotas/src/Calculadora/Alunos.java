package Calculadora;

public class Alunos extends Calculadora {
	
	public String nome;
	public String nota1;
	public String nota2;
	public double media;
	public int notas;
	
	public String getNota1() {
		return nota1;
	}
	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}
	public String getNota2() {
		return nota2;
	}
	public void setNota2(String nota2) {
		this.nota2 = nota2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNotas() {
		return notas;
	}
	public void setNotas(int notas) {
		this.notas = notas;
	}
	
	/* calcula média alunos */
	public double getMedia() {
		double nota1Num = Double.parseDouble(nota1);
		double nota2Num = Double.parseDouble(nota2);
		return media = (nota1Num + nota2Num) / 2;
	}

}
