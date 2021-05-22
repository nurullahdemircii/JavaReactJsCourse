package nLayerDemo.dataAccess.concretes;

import java.util.List;

import nLayerDemo.dataAccess.abstracts.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile ürün eklendi." + product.getName());	
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate ile ürün güncellendi." + product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate ile ürün silindi." + product.getName());
	}

}
