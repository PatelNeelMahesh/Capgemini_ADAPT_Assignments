function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}
var firstName = 'fname';
var lastName = 'lname';
var fullName = `${firstName} ${lastName}`;

eval(`${firstName} ${lastName}`);

