package inner_class;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductLamd11 {
	private String product;
	private String category;
	
	public ProductLamd11(String product, String category) {
		this.product = product;
		this.category = category;
	}

	public String getProduct() {
		return product;
	}

	public String getCategory() {
		return category;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String toString() {
		return product;
	}

	public static void main(String[] args) {
		List<ProductLamd11> product = Arrays.asList(
				new ProductLamd11("Television" ,"Electronic"),
				new ProductLamd11("banana","fruit"),
				new ProductLamd11("mobile" ,"Electronic"),
				new ProductLamd11("apple","fruit"),
				new ProductLamd11("potato","vegetable"),
				new ProductLamd11("brocoli" ,"vegetable")
				
		);
		
		Map<String , List<ProductLamd11>> group = product.stream().collect(Collectors.groupingBy(ProductLamd11::getCategory));
		group.forEach((category , productList)-> System.out.println(category +":"+ productList)); 
	}
	
	

}
