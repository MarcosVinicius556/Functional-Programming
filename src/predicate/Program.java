package predicate;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/* Recebe um predicate */
//		list.removeIf(p -> p.getPrice() >= 100);
		
		/* Classe que implementa o método abstrato da interface */
//		list.removeIf(new ProductPredicate());
		
		/* Referência statica */
//		list.removeIf(Product::staticProductPredicate);
		
		/* Referência não statica */
//		list.removeIf(Product::nonStaticProductPredicate);
		
		/* Declarando a interface */
//		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
//		list.removeIf(pred);
		
		/*Declaração inline (lambda) */
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
	
}
