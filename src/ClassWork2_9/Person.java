package ClassWork2_9;

public abstract class Person {

    private String name;

    private String gender;

    public Person (String a, String b){
        this.name = a;
        this.gender = b;
    }

    public abstract void work();

    public String toString(){
        return "Name" + this.name + this.gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
