package _07EstruturaRepeticao;

public class _02ExForArrays {

	public static void main(String[] args) {
		//indice em arrays se inicia sempre por 0
		String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };
		
		for (int x = 0; x < alunos.length; x++) {
			System.out.println("o aluno no indice x=" + x + " é " + alunos[x]);
			
			
			//exemplo mais amigavel
	
				String alunos1 [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
				
			        //Forma abreviada
				for(String aluno : alunos1) {
				  System.out.println(alunos1);
				}

		
			
			
		}
	}

}
