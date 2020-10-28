import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de árvores genealógicas. Comece digitando seu nome");
		Pessoa pessoa1 = new Pessoa(sc.nextLine());
		
		System.out.println("Agora digite o nome da sua mãe");
		Pessoa Mae = new Pessoa(sc.nextLine());
		pessoa1.setMae(Mae);
		
		System.out.println("Agora digite o nome do seu pai");
		Pessoa Pai = new Pessoa(sc.nextLine());
		pessoa1.setPai(Pai);
		
		System.out.println("Agora digite o nome do seu avô materno:");
        Pessoa paiDaMae = new Pessoa(sc.nextLine());
        Mae.setPai(paiDaMae);
        
        System.out.println("Agora digite o nome da sua avó materna:");
        Pessoa maeDaMae = new Pessoa(sc.nextLine());
        Mae.setMae(maeDaMae);
        
        System.out.println("Agora digite o nome do seu avô paterno:");
        Pessoa paiDoPai = new Pessoa(sc.nextLine());
        Pai.setPai(paiDoPai);
          
        System.out.println("Agora digite o nome da sua avó paterna:");
        Pessoa maeDoPai = new Pessoa(sc.nextLine());
        Pai.setMae(maeDoPai);
        
        System.out.println("A partir daqui, você poderá analisar suas conexões com outras pessoas na árvore genealógica.\n"+"Digite o nome da pessoa a ser analisada");
        Pessoa pessoa2 = new Pessoa(sc.nextLine());
        
        System.out.println("Digite o nome da mãe dessa pessoa:");
        Pessoa mae2 = new Pessoa(sc.nextLine());
        pessoa2.setMae(mae2);
        
        System.out.println("Digite o nome do pai dessa pessoa:");
        Pessoa pai2 = new Pessoa(sc.nextLine());
        pessoa2.setPai(pai2);
        
        System.out.println("\nDigite o número da função para análise:\n"
                + "1:Conferir igualdade semântica entre você e a pessoa escolhida\n"
                + "2:Conferir se você e a pessoa escolhida são irmãos\n"
                + "3:Analizar se você é ancestral da pessoa escolhida\n"
                + "4:Finalizar o programa");
        
           int entrada = sc.nextInt();
            while(entrada > 0 && entrada < 5) {
	            
            	if(entrada == 1){
	                
	                if(pessoa1.conferirIgualdadeSemantica(pessoa2) == true){
	                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " são a mesma pessoa!\n");
	                }
	                else{
	                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " não são a mesma pessoa!\n");
	                }
	                System.out.println("\nDigite o número da função para análise:\n"
	                        + "1:Conferir igualdade semântica entre dois nomes\n"
	                        + "2:Conferir se duas pessoas são irmãs\n"
	                        + "3:Analizar ancestralidade\n"
	                        + "4:Finalizar o programa");
	                
	                entrada = sc.nextInt();
	            }
	            
	            if(entrada == 2){
	                
	                if(pessoa1.conferirIrmaos(pessoa2) == true) {
	                	System.out.println("Os dois são irmãos");
	                }
	                else
	                	System.out.println("Os dois não são irmãos");
	                
	                System.out.println("\nDigite o número da função para análise:\n"
	                        + "1:Conferir igualdade semântica entre dois nomes\n"
	                        + "2:Conferir se duas pessoas são irmãs\n"
	                        + "3:Analizar ancestralidade\n"
	                        + "4:Finalizar o programa");
	                
	                entrada = sc.nextInt();
	            }
	            
	            if(entrada == 3){
	                
	                if(pessoa1.antecessores(pessoa2).toLowerCase().equals("pai")){
	                    System.out.println(pessoa2.getNome() + " é pai do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("mae")){
	                    System.out.println(pessoa2.getNome() + " é mãe do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo materna")){
	                    System.out.println(pessoa2.getNome() + " é avó materna do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo paterno")){
	                    System.out.println(pessoa2.getNome() + " é avó paterna do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo materno")){
	                    System.out.println(pessoa2.getNome() + " é avô materno do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo paterno")){
	                    System.out.println(pessoa2.getNome() + " é avô paterno do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("vazio")){
	                    System.out.println(pessoa2.getNome() + " não é ancestral do(a) " + pessoa1.getNome()+"\n");
	                }
	                
	                System.out.println("\nDigite o número da função para análise:\n"
	                        + "1:Conferir igualdade semântica entre dois nomes\n"
	                        + "2:Conferir se duas pessoas são irmãs\n"
	                        + "3:Analizar ancestralidade\n"
	                        + "4:Finalizar o programa");
	                
	                entrada = sc.nextInt();
	            }
	            if (entrada == 4) {
	            	break;
	            }
            }
            sc.close();
	}
}
