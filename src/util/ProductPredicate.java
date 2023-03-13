package util;

import java.util.function.Predicate;

import entities.Product;

/**
 * 
 * @author Marcos Vinicius
 *
 *
 *@apiNote Classe que implementa o método abstrato da interface Predicate (Interface funcional)
 */
public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		return t.getPrice() >= 100.00;
	}

}
