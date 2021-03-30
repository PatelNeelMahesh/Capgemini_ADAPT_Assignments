var text = '{"firstName":"fname", "lastName":"function() {return "lname";}", "city":"New Delhi}';

var obj = JSON.parse(text);

obj.lastName = eval("("+ obj.lastName +")");

console.log(obj.firstName + obj.lastName());
