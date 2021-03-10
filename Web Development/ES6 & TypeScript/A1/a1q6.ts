function sysnet(string1,model,desk_no,name){
	console.log(string1+" "+model+" "+desk_no+" "+name);
}

let model = "A5123";
let desk_no = 5123;
let name = "Acinonyx";

sysnet `Ticket ${name} ${model} ${desk_no}`;