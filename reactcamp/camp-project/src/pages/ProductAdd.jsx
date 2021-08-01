import React from 'react';
import { Form, Formik } from 'formik';
import * as Yup from 'yup';
import { Button } from 'semantic-ui-react';
import UpiTextInput from '../utilities/UpiTextInput';

export default function ProductAdd() {
	const initialValues = {
		productName: '',
		unitPrice: 10,
	};

	const schema = Yup.object({
		productName: Yup.string().required('Ürün Adı Zorunlu'),
		unitPrice: Yup.number().required('Ürün Fiyati Zorunlu'),
	});

	return (
		<div>
			<Formik 
            initialValues={initialValues} 
            validationSchema={schema}
            onSubmit={(values)=>{
                console.log(values)
            }}
            >
				<Form className="ui form">
                    <UpiTextInput name="productName" placeholder="Ürün Adı" />
                    <UpiTextInput name="unitPrice" placeholder="Ürün Fiyatı" />
					
                    {/* <FormField>
						<Field name="productName" placeholder="Ürün Adı"></Field>
                        <ErrorMessage name="productName" render={error=>
                            <Label pointing basic color="red" content={error}></Label>
                        }></ErrorMessage>
					</FormField> */}
					
                    <Button color="green" type="submit">EKLE</Button>
				</Form>
			</Formik>
		</div>
	);
}
