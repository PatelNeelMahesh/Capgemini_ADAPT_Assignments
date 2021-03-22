/*
Make a function called composedValue that takes two 
functions f1 and f2 and a value and returns
f1(f2(value)), i.e., the first function called on 
the result of the second function called on the value.
function square(x) { return(x*x); }
function double(x) { return(x*2); }
composedValue(square, double, 5); --> 100 // I.e., square(double(5))
*/

const composedValue = (f1, f2, value) => () => f1(f2(value));

function square(x) {return x*x;}
function double(x) {return x*2;}

const show = composedValue(square, double, 5);

console.log(show());