class Rectangle { 
  constructor(width,height){
    this.width=width;
    this.height=height;
  }
  getwidth(){
    console.log("Width : "+this.width);
  }
  getheight(){
    console.log("Height : "+this.height);
  }
}

let obj = new Rectangle(2,4)

obj.getwidth();
obj.getheight();