console.log("Next Armstrong Number:");

function * getNextArmstrong(){ //*for generator 
	
	//loopint through next number and will exit when find next armstrong number
	for(let i=10;;i++){

		//finding length of number by converting number to string
		let	num_len = i.toString().length;
		let sum = 0;
		let temp = i;

		while(temp>0){
			let rem = temp%10;
			sum += rem**num_len;
			//converting float into interger using parseInt()
			temp = parseInt(temp/10);
		}  
		if(sum == i){
			if(i>999)
			{
				return ("Armstrong Number Above 1000.");
			}
			else{
			yield i; //it will paus and won't stop next time will start when it was pased last time
			}
		}
	}
}

const num = getNextArmstrong();

console.log(num.next().value);
console.log(num.next().value);
console.log(num.next().value);
console.log(num.next().value);
console.log(num.next().value);
