package nLayerDemo.dataAccess.abstracts;

import java.util.List;

import nLayerDemo.entities.concretes.Product;

public interface ProductDao {
	List<Product> getAll();
	Product getById(int id);
	void add(Product product);
	void update(Product product);
	void delete(Product product);
}
