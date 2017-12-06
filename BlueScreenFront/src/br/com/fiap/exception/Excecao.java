package br.com.fiap.exception;

public class Excecao extends Exception{
	
	public static String getErro(Exception e){
		
		String erro = e.getClass().getName();
		if(erro.equals("IllegalArgumentException")){
			return "Valores inapropriados para o parametro";
		}else if(erro.equals("NullPointerException")){
			return "Objeto nao instanciado";
		}else if(erro.equals("NumberFormatException")){
			return "Valores não podem ser convertidos para número";
		}else if(erro.equals("SecurityException")){
			return "Violação de segurança";
		}else if(erro.equals("AssertionError")){
			return "Erro de retorno na função";
		}else if(erro.equals("ExceptionInitializerError")){
			return "Erro de instancia / inicialização";
		}else if(erro.equals("NoClassDefFoundError")){
			return "Erro de iniacialização no java";
		}else if(erro.equals("StackOverflowError")){
			return "Erro de looping em método";
		}else{
			return e.getClass().getName();
		}
		
	}
}
