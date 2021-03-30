class Rectangle { 
  constructor(width,height){
    this.width=width;
    this.height=height;
  }
  get area() {
    return this.calcArea();
  }
  calcArea() {
    return this.width * this.height;
  }
}

let obj = new Rectangle(2, 4);

console.log(obj.area);