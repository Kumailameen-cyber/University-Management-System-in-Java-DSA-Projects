public class Teacher {
    String name;
    String lastname;
    int year;
   String Residence;
    int id;
int rating;
    public Teacher(String name, String lastname, int year, int id,String Residence,int rating) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.id = id;
        this.Residence=Residence;
        this.rating=rating;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year='" + year + '\'' +
                ", Residence='" + Residence + '\'' +
                ", id=" + id +
                '}';
    }
}
