package function;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/* Função map funciona a partir de uma stream */
		
		/* Utilizando implementação da interface */
//		List<String> descriptions = list.stream().map(new ProductFunction()).collect(Collectors.toList());
		
		/*Por referencia estática*/
//		List<String> descriptions = list.stream().map(Product::staticUpperCaseDescription).collect(Collectors.toList());
		
		/*Por referencia NÃO estática*/
//		List<String> descriptions = list.stream().map(Product::nonStaticUpperCaseDescription).collect(Collectors.toList());
		
		/* Expressão lambda declarada */
//		Function<Product, String> fun = p -> p.getDescription().toUpperCase();
//		List<String> descriptions = list.stream().map(fun).collect(Collectors.toList());
		
		/* Expressão lambda INLINE */
//		List<String> descriptions = list.stream().map(p -> p.getDescription().toUpperCase()).collect(Collectors.toList());
		
//		descriptions.forEach(System.out::println);
		
		
		/* Implementando função que recebe uma função*/
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getDescription().charAt(0) == 'T');
		
		System.out.println(sum);
	}
	
}
