class Account{
	constructor(id,name,balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
}

class SavingAccount extends Account{
	constructor(id,name,balance,interest){
		super(id,name,balance);
		this.interest = interest;
	}
}

class CurrentAccount extends Account{
	constructor(id,name,balance,cash_credit){
		super(id,name,balance);
		this.cash_credit = cash_credit;
	}
}

let sobj = new SavingAccount(1,"one",1000,10); 
let cobj = new CurrentAccount(1,"one",1000,500); 

function total_balance(){
	let total = sobj.balance-cobj.cash_credit;
	return total;
}

console.log(total_balance());