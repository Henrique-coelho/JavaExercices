
public class Bilhete {
	private double valor;
	private int quantidade;
	private Filme filme;
	
	public Bilhete(double valor, Filme filme) {
		this.setValor(valor);
		this.setFilme(filme);
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public double valorTotal() {
		double valorTotal = (this.valor)*(this.quantidade);
		
		return valorTotal;
	}
	
	public void imprimirNota(Filme filme, int quantidade) {
		System.out.println("CineCefet - nota fiscal");
		System.out.println(filme.getTitulo() +" " + quantidade + "x---- R$" + valorTotal());
	}
}
