class rectangle{
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    getArea()
    {
      console.log(this.width*this.height);
    }
}
    
const obj = new rectangle(4,5);
console.log(obj.width)
console.log(obj.height)

obj.height=50;
obj.getArea()