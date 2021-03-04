function valx(){
	let x = 10;
	return new Promise((resolve,reject)=>{resolve(x);});
}

function valy(){
	let y = 20;
	return new Promise((resolve,reject)=>{resolve(y);});
}

//async makes a function return a Promise
async function sumxy()
{
	let x = await valx(); //await makes a function
	let y = await valy(); //wait for a Promise
	console.log(x+y);
}

Promise.all([valx(),valy(),sumxy()]);