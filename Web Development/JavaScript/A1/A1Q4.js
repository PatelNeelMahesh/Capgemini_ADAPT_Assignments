function BankAccount(accountNumber, accountHolderName, accountBalance, isSalary = false, odLimit = NaN) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
    this.isSalary = isSalary;
    this.odLimit = odLimit;
}

var account1 = new BankAccount(1, 'One', 10000, true);
var account1 = new BankAccount(2, 'Two', 20000, false, 2000);