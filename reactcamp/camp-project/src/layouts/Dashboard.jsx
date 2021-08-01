import React from 'react';
import ProductList from '../pages/ProductList';
import ProductDetail from '../pages/ProductDetail';
import CartDetail from '../pages/CartDetail';
import Categories from './Categories';
import { Grid } from 'semantic-ui-react';
import { Route, Switch } from 'react-router-dom';
import { ToastContainer } from 'react-toastify';
import ProductAdd from '../pages/ProductAdd';

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
                            <Route path="/product/add" component={ProductAdd} />
                        </Switch>
                    </Grid.Column>
                </Grid.Row>
            </Grid>
        </div>
    )
}
/*

React Lesson - 014

Build forms in React, without the tears (Formik.org)
Form builder
npm install formik

Yup is a JavaScript schema builder for value parsing and validation.
https://github.com/jquense/yup (Yup)
npm install yup

ProjectAdd.jsx Post Operation

Ticket  :   Lesson-014
Date    :   01.08.2021   

*/