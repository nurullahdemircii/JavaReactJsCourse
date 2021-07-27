import React from 'react';
import { Menu } from 'semantic-ui-react';
import { Link } from 'react-router-dom';

export default function Categories() {
	return (
		<div>
			<Menu inverted pointing vertical>
				<Menu.Item name="home" />
				<Menu.Item name="products">
					<Link exact to="/products">
						Products
					</Link>
				</Menu.Item>
				<Menu.Item name="friends" />
			</Menu>
		</div>
	);
}
