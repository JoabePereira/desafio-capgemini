package questao2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Uma classe de usuários que cria um nome e uma senha
 * @author TI
 *
 */
public class Usuario {
	
	private String nome;
	private String senha;
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		
		if(validaSenha(senha))
			this.senha = senha;
	
	}
	
	/**
	 * Verifica se uma senha é válida de acordo com alguns critérios estabelecidos
	 * @param senha uma string qualquer
	 */
	private boolean validaSenha(String senha) {
		
		boolean validandoSenha = true;
		
		int tamanho = senha.length();
		int qtdRestante = 6 - tamanho;
		
		if(qtdRestante < 6 && qtdRestante > 0) {
			System.out.println("Precisamos de pelo menos mais " + qtdRestante + " caracter!");
			validandoSenha = false;
		}
		
		Pattern p1 = Pattern.compile("[0-9]"); 
		Pattern p2 = Pattern.compile("[a-z]");
		Pattern p3 = Pattern.compile("[A-Z]");
		Pattern p4 = Pattern.compile("[!@#$%^&*()\\-+]");
		
		Matcher m1 = p1.matcher(senha);
		Matcher m2 = p2.matcher(senha);
		Matcher m3 = p3.matcher(senha);
		Matcher m4 = p4.matcher(senha);
		
		boolean contem1 = m1.find();
		boolean contem2 = m2.find();
		boolean contem3 = m3.find();
		boolean contem4 = m4.find();
		
		if(!contem1) {
			System.out.println("A senha deve ter pelo menos 1 número!");
			validandoSenha = false;
		}
		
		if(!contem2) {
			System.out.println("A senha deve ter pelo menos 1 letra Minúscula!");
			validandoSenha = false;
		}

		if(!contem3) {
			System.out.println("A senha deve ter pelo menos 1 letra Maiúscula!");
			validandoSenha = false;
		}
		
		if(!contem4) {
			System.out.println("A senha deve ter pelo menos 1 caracter especial!");
			validandoSenha = false;
		}
		
		return validandoSenha;

	}
}
