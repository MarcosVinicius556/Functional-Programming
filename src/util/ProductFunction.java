package util;

import java.util.function.Function;

import entities.Product;

/**
 * 
 * @author Implementando a interface Function
 *
 */
public class ProductFunction implements Function<Product, String>{

	@Override
	public String apply(Product t) {
		return t.getDescription().toUpperCase();
	}

}
