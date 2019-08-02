package com.angelpadilla.identifiers_and_keywords.legal_identifiers;

/**
 * Clase que explica los identificdores en Java 7.
 * 
 * @author IngenieroPadoya @ Twitter - abril, 2019
 * 
 * 
 * Un idetificador es una secuencia ilimitada de "letras y digitos Java", cuyo inicio debe ser una "letra Java".
 * 
 * Letras Java: 
 * 	- Letras latinas ASCII mayusculas y minusculas (A-Z, \u0041-\u005a), (a-z, \u0061-\u007a).
 * 	- Caracter de conexion ASCII (p. ej., guion bajo _, \u005f).
 *  - Caracter de divisa (p. ej., signo de dolar $, or \u0024). El caracter $ debera ser usado solamente en codigo generado
 *    automaticamente o en muy raras ocasiones para acceder a nombres pre existentes en sistemas legacy.
 * 
 * Digitos Java:
 * 	- Digitos ASCII (0-9, \u0030-\u0039).
 * 
 * Ejemplo: String ¤, ¥, £, $, _, ‿, ⁀, ⁔, ︳, ︴, ﹍, ﹎, ﹏, ＿;
 * 
 */
public class TestJavaIdentifiersStart {

	public static void main(String[] args) {
		
		if (args.length==1) {
			
			if (args[0].length() == 1) {
				
				char caracter = args[0].charAt(0);
				
				System.out.println(testJavaIdentifierStart(caracter));
				
			}else {
				System.out.println("Parametro invalido, solo se aceptan caracteres.");
			}
		}else if (args.length==0) {
			
			System.out.println("Ingrese un caracter.");
			
		}else if (args.length>1) {
			
			System.out.println("Ingrese solo un parametro.");
		}
	}
	
	public static String testJavaIdentifierStart(char caracter) {
		
		String respuesta = null;
		
		if (Character.isJavaIdentifierStart(caracter)) {
			
			respuesta = "Los identificadores en Java SI pueden empezar con: " + caracter;
			
		}else {
			// TODO: regex para digitos.
			respuesta = "Los identificadores en Java NO pueden empezar con: " + caracter;
		}
		
		return respuesta;
	}
}
