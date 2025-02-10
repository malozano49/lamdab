import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdab {
//https://www.arquitecturajava.com/java-stream-filter-y-predicates/
	
	
	
	
	public static void main(String[] args) {
		String[] vowels = {"a","e","i","o","u"};
		
		List<String> vowelsList = Arrays.asList(vowels);
		System.out.println(vowelsList);

		/** forEach es un for*/
		vowelsList.forEach(obj -> {
			System.out.println(obj);
		
			}
		);
		/**.filter(Obj -> condicion): filtro*/
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/**
		x: es el nombre del objeto de la expresi�n lamdab filter() 
		.filter(condici�n [x==5 o objeto]): filtrar los elementos de la lista con una condicioen
			ejemplos:
			 	.filter(x -> x==5)
			 	.filter(c -> c.getPoints() > 100)
		.forEach(): recorrer la lista como un for
			n: es el nombre del objeto dentro de la expresi�n lamdab .forEach() 
			.forEach((n) -> System.out.println("prueba: "+ n)
		*/
		/*
		lista.stream()
	     .filter(x -> x==5)
	     .forEach(n -> System.out.println(n));
		*/
		
		
		
		
		
		/**
		 * 
		 * El uso de Java Stream map es una de las operaciones m�s comunes cuando trabajamos con un flujo de Streams .
		 * El m�todo map nos permite realizar una transformaci�n r�pida de los datos y muy directa sobre el flujo original
		 * 
		 * 
		 * 
		 * 
		 * 
		 * .map(Integer::valueOf)
		 * Convertir
		 * convertir una lista de String a una lista de Integer*/
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 
		List<Integer> listOfIntegers = listOfStrings.stream()
		        .map(Integer::valueOf)
		        .collect(Collectors.toList());
		/**
		 *  collect () se usa principalmente para recopilar los elementos de flujo en una colecci�n.List<Integer> listOfIntegers
		 * .collect(Collectors.toList()
		 * colecci�n= List<Integer> listOfIntegers
		 * */ 
		//System.out.println(listOfIntegers);
		/**
		 * .sorted(): ordenacion de la lista
		 */
		lista = Arrays.asList(1,2,3,4,5,6,8,7,9,10);
		//lista.stream().sorted().forEach(System.out::println);
		 /** Ordenacion con  un comparador
		/ lista.stream().sorted(Comparator.comparing(ObjetoPersona::Getter del un atributo)).forEach(System.out::println);
		 *		ejemplo: lista.stream().sorted(Comparator.comparing(Persona::getApellidos)).forEach(System.out::println);
		 * 		ejemplo de ODA: .sorted(Comparator.comparing(OpacJobInstance::getId).reversed())
		 * .reversed(): metodo que invierte el orden de clasificaci�n del original.
		 */
		
		/**
		 * Comparator.reverseOrder() se utiliza para obtener el comparador que impone el orden inverso del comparador especificado.
		 * */
///		KKKKKKKK
	}

}
