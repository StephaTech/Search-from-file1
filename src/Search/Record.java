package Search;
/**
*
* @author apont
*/

public class Record {
	private int id;
    private String name;
    private String surname;
    private String gender;
    private String country;
    private int age;
    private String date;
    
    public Record(int id, String name, String surname, String gender, String country, int age, String date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.country = country;
        this.age = age;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }
}
