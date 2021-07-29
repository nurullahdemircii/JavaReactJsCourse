import React from 'react';
import { NavLink } from 'react-router-dom';
import { Dropdown, DropdownDivider, Label } from 'semantic-ui-react';
import { useSelector } from 'react-redux';

export default function CartSummary() {
	const { cartItems } = useSelector(state => state.cart);

	return (
		<div>
			<Dropdown item text="Sepet">
				<Dropdown.Menu>
					{cartItems.map((cart) => (
						<Dropdown.Item key={cart.product.id}>
							{cart.product.productName}
                            <Label style={{marginLeft:"0.5em"}}>
                                {cart.quantity}
                            </Label>
						</Dropdown.Item>
					))}
					<Dropdown.Divider />
					<Dropdown.Item as={NavLink} to="/cart">
						Sepete Git
					</Dropdown.Item>
				</Dropdown.Menu>
			</Dropdown>
		</div>
	);
}
