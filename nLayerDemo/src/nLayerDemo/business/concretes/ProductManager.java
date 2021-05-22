package nLayerDemo.business.concretes;

import java.util.List;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.core.abstracts.LoggerService;
import nLayerDemo.dataAccess.abstracts.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService){
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public List<Product> getAll() {
		return this.productDao.getAll();
	}

	@Override
	public Product getById(int id) {
		return this.productDao.getById(id);
	}

	@Override
	public void add(Product product) {
		this.productDao.add(product);
		this.loggerService.logToSystem(product.getName() + "Ürün Eklendi.");
	}

	@Override
	public void update(Product product) {
		this.productDao.update(product);
	}

	@Override
	public void delete(Product product) {
		this.productDao.delete(product);
	}
	
}
