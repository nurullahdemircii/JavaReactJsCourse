import React, { useState } from 'react';
import { NavLink, useHistory } from 'react-router-dom';
import { Container, Menu } from 'semantic-ui-react';
import CartSummary from './CartSummary';
import SignedIn from './SignedIn';
import SignedOut from './SignedOut';
import { useSelector } from 'react-redux';

export default function Navi() {

	const { cartItems } = useSelector(state => state.cart);

	const [isAuthenticated, setisAuthenticated] = useState(true);
	const history = useHistory();

	function handleSignOut() {
		setisAuthenticated(false);
		history.push('/');
	}

	function handleSignIn() {
		setisAuthenticated(true);
	}

	return (
		<div>
			<Menu inverted fixed="top">
				<Container>
					<Menu.Item name="home" as={NavLink} to="/" />
					<Menu.Item name="products" as={NavLink} to="/products" />

					<Menu.Menu position="right">
						{cartItems.length>0&&<CartSummary />}
						{isAuthenticated ? (
							<SignedIn signOut={handleSignOut} bisey="1" />
						) : (
							<SignedOut signIn={handleSignIn} />
						)}
						;
					</Menu.Menu>
				</Container>
			</Menu>
		</div>
	);
}
