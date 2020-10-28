public class Fatura {
	private Item[] itens;
	private int tamanho;
	private int posicao = 0;
	
	public Fatura(int tamanho) {
		this.itens = new Item[tamanho];
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void addItem(Item item) {
		if(posicao<itens.length) {
			this.itens[this.posicao] = item;
			System.out.println("Você comprou um(a) "+this.itens[this.posicao].getProduto().getNome());
			posicao++;
		}
	}
	
	public double calcularValor() {
		double total = 0.0;
		for (int i = 0; i<posicao; i++){
			if(this.itens[i]!=null)
			total += this.itens[i].getProduto().getValor();
		}
		
		return total;
	}
}