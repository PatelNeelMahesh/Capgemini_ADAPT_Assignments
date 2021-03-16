/*
interface printable
2 obj circle & employee those implement printable interface
function printall() that takes all obj as arg & invoke 
print() method on every obj.
*/

interface printable{
	x:number
	y:number
} 

function printall(circle:printable,employee:printable):printable{
	let x = circle.x+employee.x
	let y = circle.y+employee.y
	console.log({x:x,y:y})
}

let print = printall({x:1,y:2},{x:1,y:2})

