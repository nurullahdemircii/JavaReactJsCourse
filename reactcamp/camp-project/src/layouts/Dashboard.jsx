import React from 'react';
import ProductList from '../pages/ProductList';
import ProductDetail from '../pages/ProductDetail';
import CartDetail from '../pages/CartDetail';
import Categories from './Categories';
import { Grid } from 'semantic-ui-react';
import { Route, Switch } from 'react-router-dom';
import { ToastContainer } from 'react-toastify';

export default function Dashboard() {
    return (
        <div>
            <ToastContainer position="bottom-right" />
            <Grid columns={3}>
                <Grid.Row>
                    <Grid.Column width={4}>
                        <Categories />
                    </Grid.Column>
                    <Grid.Column width={12}>
                        <Switch>
                            <Route exact path="/" component={ProductList} />
                            <Route exact path="/products" component={ProductList} />
                            <Route path="/products/:id" component={ProductDetail} />
                            <Route path="/cart" component={CartDetail} />
                        </Switch>
                    </Grid.Column>
                </Grid.Row>
            </Grid>
        </div>
    )
}
/*

React Redux Lesson - 013

Redux
state management, global state, store
npm install react-redux
npm install redux
npm install redux-devtools-extension
CRUD operations equal action for Redux.
global state equal reducer for Redux.
New Folder in src { store }
New Folder in store { actions, initialValues, reducer }
useSelector, dispatch
npm install toastify

Ticket  :   Lesson-013
Date    :   29.07.2021   

*/