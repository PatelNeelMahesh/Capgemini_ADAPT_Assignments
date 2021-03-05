//3.Enhanced object properties: Create an ‘Order’ object 
//having data members ‘id’, ‘title’, ‘price’. Add the methods 
//printOrder() & getPrice(). Now, copy the order object using 
//Object.assign().

let obj = {id:1,title:"one",price:100};

const po = {
	printOrder(){
		return obj;
}};
console.log(po.printOrder());

const gp = {
	getPrice(){
		return obj.price;
}};
console.log(gp.getPrice());

let object = Object.assign({},obj);
console.log(object);