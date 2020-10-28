
public class Filme {
	private String titulo;
	private String genero;
	private String diretor;
	private Sala sala;
	
	
	public Filme(String titulo, String genero, String diretor, Sala sala) {
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.setDiretor(diretor);
		this.setSala(sala);
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}
