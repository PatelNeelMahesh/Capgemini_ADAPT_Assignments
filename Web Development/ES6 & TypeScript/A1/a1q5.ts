
function add(a, b) {
    return a + b;
}
console.log(add(1, 2));

function userFriends(username, ...friends) {
    return username + "'s friends : " + friends.join(", ");
}
var friends = ["Two", "Three", "Four", "Five"];
console.log(userFriends("One", ...friends));

function printCapitalNames(one, two, three, four, five) {
    console.log(one.toUpperCase());
    console.log(two.toUpperCase());
    console.log(three.toUpperCase());
    console.log(four.toUpperCase());
    console.log(five.toUpperCase());
}

let allNames = [
    "One",
    "Two",
    "Three",
    "Four",
    "Five",
];

printCapitalNames(...allNames);