const obj = new person("fname", "lname");

function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

console.log(obj.firstName)
console.log(obj.lastName)

obj.lastName="lastname";

console.log(obj.lastName)