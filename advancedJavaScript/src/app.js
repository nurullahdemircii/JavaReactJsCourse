let sayi1 = 10;
sayi1 = "Engin Demiroğ";
let student = {id:1, name:"Engin"};
// console.log(student);

function save(puan=10, ogrenci){
    console.log(ogrenci.name + " " + puan);
}
// save(undefined, student);

let students = ["Engin Demiroğ", "Nurullah Demirci", "Halit Kalaycı", "Engin Toprak"];
// console.log(students);

let students2 = [student, {id:2, name:"Nurullah"}, "Trabzon", {city:"İstanbul"}];
// console.log(students2);

// Rest -> ... ile Aslında []Array oluşturulur.
// javascript Karşılığı    =   ...
// C# Karşılığı            =   params
// Java Karşılığı          =   varArgs
let showProducts = function (id, ...products){
    console.log(id);
    console.log(products);
    console.log(products[0]);
    console.log(products[0][0]);
}
// console.log(typeof showProducts);
// showProducts(10, "Elma", "Armut", "Karpuz", "Kavun");
// showProducts(10, ["Elma", "Armut", "Karpuz", "Kavun"]);

// Spread -> Ayrıştırmak anlamına gelir.
// Spread -> Var bir Array ayrıştırılır.
let points = [1,2,3,4,50,6,61,14];
// console.log(...points);
// console.log(Math.max(...points));
// console.log(..."ABC", "D", ..."EFG", "H");

// Destructuring -> Var olan bir Array'in değerlerini değişkenlere atama işlemini yapar.
let populations = [10000, 20000, 30000, [40000, 10000]];
let [small, medium, high, [veryHigh, maximum]] = populations; // small, medium, high, veryHigh, maximum bir değişkendir. İç içe 2 destructuring yapılmıştır.
// console.log(small);
// console.log(medium);
// console.log(high);
// console.log(veryHigh);
// console.log(maximum);

function someFunction([small1], number){
    console.log(small1);
}
// someFunction(populations);

let category = {id:1, name:"İçecek"};
// console.log(category.id); // category["id"] şeklinde de kullanılabilir.
// console.log(category["name"]);

let {id, name} = category;
console.log(id);
console.log(name);