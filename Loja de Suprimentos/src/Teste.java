import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//definindo os produtos
		Produto mouse = new Produto("Mouse gamer sem fio", 40);
		Produto cooler = new Produto("Cooler para processador", 70.0);
		Produto teclado = new Produto("Teclado / mouse sem fio", 125.0);
		Produto monitor = new Produto("Monitor LED 24''", 692.0);
		
		//criando os itens na loja
		Item item1 = new Item(cooler, 1);
		Item item2 = new Item(mouse, 1);
		Item item3 = new Item(teclado, 1);
		Item item4 = new Item(monitor, 1);
		
		//criando a fatura
		int limiteFatura = 10;
		Fatura fatura = new Fatura(limiteFatura);
		
		System.out.println("Digite o código designado para comprar um item:");
		System.out.println("Atenção! Possuimos um limite de 10 itens vendidos por pessoa.");
		System.out.println("1:Cooler para processador - R$70,00");
		System.out.println("2:Mouse gamer sem fio - R$40,00");
		System.out.println("3:Teclado / mouse sem fio - R$125,00");
		System.out.println("4:Monitor LED 24'' - R$692,00");
		System.out.println("5:Finalizar a compra e exibir o valor total");
		
		
		int entrada = 0;
		int limiteCarrinho = limiteFatura;
		
		//laco que adiciona os itens ao carrinho e finaliza a compra
		for(;limiteCarrinho>0; limiteCarrinho--){
			entrada = input.nextInt();
			if(entrada == 1) {
				fatura.addItem(item1);
			}
			if(entrada == 2) {
				fatura.addItem(item2);		
			}
			
			if(entrada == 3) {
				fatura.addItem(item3);
			}
			
			if(entrada == 4) {
				fatura.addItem(item4);
			}
			
			if(entrada == 5) {
				break;
			}
			
			if(limiteCarrinho == 1) {
				System.out.println("Limite do carrinho atingido! Prossiga para o pagamento\n");
			}
		}
		
		//exibir o valor
		System.out.println("O valor da sua compra é de R$"+fatura.calcularValor()+"0");
		input.close();
	}
}
