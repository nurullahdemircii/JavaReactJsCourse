import React from 'react';
import ProductList from '../pages/ProductList';
import ProductDetail from '../pages/ProductDetail';
import CartDetail from '../pages/CartDetail';
import Categories from './Categories';
import { Grid } from 'semantic-ui-react';
import { Route } from 'react-router';

export default function Dashboard() {
    return (
        <div>
            <Grid columns={3}>
                <Grid.Row>
                    <Grid.Column width={4}>
                        <Categories />
                    </Grid.Column>
                    <Grid.Column width={12}>
                        <Route exact path="/" component={ProductList} />
                        <Route exact path="/products" component={ProductList} />
                        <Route path="/products/:name" component={ProductDetail} />
                        <Route path="/cart" component={CartDetail} />
                    </Grid.Column>
                </Grid.Row>
            </Grid>
        </div>
    )
}
/*

    React Lesson - 012
    
    const [isAuthenticated, setisAuthenticated] = useState(true)
    props, onClick
    router, cmd(react-router-dom), Index.js(BrowserRouter)
    Dashboard(exact, component, path="../:id")
    API Connection,
    React Router Dom 

    Ticket  :   Lesson-012
    Date    :   27.07.2021   

*/