const square = (x) => x * x;

const map = (arr, fun) => () => {
  for (i = 0; i < arr.length; i++) {
    arr[i] = fun(arr[i]);
  }
  return arr;
};

const getS = map([1, 2, 3, 4, 5], square);
console.log(getS());

const getSM = map([1, 4, 9, 16, 25], Math.sqrt);
console.log(getSM());