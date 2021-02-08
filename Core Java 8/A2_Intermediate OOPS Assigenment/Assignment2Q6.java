package com.company;


abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "File";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Database";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {

        Persistence obj = new FilePersistence();
        Persistence obj1 = new DatabasePersistence();
        System.out.println(obj.persist());
        System.out.println(obj1.persist());
    }
}
