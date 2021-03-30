function find(arr, fun) {
    while (arr[0] !== undefined) {
        if (fun(arr[0]))
            return arr[0];
        return find(arr.slice(1, arr.length), fun);
    }
}

console.log(find([1, 3, 6, 4, 2], (x) => !(x % 2)));