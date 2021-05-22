package nLayerDemo;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.business.concretes.ProductManager;
import nLayerDemo.core.concretes.JLoggerManagerAdapter;
import nLayerDemo.dataAccess.concretes.HibernateProductDao;
import nLayerDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Asus N61JQ", 1, 2000);
		productService.add(product);
		
	}
}
