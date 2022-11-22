package data;

import java.util.ArrayList;

import entities.*;

public class Dados {
	
	private ArrayList<LeitorDTO> leitores = new ArrayList<>();
	private ArrayList<EmprestimoDTO> emprestimos = new ArrayList<>();
	private ArrayList<LivroDTO> livros = new ArrayList<>();
	
	public Dados() {
		populate();
	}
	
	public void populate() {
		leitores.add(new LeitorDTO("Abner", false));
		leitores.add(new LeitorDTO("Bea", false));
		leitores.add(new LeitorDTO("Camila", false));
		livros.add(new LivroDTO("A"));
		livros.add(new LivroDTO("B"));
		
		
	}
	
	public LeitorDTO buscarLeitor(int idLeitor) {
		return leitores.get(idLeitor);
	}
	
	public ArrayList<EmprestimoDTO> buscarNConcluidos(int idLeitor){
		LeitorDTO leitor = leitores.get(idLeitor);
		
		ArrayList<EmprestimoDTO> emprestimosLeitor = new ArrayList<>();
		
		for(EmprestimoDTO emprestimo: emprestimos) {
			if(emprestimo.getLeitor() == leitor) {
				emprestimosLeitor.add(emprestimo);
			}
		}
		
		return emprestimosLeitor;
	}
	
	public LivroDTO buscarLivro(int idLivro) {
		return livros.get(idLivro);
	}
	
	public ArrayList<EmprestimoDTO> buscarEmpLivrorNConcluidos(int idLivro){
		LivroDTO livro = livros.get(idLivro);
		
		ArrayList<EmprestimoDTO> emprestimosLivro = new ArrayList<>();
		
		for(EmprestimoDTO emprestimo: emprestimos) {
			
			for(LivroDTO livroEmprestado: emprestimo.getLivros()) {
				emprestimosLivro.add(emprestimo);
			}
			
		}
		
		return emprestimosLivro;
		
	}
	
	public void add(EmprestimoDTO emp) {
		emprestimos.add(emp);
	}

}
