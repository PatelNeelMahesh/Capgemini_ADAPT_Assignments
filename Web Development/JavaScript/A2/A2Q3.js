function isEven(num) { return(num % 2 == 0);}

const find = (arr, test) => () => {
    for (i = 0; i < arr.length; i++) {
      if (test(arr[i])) {
        return arr[i];
      }
      continue;
    }
};
  
const torf = find([1, 3, 5, 4, 2], isEven);
  
console.log(torf());