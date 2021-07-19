let products = [
    {id:1, name: "Acer Laptop", unitPrice: 15000},
    {id:2, name: "Asus Laptop", unitPrice: 16000},
    {id:3, name: "Hp Laptop", unitPrice: 13000},
    {id:4, name: "Dell Laptop", unitPrice: 12000},
    {id:5, name: "Casper Laptop", unitPrice: 17000},
];

// map => Array'i foreach gibi döner.
console.log("<ul>");
products.map(product => console.log(`<li>${product.name}</li>`));
console.log("</ul>");
console.log("/* --------------------------------------------------- */");
// map içerisinde tek satır yazılmak istendiğinde {} gerek yoktur. Çok satır yazılmak istendiğinde {} kullanılır.
products.map(product => {
    console.log(product);
    console.log(`<li>${product.name}</li>`);
});
console.log("/* --------------------------------------------------- */");

// filter => Elimizdeki Array'i filtreleyerek yepyeni bir yeni Array oluşturur.
// ReactJs'te sayfa her render edildiğinde filter sayesinde referans değiştirilmiş oluyor.
// Sayfanın render edilmesi demek sayfa yenilendiğinde referansı değişen kısımlar sayfada değişebiliyor. Bu yüzden filter çok önemli.
let filteredProducts = products.filter(product => product.unitPrice > 12000);
console.log(filteredProducts);
console.log("/* --------------------------------------------------- */");

// reduce => Akümülatör görevi görür. 
// sepetteki ürünlerin fiyatlarını toplamaya yarar. sondaki 0 başlangıç değeridir.
// Yeni ürün geldiğinde acc'nin sürekli üzerine eklenir. Toplam acc'de olur.
let cartTotal = products.reduce((acc, product) => acc + product.unitPrice, 0);
console.log(cartTotal);
console.log("/* --------------------------------------------------- */");

let cartTotal2 = products
                    .filter(p => p.unitPrice > 13000)
                    .map(p => {
                        p.unitPrice = p.unitPrice*1.18
                        return p;
                    })
                    .reduce((acc, p) => acc + p.unitPrice, 0);
console.log(cartTotal2);