import java.util.Arrays;

public class Student {
    String name ,lastname;
    int ID;
    int [] arr;
    int total;
public Student( ){
    arr = new int[4];
    total=0;

}
    public Student(String name, String lastname, int ID, int[] arr,int total) {
        this.name = name;
        this.lastname = lastname;
        this.ID = ID;
        this.arr=arr;
        this.total=total;
    }
String display(){
    String res="" ;
    for (int i =0 ; i < arr.length-1; i++) {
        res+=arr[i]+">";

    }
    res+=arr[3];
    return res;
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ID=" + ID +
                ", arr=" +display() +
                ", total=" + total +
                '}';
    }
}
