import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import { Button, Card, Image } from 'semantic-ui-react';
import ProductService from '../services/productService';

export default function ProductDetail() {
	let { name } = useParams();

    const [product, setProduct] = useState([]);

	useEffect(() => {
		let productService = new ProductService();
		productService
			.getByProductName(name)
			.then((result) => setProduct(result.data.data));
	}, []);

	return (
		<div>
			<Card.Group>
				<Card fluid>
					<Card.Content>
						<Image
							floated="right"
							size="mini"
							src="https://react.semantic-ui.com/images/avatar/large/steve.jpg"
						/>
						<Card.Header>{product.productName}</Card.Header>
						<Card.Meta>Birim Fiyat : {product.unitPrice}</Card.Meta>
						<Card.Description>
							Açıklama : <strong>{product.quantityPerUnit}</strong>
						</Card.Description>
                        <Card.Content>Kategori : {product.category.categoryName}</Card.Content>
					</Card.Content>
					<Card.Content extra>
						<div className="ui two buttons">
							<Button basic color="green">Sepete Ekle</Button>
							<Button basic color="red" icon="heart outline" />
						</div>
					</Card.Content>
				</Card>
			</Card.Group>
		</div>
	);
}
