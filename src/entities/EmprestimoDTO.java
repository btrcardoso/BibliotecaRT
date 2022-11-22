package entities;
import java.util.ArrayList;

public class EmprestimoDTO {
	
	private LeitorDTO leitor;
	private ArrayList<LivroDTO> livros = new ArrayList<>();
	
	
	public void criar(LeitorDTO leitor) {
		this.leitor = leitor;
	}
	
	public void add(LivroDTO livro) {
		this.livros.add(livro);
	}
	
	// nao deviam estar aqui
	
	public EmprestimoDTO(LeitorDTO leitor) {
		this.leitor = leitor;
	}
	
	public LeitorDTO getLeitor() {
		return leitor;
	}
	
	public ArrayList<LivroDTO> getLivros(){
		return livros;
	}
}

