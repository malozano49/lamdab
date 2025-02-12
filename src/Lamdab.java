import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdab {

	public static void main(String[] args) {
		String[] vowels = {"a","e","i","o","u"};
		List<String> vowelsList = Arrays.asList(vowels);
		/** forEach es un for*/
		vowelsList.forEach(obj -> {
			System.out.println(obj);
		
			}
		);
		/**.filter(Obj -> condicion): filtro*/
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/**
		x: es el nombre del objeto de la expresión lamdab filter() 
		.filter(condición [x==5 o objeto]): filtrar los elementos de la lista con una condicioen
			ejemplos:
			 	.filter(x -> x==5)
			 	.filter(c -> c.getPoints() > 100)
		.forEach(): recorrer la lista como un for
			n: es el nombre del objeto dentro de la expresión lamdab .forEach() 
			.forEach((n) -> System.out.println("prueba: "+ n)
		*/
		/*
		lista.stream()
	     .filter(x -> x==5)
	     .forEach(n -> System.out.println(n));
		*/
		
		
		
		
		
		/**
		 * 
		 * El uso de Java Stream map es una de las operaciones más comunes cuando trabajamos con un flujo de Streams .
		 * El método map nos permite realizar una transformación rápida de los datos y muy directa sobre el flujo original
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
		 *  collect () se usa principalmente para recopilar los elementos de flujo en una colección.List<Integer> listOfIntegers
		 * .collect(Collectors.toList()
		 * colección= List<Integer> listOfIntegers
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
		 * .reversed(): metodo que invierte el orden de clasificación del original.
		 */
		
		/**
		 * Comparator.reverseOrder() se utiliza para obtener el comparador que impone el orden inverso del comparador especificado.
		 * */
 	}

}
