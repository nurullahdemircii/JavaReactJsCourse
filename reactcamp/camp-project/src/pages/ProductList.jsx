import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import { Button, Icon, Label, Menu, Table } from 'semantic-ui-react';
import ProductService from '../services/productService';
import { useDispatch } from 'react-redux';
import { addToCart, removeFromCart } from '../store/actions/cartActions';
import { toast } from 'react-toastify';

export default function ProductList() {
	const dispatch = useDispatch();
	const handleAddToCart = (product) => {
		dispatch(addToCart(product));
		toast.success(`${product.productName} Sepete Eklendi.`);
	};
	const handleRemoveFromCart = (product) => {
		dispatch(removeFromCart(product));
		toast.success(`${product.productName} Sepetten Silindi!`);
	};

	// Lifecycle Hook => React'ın yaşam döngüsüne müdahale etmemize olanak tanır.
	// products => dönecek data bilgisini tanımlar.
	// setProducts => Bu fonksiyon ile products datasına müdahale etmemize olanak tanır. Hook olarak adlandırılır.
	// useState([]) => useState() fonksiyonuna default olarak boş bir array tanımlanır.
	// Burada Destructure işlemi yapılıyor.
	const [products, setProducts] = useState([]);

	// useEffect(()=>{ ... },[]); => [] köşeli parantez bu hook kodunda sürekli değişimini takip edilmek istenilen state'ler bu köşeli paratez içerisinde tanımlanır.
	useEffect(() => {
		let productService = new ProductService();
		productService
			.getProducts()
			.then((result) => setProducts(result.data.data));
	}, []);

	// Course Hatası

	return (
		<div>
			<Table celled>
				<Table.Header>
					<Table.Row>
						<Table.HeaderCell>Ürün Adı</Table.HeaderCell>
						<Table.HeaderCell>Birim Fiyatı</Table.HeaderCell>
						<Table.HeaderCell>Stok Adedi</Table.HeaderCell>
						<Table.HeaderCell>Açıklama</Table.HeaderCell>
						<Table.HeaderCell>Kategori</Table.HeaderCell>
						<Table.HeaderCell></Table.HeaderCell>
						<Table.HeaderCell></Table.HeaderCell>
					</Table.Row>
				</Table.Header>

				<Table.Body>
					{products.map((product) => (
						<Table.Row key={product.id}>
							<Table.Cell>
								<Link to={`/products/${product.id}`}>
									{product.productName}
								</Link>
							</Table.Cell>
							<Table.Cell>{product.unitPrice}</Table.Cell>
							<Table.Cell>{product.unitsInStock}</Table.Cell>
							<Table.Cell>{product.quantityPerUnit}</Table.Cell>
							<Table.Cell>
								{product.category.categoryName}
							</Table.Cell>
							<Table.Cell>
								<Button
									onClick={() => handleAddToCart(product)}
									icon="add"
								></Button>
							</Table.Cell>
							<Table.Cell>
								<Button
									onClick={() =>
										handleRemoveFromCart(product)
									}
									icon="delete"
								></Button>
							</Table.Cell>
						</Table.Row>
					))}
				</Table.Body>

				<Table.Footer>
					<Table.Row>
						<Table.HeaderCell colSpan="3">
							<Menu floated="right" pagination>
								<Menu.Item as="a" icon>
									<Icon name="chevron left" />
								</Menu.Item>
								<Menu.Item as="a">1</Menu.Item>
								<Menu.Item as="a">2</Menu.Item>
								<Menu.Item as="a">3</Menu.Item>
								<Menu.Item as="a">4</Menu.Item>
								<Menu.Item as="a" icon>
									<Icon name="chevron right" />
								</Menu.Item>
							</Menu>
						</Table.HeaderCell>
					</Table.Row>
				</Table.Footer>
			</Table>
		</div>
	);
}
