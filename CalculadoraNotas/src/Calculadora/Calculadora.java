package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		Alunos alunos = new Alunos();
		
		/*Nome e notas do primeiro e segundo semestre*/
		alunos.nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		alunos.nota1 = JOptionPane.showInputDialog("Digite a nota do primeiro semestre do aluno: ");
		alunos.nota2 = JOptionPane.showInputDialog("Digite a nota do segundo semestre do aluno: ");
		
		/*M�dia do aluno*/
		alunos.getMedia();
		
		/*Impress�o*/
		if(alunos.media >= 7) {
			JOptionPane.showMessageDialog(null, alunos.nome + ", m�dia: " + alunos.media + " = Aprovado.");
		}else {
			JOptionPane.showMessageDialog(null, alunos.nome + ", m�dia: " + alunos.media + " = Reprovado.");
		}		
		
		alunos.notas = JOptionPane.showConfirmDialog(null, "Deseja ver as notas do aluno?");
		
		/*Caso queira ver ou n�o as notas*/
		if(alunos.notas == 0) {
			JOptionPane.showMessageDialog(null, "Notas do aluno: " + alunos.nota1 + " e " + alunos.nota2);
		}else {
			JOptionPane.showMessageDialog(null, "Programa encerrado");
		}
		
	}

}
