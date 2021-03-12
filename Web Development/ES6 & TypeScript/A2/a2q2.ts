console.log("Next Armstrong Number:");

function getNextArmstrong(num){
	
	//loopint through next number and will exit when find next armstrong number
	for(let i=num+1;;i++){

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
			return i;
		}
	}
}

console.log(getNextArmstrong(9));