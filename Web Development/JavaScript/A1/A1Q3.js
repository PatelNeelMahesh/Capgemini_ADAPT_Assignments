function person(fname, lname, age, skills, dateofbirth, address, married, profession) {
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    this.skills = skills;
    this.dateofbirth = dateofbirth;
    this.address = address;
    this.married = married;
    this.profession = profession;

}

amithab = new person("amithab", "bachan", 22, ["c"], "24/10/1996", { city: "hyderabad", pincode: "521185" }, "false", "sr analyst")
abhisheik = new person("abhisheik", 21, "HTML", "08/06/1997", "false", "jr analyst")

var abhisheik = Object.create(amithab);

Aaradhya = new person("Aaradhya", amithab.lname, "10", abhisheik.skills, "08/06/2010", amithab.address, abhisheik.married, amithab.profession);

print=function(){
	console.log(Aaradhya);
}();