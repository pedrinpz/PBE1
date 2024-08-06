package prjCaneta;

class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Livro livro01 = new livro("Alice no Pais", "Julio Trigueiro");
          Livro livro02 = new livro("Quarto de despejo", "Pedro");
          
          System.out.println("Livros disponiveis");
          System.out.print("01." );
	      livro01.status();
	      System.out.print("02. ");
	      livro02.status();
	      
	      System.out.printl("Qual livro deseja alugar?");
	      int escolha = sc.nexInt();
	      
	      
	
	
	
	}
	

}
