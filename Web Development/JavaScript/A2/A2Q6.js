function squareRoot(arr) {
   var resultRoot=[].concat(arr);
   resultRoot.forEach(function(i){
      n=i^0.5;
   })
   return resultRoot;
 }

function square(arr) {
   var result=[].concat(arr);
   result.forEach(function(i){
      n=i*i;
   })
   return result;
 }

console.log(square(arr));
console.log(squareRoot(arr));