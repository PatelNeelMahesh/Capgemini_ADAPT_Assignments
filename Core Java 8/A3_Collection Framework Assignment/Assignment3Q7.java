package com.company;

class ParkingSlot {
    private String ownerName;
    private int carNumber;
    private int token;
    private int level;
    private int section;
    private int slot;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}

class Parked_CarOwenerList {
    int levels = 3;
    int sections = 4;
    int slots = 20;
    String t = (String.valueOf(levels) + String.valueOf(sections) + String.valueOf(slots));
    int tokens = Integer.valueOf(t);
    ParkingSlot ps = new ParkingSlot();

    public void add_new_car(Assignment3Q7 obj) {
        ps.setOwnerName(obj.getName());
        ps.setCarNumber(obj.getCarNo());
        ps.setToken(tokens);
        ps.setLevel(levels);
        ps.setSection(sections);
        ps.setSlot(slots);
    }

    public void remove_car(String name, int carNo) {
        try {
            if (ps.getOwnerName().equalsIgnoreCase(name) && ps.getCarNumber() == carNo) {
                ps = null;
                System.gc();
            }
        } catch (Exception exc) {
            System.out.println(".");
        }
    }

    public String get_parked_car_location(int token) {
        try {
            if (ps.getToken() == token) {
                String str1 = "level : " + String.valueOf(ps.getLevel());
                String str2 = ",section : " + String.valueOf(ps.getSection());
                String str3 = ",slots : " + String.valueOf(ps.getSlot())+".";
                return str1+str2+str3;
            }
        } catch (Exception exc) {
            System.out.println(".");
        }
        return null;
    }
}

public class Assignment3Q7 {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

    public Assignment3Q7(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

public static void main(String[] args) {
}
}