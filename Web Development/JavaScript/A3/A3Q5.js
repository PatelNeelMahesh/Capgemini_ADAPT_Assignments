const obj = new person("fname", "lname");

function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

console.log(obj.middleName);

obj.middleName="mname";

console.log(obj.firstName);
console.log(obj.middleName);
console.log(obj.lastName);
