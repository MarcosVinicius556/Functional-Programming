package consumer;

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
		
		/* Forma implementando consumer */
//		list.forEach(new ProductConsumer());
		
		/* Referência stática */
//		list.forEach(Product::staticPriceUpdate);
		
		/* Referência NÃO stática */
//		list.forEach(Product::nonStaticPriceUpdate);
		
		/* Expressão lambda declarada */
//		double factor = 1.1;
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * factor);
//		};
//		list.forEach(cons);
		
		/* Expressão lambda INLINE */
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		/* Reference Method */
		list.forEach(System.out::println);
	}
	
}
