var names = ["Tom", "Ivan", "Jerry"];
var arrayOfObjects = [];

names.forEach((value) => {
   arrayOfObjects.push({name: value, length: value.length})
});

console.log(arrayOfObjects);