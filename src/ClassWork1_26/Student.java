package ClassWork1_26;

import java.util.ArrayList;

public class Student {
    private int id;
    private String major;
    private String gender;
    private Address address;

    public ArrayList<Address> addresses = new ArrayList<>();

    public Student (int id, String major, String gender, String street, String city, String state, String zip){

        this.id = id;
        this.major = major;
        this.gender = gender;

        address = new Address(street, city, state, zip );

        addresses.add(address);

    }

    public void addAddress(String street, String city, String state, String zip){
        addresses.add(new Address(street, city, state, zip));
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String toString(){
        return ("\nAddress: " + address.toString() + "\n ID: " + id + "\n Major: " + major + "\n Gender: " + gender );
    }


}
