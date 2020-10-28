
public class Pessoa {
	
	private String nome;
	private Pessoa Pai;
	private Pessoa Mae;
	
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.Pai = null;
		this.Mae = null;
	}
	
	public Pessoa(String nome, Pessoa mae, Pessoa pai) {
		this.nome = nome;
		this.Mae = mae;
		this.Pai = pai;
	}
	
	public boolean conferirIgualdadeSemantica(Pessoa pessoa) {
		boolean teste;
		teste = this.nome.equals(pessoa.getNome()) && this.Mae.nome.equals(pessoa.getMae().getNome());
		return teste;
	}
	
	public boolean conferirIrmaos(Pessoa pessoa) {
		boolean isIrmao = false;
		if(this.Mae.nome.equals(pessoa.getMae().getNome()) || this.Pai.nome.equals(pessoa.getPai().getNome()) ){
			isIrmao = true;
		}
		return isIrmao;
	}
	
	public String antecessores(Pessoa pessoa) {
		String antecessor = "vazio";
			//Pai ou Mae
			if (pessoa.getNome().equals(this.Mae.nome)) {
				antecessor = "mae";
			}
			else if(pessoa.getNome().equals(this.Pai.nome)) {
				antecessor = "pai";
			}
			//Avo's maternos
			else if(pessoa.getNome().equals(this.Mae.Mae.nome)) {
				antecessor = "avo materna";
			}
			else if(pessoa.getNome().equals(this.Mae.Pai.nome)) {
				antecessor = "avo materno";
			}
			//Avo's paternos
			else if(pessoa.getNome().equals(this.Pai.Mae.nome)) {
				antecessor = "avo paterno";
			}
			else if(pessoa.getNome().equals(this.Pai.Pai.nome)) {
				antecessor = "avo paterno";
			}
		return antecessor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	


	public Pessoa getPai() {
		return Pai;
	}




	public void setPai(Pessoa pai) {
		Pai = pai;
	}




	public Pessoa getMae() {
		return Mae;
	}




	public void setMae(Pessoa mae) {
		Mae = mae;
	}
}