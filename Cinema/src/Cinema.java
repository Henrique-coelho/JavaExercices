import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cinema {
	//private ArrayList<Filme> filmes;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//para um usuario adicionar filmes
		/*
		 for(int i=0; i<5;i++) {
			System.out.println("informe o titulo do filme");
			String titulo = input.next();
			System.out.println("informe o genero do filme");
			String genero = input.next();
			System.out.println("informe o diretor do filme");
			String diretor = input.next();
			filmes.add(new Filme(titulo,genero,diretor,new Sala(i,60)));
		}
		*/
		
        
        //criando as salas
        Sala sala1 = new Sala(1,30);
        Sala sala2 = new Sala(2,30);
        Sala sala3 = new Sala(3,30);
        Sala sala4 = new Sala(4,30);
        
        
		//para os filmes serem pre adicionados
        ArrayList<Filme> filmes = new ArrayList<>();
		filmes.add(new Filme("Carros","Suspense","Pedro",sala1));
		filmes.add(new Filme("A volta dos que nao foram","Terror","Faustao",sala2));
		filmes.add(new Filme("Filme das abelhas","Romance","Billy",sala3));
		filmes.add(new Filme("Infinita highway","Musical","Humberto",sala4));
		//-------------------------------- Interacao com o usuário ---------------------------------//
		
		System.out.println("Bem vindo ao CineCefet!\n");
		System.out.println("No dia de hoje serão exibidos os seguintes filmes:\n");
		
		//listando filmes
			Iterator<Filme>it = filmes.iterator();
			while(it.hasNext()) {
				Filme aux = it.next();
				System.out.println("Titulo: "+aux.getTitulo());
				System.out.println("Sala: "+aux.getSala().getNumero());
				System.out.println("Diretor: "+aux.getDiretor());
				System.out.println("Genero: "+aux.getGenero()+ "\n");
			}
			
		System.out.println("Digite a quantidade de ingressos que deseja comprar");
		int quant = input.nextInt();
		System.out.println("Digite o codigo do filme que deseja assistir");
		System.out.println("0:Carros = R$30,00 por ingresso");
		System.out.println("1:a volta dos que nao foram = R$15,00 por ingresso");
		System.out.println("2:abelhas = R$25,00 por ingresso");
		System.out.println("3:infinita highway = R$40,00 por ingresso");
		
		//selecionando o filme escolhido pelo cliente
		int aux = input.nextInt();
		Filme escolha = null;
		escolha = filmes.get(aux);
		
		//Definindo valor do ingresso que será utilizado no bilhete (pode ser alterado caso ocorra promocoes
		int valorIngresso = 0;
		if(aux == 0)
			valorIngresso = 30;
		else if (aux == 1)
			valorIngresso = 15;
		else if (aux == 2)
			valorIngresso = 25;
		else if (aux == 3)
			valorIngresso = 40;
		
		//criando o bilhete do cliente
		Bilhete cliente1 = new Bilhete(valorIngresso, escolha);
		cliente1.setQuantidade(quant);
		
		//conferindo disponibilidade de lugares na sala
		if (escolha.getSala().disponibilidade()== 0) {
			System.out.println("Sala cheia");
		}
		else if(escolha.getSala().disponibilidade() >= quant){
			for(int i =0; i<quant;i++) {
				String chave = Integer.toString(i);
				escolha.getSala().adicionarOcupante(cliente1, chave);
			}	
			cliente1.imprimirNota(escolha, quant);
		}
		else{
			System.out.println("Cadeiras disponiveis insuficientes para essa quantidade de ingressos");
		}
		
	input.close();
	}
}