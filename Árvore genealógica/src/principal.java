import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de �rvores geneal�gicas. Comece digitando seu nome");
		Pessoa pessoa1 = new Pessoa(sc.nextLine());
		
		System.out.println("Agora digite o nome da sua m�e");
		Pessoa Mae = new Pessoa(sc.nextLine());
		pessoa1.setMae(Mae);
		
		System.out.println("Agora digite o nome do seu pai");
		Pessoa Pai = new Pessoa(sc.nextLine());
		pessoa1.setPai(Pai);
		
		System.out.println("Agora digite o nome do seu av� materno:");
        Pessoa paiDaMae = new Pessoa(sc.nextLine());
        Mae.setPai(paiDaMae);
        
        System.out.println("Agora digite o nome da sua av� materna:");
        Pessoa maeDaMae = new Pessoa(sc.nextLine());
        Mae.setMae(maeDaMae);
        
        System.out.println("Agora digite o nome do seu av� paterno:");
        Pessoa paiDoPai = new Pessoa(sc.nextLine());
        Pai.setPai(paiDoPai);
          
        System.out.println("Agora digite o nome da sua av� paterna:");
        Pessoa maeDoPai = new Pessoa(sc.nextLine());
        Pai.setMae(maeDoPai);
        
        System.out.println("A partir daqui, voc� poder� analisar suas conex�es com outras pessoas na �rvore geneal�gica.\n"+"Digite o nome da pessoa a ser analisada");
        Pessoa pessoa2 = new Pessoa(sc.nextLine());
        
        System.out.println("Digite o nome da m�e dessa pessoa:");
        Pessoa mae2 = new Pessoa(sc.nextLine());
        pessoa2.setMae(mae2);
        
        System.out.println("Digite o nome do pai dessa pessoa:");
        Pessoa pai2 = new Pessoa(sc.nextLine());
        pessoa2.setPai(pai2);
        
        System.out.println("\nDigite o n�mero da fun��o para an�lise:\n"
                + "1:Conferir igualdade sem�ntica entre voc� e a pessoa escolhida\n"
                + "2:Conferir se voc� e a pessoa escolhida s�o irm�os\n"
                + "3:Analizar se voc� � ancestral da pessoa escolhida\n"
                + "4:Finalizar o programa");
        
           int entrada = sc.nextInt();
            while(entrada > 0 && entrada < 5) {
	            
            	if(entrada == 1){
	                
	                if(pessoa1.conferirIgualdadeSemantica(pessoa2) == true){
	                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " s�o a mesma pessoa!\n");
	                }
	                else{
	                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " n�o s�o a mesma pessoa!\n");
	                }
	                System.out.println("\nDigite o n�mero da fun��o para an�lise:\n"
	                        + "1:Conferir igualdade sem�ntica entre dois nomes\n"
	                        + "2:Conferir se duas pessoas s�o irm�s\n"
	                        + "3:Analizar ancestralidade\n"
	                        + "4:Finalizar o programa");
	                
	                entrada = sc.nextInt();
	            }
	            
	            if(entrada == 2){
	                
	                if(pessoa1.conferirIrmaos(pessoa2) == true) {
	                	System.out.println("Os dois s�o irm�os");
	                }
	                else
	                	System.out.println("Os dois n�o s�o irm�os");
	                
	                System.out.println("\nDigite o n�mero da fun��o para an�lise:\n"
	                        + "1:Conferir igualdade sem�ntica entre dois nomes\n"
	                        + "2:Conferir se duas pessoas s�o irm�s\n"
	                        + "3:Analizar ancestralidade\n"
	                        + "4:Finalizar o programa");
	                
	                entrada = sc.nextInt();
	            }
	            
	            if(entrada == 3){
	                
	                if(pessoa1.antecessores(pessoa2).toLowerCase().equals("pai")){
	                    System.out.println(pessoa2.getNome() + " � pai do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("mae")){
	                    System.out.println(pessoa2.getNome() + " � m�e do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo materna")){
	                    System.out.println(pessoa2.getNome() + " � av� materna do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo paterno")){
	                    System.out.println(pessoa2.getNome() + " � av� paterna do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo materno")){
	                    System.out.println(pessoa2.getNome() + " � av� materno do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("avo paterno")){
	                    System.out.println(pessoa2.getNome() + " � av� paterno do(a) " + pessoa1.getNome()+"\n");
	                }
	                else if(pessoa1.antecessores(pessoa2).toLowerCase().equals("vazio")){
	                    System.out.println(pessoa2.getNome() + " n�o � ancestral do(a) " + pessoa1.getNome()+"\n");
	                }
	                
	                System.out.println("\nDigite o n�mero da fun��o para an�lise:\n"
	                        + "1:Conferir igualdade sem�ntica entre dois nomes\n"
	                        + "2:Conferir se duas pessoas s�o irm�s\n"
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
