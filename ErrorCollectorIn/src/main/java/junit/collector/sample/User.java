package junit.collector.sample;

public class User {
    
    private final String name;
    private final String surname;    
    private final String address;
    private final String phone;
    private final String zip;
    private final String ssn;    
    private final int age;

    public User(String name, String surname, String address, String phone, String zip, String ssn, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.zip = zip;
        this.ssn = ssn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getZip() {
        return zip;
    }

    public String getSsn() {
        return ssn;
    }

    public int getAge() {
        return age;
    }                
}
