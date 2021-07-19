// Değerleri atamak için prototip yapısından kullanılır.
// Aslında herşey fonksiyon ve fonksiyona prototip oluşturuluyor.
// export = public
export class Customer{
    constructor(id, customerNumber){
        // Prototyping => this.id, this.customerNumber
        this.id = id;
        this.customerNumber = customerNumber;
    }
}

let customer = new Customer(1, "12345");
// Prototyping
customer.name = "Nurullah Demirci";
console.log(customer.name);
Customer.id = 61;
console.log(Customer.id);

console.log(customer.customerNumber);

class IndividualCustomer extends Customer{
    constructor(firstName, id, customerNumber){
        super(id, customerNumber);
        this.firstName = firstName;
    }
}

class CorporateCustomer extends Customer{
    constructor(companyName, id, customerNumber){
        super(id, customerNumber);
        this.companyName = companyName;
    }
}