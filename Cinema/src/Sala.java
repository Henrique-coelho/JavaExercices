import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Sala {
	private int numero;
	private int capacidade;
	private HashMap<String,Bilhete> assentos = new HashMap<>();
	private int cont;
	private int cadeirasDisponiveis;
	
	public Sala(int numero, int capacidade) {
		this.setNumero(numero);
		this.setCapacidade(capacidade);
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public HashMap<String,Bilhete> getAssentos() {
		return assentos;
	}

	public void setAssentos(HashMap<String,Bilhete> assentos) {
		this.assentos = assentos;
	}
	
	public void percorrerHashMap() {
		int pularLugar = 0;
		String aux;
		
		Set<String> chaves = this.assentos.keySet();
		Iterator<String> it = chaves.iterator();
			while(it.hasNext()) {
				if (pularLugar==10) {
					System.out.println();
					pularLugar = 0;
				}
				aux = it.next();
				System.out.print(aux + " ");
				pularLugar++;
				cont++;
			}
	}
	
	public void adicionarOcupante (Bilhete bilhete, String chaveFila) {
		if (cadeirasDisponiveis>bilhete.getQuantidade()) {
		//if (cont<this.getCapacidade() && bilhete.getQuantidade()<=this.getCapacidade()) {
			for(int i=0; i<bilhete.getQuantidade(); i++){
				this.assentos.put(chaveFila, bilhete);
				cont++;
			}
		}
		else {
	
		}
		cont += bilhete.getQuantidade();
	}
		
	public int disponibilidade() {
		cadeirasDisponiveis = this.getCapacidade()-cont;
		return cadeirasDisponiveis;
	}
}
