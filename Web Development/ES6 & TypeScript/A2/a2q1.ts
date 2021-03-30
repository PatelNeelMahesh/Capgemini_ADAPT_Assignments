class NextClass {
    constructor(current) {
        this.currentNo = current;
        this.previousNo = fib(current - 1);    
    }
    next() {
        return fib(this.currentNo + 1);
    }
}
let fib = function (n) {
    let a = 0, b = 1, c = 1;
    for (let i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return c;
};
let nextClass = new NextClass(5);
console.log(nextClass.next());