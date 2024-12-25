import java.io.*;
import java.util.Scanner;

public class DynamicFunctiom {
    int sizeofstudent;
    int sizeofteacher;

    Teacher [] arrayteacher;
    Student [] arraystudent;

    public DynamicFunctiom() {
        sizeofstudent=0;
        sizeofteacher=0;
        arraystudent=new Student[0];
        arrayteacher = new Teacher[0];
        loadFromStudentFile();
        loadFromTeacherFile();
    }


   //=========================================================== STUDENT ===================================================================================


    void SaveinStudent(Student student){
        if(student==null)
        {
            System.out.println("NULL DATA ");
            return;
        }
        if(sizeofstudent== arraystudent.length){
            Student [] temp = new Student[arraystudent.length+1];
            for (int i = 0; i < sizeofstudent; i++) {
                temp[i]=arraystudent[i];
            }

            arraystudent=temp;
        }

        arraystudent[sizeofstudent++]=student;

    }
    void addinStudent(){
        try{
          while(true){
              boolean b = false;
              Scanner s1=new Scanner(System.in);

              int [] marks= new int[4];
              int total;
              Scanner sstring= new Scanner(System.in);
              System.out.println("ENTER THE ID OF THE STUDENT");
              int x = s1.nextInt();
              for (int i = 0; i < sizeofstudent; i++) {
                  if(arraystudent[i].ID==x) {
                      b=true;
                      break;
                  }
              }
              if(b) System.out.println("ID ALREADY EXIST TRY AGAIN");
              else{
                  System.out.println("ENTER THE NAME OF THE STUDENT");
                  String name = sstring.nextLine();
                  System.out.println("ENTER THE LAST NAME OF THE STUDENT");
                  String lname = sstring.nextLine();

                  int maths;
                  System.out.println("ENTER THE MARKS OUT OF 50");
                  do {
                      System.out.print(" MATHS : ");
                      maths=s1.nextInt();

                      try {

                          if (maths >=0 && maths <= 50) {
                              break; // Valid year entered, exit loop
                          } else {
                              System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                          }
                      } catch (NumberFormatException e) {
                          System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                      }
                  } while (true);
                  int oops;
                  do {

                      System.out.print(" OBJECT ORIENTED PROGRAMMING : ");
                      oops =s1.nextInt();

                      try {

                          if (oops >0 && oops <= 50) {
                              break; // Valid year entered, exit loop
                          } else {
                              System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                          }
                      } catch (NumberFormatException e) {
                          System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                      }
                  } while (true);
                  int  fop;
                  do {

                      System.out.print(" FUNDAMENTALS OF PROGRAMMING : ");
                      fop=s1.nextInt();
                      try {

                          if (fop>0 && fop <= 50) {
                              break; // Valid year entered, exit loop
                          } else {
                              System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                          }
                      } catch (NumberFormatException e) {
                          System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                      }
                  } while (true);
                  int DE;
                  do {
                      System.out.print(" DIFFERENTIAL EQUATIONS : ");
                      DE=s1.nextInt();

                      try {

                          if (DE>0 && DE <= 50) {
                              break; // Valid year entered, exit loop
                          } else {
                              System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                          }
                      } catch (NumberFormatException e) {
                          System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                      }
                  } while (true);
                  total=maths+oops+fop+DE;
                  marks[0]=maths;
                  marks[1]=oops;
                  marks[2]=fop;
                  marks[3]=DE;
                  Student newstudent= new Student(name,lname,x,marks,total);
                  SaveinStudent(newstudent);
savetostudentfile();

break;

              }
        } }catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

    public void removefromstudent(){
        try{ Algosforstudent a= new Algosforstudent();
            a.sortbyID(arraystudent);
            if(sizeofstudent>0){
                Scanner s1=new Scanner(System.in);

                System.out.println("ENTER THE ID OF THE STUDENT YOU WANT TO REMOVE");
                int x= s1.nextInt();
                int index=a.binarySearchById(x,arraystudent);
                if(index==-1)
                {
                    System.out.println("NO STUDENT WITH THAT ID");

                }else {
                    for (int i = index; i < sizeofstudent - 1; i++) {
                        arraystudent[i] = arraystudent[i + 1];
                    }
                    arraystudent[sizeofstudent - 1] = null;
                    sizeofstudent--;
                    System.out.println("REMOVED SUCCESSFULLY");
                    savetostudentfile();
                }

            }
            else{
                System.out.println("FIRST ADD SOME STUDENTS");
            }
        }catch (Exception e){
            throw new NullPointerException(e.getMessage());
        }}

    public  void updateStudentByID() {
        Algosforstudent a = new Algosforstudent();
        if (sizeofstudent == 0) {
            System.out.println("FIRST ADD SOME Student'S DATA");
        } else {
            a.sortbyID(arraystudent);
            Scanner s1 = new Scanner(System.in);
            Scanner sstring = new Scanner(System.in);
            System.out.println("ENTER THE ID OF THE Student");
            int x = s1.nextInt();
            int index = a.binarySearchById(x, arraystudent);
            if (index == -1) {
                System.out.println("NO STUDENT WITH SUCH ID");
            } else {
                int[] marks=new int[4];
                System.out.println("ENTER THE NAME OF THE STUDENT");
                String name = sstring.nextLine();
                System.out.println("ENTER THE LAST NAME OF THE STUDENT");
                String lname = sstring.nextLine();
                int maths;
                System.out.println("ENTER THE MARKS OUT OF 50");
                do {
                    System.out.print(" MATHS : ");
                     maths=s1.nextInt();

                    try {

                        if (maths >=0 && maths <= 50) {
                            break; // Valid year entered, exit loop
                        } else {
                            System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                    }
                } while (true);
                int oops;
                do {

                    System.out.print(" OBJECT ORIENTED PROGRAMMING : ");
                   oops =s1.nextInt();

                    try {

                        if (oops >0 && oops <= 50) {
                            break; // Valid year entered, exit loop
                        } else {
                            System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                    }
                } while (true);
                int  fop;
                do {

                    System.out.print(" FUNDAMENTALS OF PROGRAMMING : ");
                    fop=s1.nextInt();
                    try {

                        if (fop>0 && fop <= 50) {
                            break; // Valid year entered, exit loop
                        } else {
                            System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                    }
                } while (true);
                int DE;
                do {
                    System.out.print(" DIFFERENTIAL EQUATIONS : ");
                     DE=s1.nextInt();

                    try {

                        if (DE>0 && DE <= 50) {
                            break; // Valid year entered, exit loop
                        } else {
                            System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 50.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC INPUT.");
                    }
                } while (true);




                int total=maths+oops+fop+DE;
                marks[0]=maths;
                marks[1]=oops;
                marks[2]=fop;
                marks[3]=DE;
                arraystudent[index].name = name;
                arraystudent[index].lastname = lname;
                arraystudent[index].arr=marks;
                arraystudent[index].total=total;

                System.out.println("STUDENT INFO UPDATED SUCCESSFULLY");
                savetostudentfile();

            }
        }

    }
    public void savetostudentfile() {


        try{

            FileWriter br =new FileWriter("student.txt");//an obj pointing to the path
            BufferedWriter f= new BufferedWriter(br);
            for (int i = 0; i < sizeofstudent; i++) {
                f.write(arraystudent[i].ID + ","+arraystudent[i].name + ","+ arraystudent[i].lastname + ","+ arraystudent[i].display()+","+ arraystudent[i].total);
                f.newLine();
            }
            f.close();
            System.out.println("DATA SAVED TO FILE");
        }
        catch (IOException e ){
            System.out.println(e.getMessage());
        }

    }

    public void loadFromStudentFile()  {
        try {
            File file = new File("student.txt");
            if(!file.exists()){
                file.createNewFile();
                return;

            }
            if(file.length()==0){
                return;
            }






                FileReader f= new FileReader(file);

                BufferedReader BR = new BufferedReader(f);
                String Line;
                while ((Line=BR.readLine())!=null){
                    String[] data= split(Line,',');
                    int ID = ParseInt(data[0]);
                    String name=data[1];
                    String lname=data[2];
                    String [] marks=split(data[3],'>');
                    int [] arr = new int[marks.length];
                    for (int i = 0; i <arr.length ; i++) {
                        arr[i]=ParseInt(marks[i]);
                    }
                    int total=ParseInt(data[4]);

                    Student s1 = new Student(name,lname,ID,arr,total);
                    SaveinStudent(s1);



                }
                BR.close();


             }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void searchStudentbyfirstandlastname(){
        if(sizeofstudent==0){
            System.out.println("FIRST ADD SOME STUDENT'S DATA");
        }
        else{
            Scanner s1=new Scanner(System.in);
            System.out.println("ENTER THE FIRST NAME ");
            String name=s1.nextLine();
            System.out.println("ENTER THE LAST NAME ");
            String lastname=s1.nextLine();
            boolean s=false;
            for (int i = 0; i <sizeofstudent ; i++) {
                if((equals(arraystudent[i].name,name)) && equals(arraystudent[i].lastname,lastname)){
                    System.out.println(arraystudent[i]);
                    s=true;
                    break;
                }
            }
            if(!s){
                System.out.println("NO SUCH STUDENT WITH FIRST NAME AND LAST NAME");

            }

        }}
    public void SearchByID(){
        try{Scanner s1=new Scanner(System.in);
            System.out.println("ENTER THE ID");
            int Id=s1.nextInt();
            Algosforstudent a=new Algosforstudent();
            int index=a.binarySearchById(Id,arraystudent);
            if(index==-1){
                System.out.println("NO SUCH STUDENT WITH THAT ID");
            }else {
                System.out.println(arraystudent[index].toString());
            }

        } catch (NumberFormatException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
    public void Sortbyid(){
        Algosforstudent a=new Algosforstudent();
        a.sortbyID(arraystudent);
        savetostudentfile();
    }
    public void Sortbytotal(){
        Algosforstudent a=new Algosforstudent();
        a.CountSort(arraystudent);
        savetostudentfile();
    }

    //=========================================================== TEACHER ===================================================================================


public void addinTeacher() {
    try {
        while (true) {
            boolean b = false;
            Scanner s1 = new Scanner(System.in);


            Scanner sstring = new Scanner(System.in);
            System.out.println("ENTER THE ID OF THE Teacher");
            int x = s1.nextInt();
            for (int i = 0; i < sizeofteacher; i++) {
                if (arrayteacher[i].id==x) {
                    b = true;

                    break;
                }
            }
            if (b) System.out.println("ID ALREADY EXIST TRY AGAIN");
            else {
                System.out.println("ENTER THE NAME OF THE Teacher");
                String name = sstring.nextLine();
                System.out.println("ENTER THE LAST NAME OF THE Teacher");
                String lname = sstring.nextLine();
                int year;
                do {
                    System.out.println("ENTER THE YEAR OF JOINING (BETWEEN 1950 AND 2024):");
                    year = s1.nextInt();

                    try {

                        if (year >= 1950 && year <= 2024) {
                            break; // Valid year entered, exit loop
                        } else {
                            System.out.println("INVALID YEAR. MUST BE BETWEEN 1950 AND 2024.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC YEAR.");
                    }
                } while (true);
                System.out.println("ENTER THE LOCATION");
                String loc= sstring.nextLine();
                int rat;
                do {
                    System.out.println("ENTER THE TEACHER'S RATING OUT OF 10");
                    rat= s1.nextInt();
                    try {

                        if (rat>= 0 && rat <= 10) {
                            break; // Valid year entered, exit loop
                        } else {
                            System.out.println("INVALID RATING. MUST BE BETWEEN 0 AND 10.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC VALUE.");
                    }
                } while (true);

                Teacher t= new Teacher(name,lname,year,x,loc,rat);
                SaveinTeacher(t);
savetoteacfile();
break;
            }}


    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}

    public void SaveinTeacher(Teacher teacher) {
        if(teacher==null)
        {
            System.out.println("NULL DATA ");
            return;
        }
        if(sizeofteacher== arrayteacher.length){
            Teacher [] temp = new Teacher[arrayteacher.length+1];
            for (int i = 0; i < sizeofteacher; i++) {
                temp[i]=arrayteacher[i];
            }

            arrayteacher=temp;
        }

        arrayteacher[sizeofteacher++]=teacher;

    }
public void removefromteach(){
    try{ Algosforteacher a= new Algosforteacher();
        a.sortbyID(arrayteacher);
        if(sizeofteacher>0){
            Scanner s1=new Scanner(System.in);

            System.out.println("ENTER THE ID OF THE TEACHER YOU WANT TO REMOVE");
            int x= s1.nextInt();
            int index=a.binarySearchById(x,arrayteacher);
            if(index==-1)
            {
                System.out.println("NO TEACHER WITH THAT ID");

            }else {
                for (int i = index; i < sizeofteacher - 1; i++) {
                    arrayteacher[i] = arrayteacher[i + 1];
                }
                arrayteacher[sizeofteacher - 1] = null;
                sizeofteacher--;
                System.out.println("REMOVED SUCCESSFULLY");
                savetoteacfile();
            }

        }
        else{
            System.out.println("FIRST ADD SOME TEACHER");
        }
    }catch (Exception e){
        throw new NullPointerException(e.getMessage());
    }}

    public  void updateTeacherByID(){
Algosforteacher a=new Algosforteacher();
if(sizeofteacher==0){
    System.out.println("FIRST ADD SOME TEACHER'S DATA");
}
else{
    a.sortbyID(arrayteacher);
    Scanner s1 = new Scanner(System.in);
    Scanner sstring=new Scanner(System.in);
    System.out.println("ENTER THE ID OF THE TEACHER");
    int x = s1.nextInt();
    int index = a.binarySearchById(x,arrayteacher);
    if(index==-1){
        System.out.println("NO TEACHER WITH SUCH ID");
    }
    else {
        System.out.println("ENTER THE NAME OF THE Teacher");
        String name = sstring.nextLine();
        System.out.println("ENTER THE LAST NAME OF THE Teacher");
        String lname = sstring.nextLine();
        int year;
        do {
            System.out.println("ENTER THE YEAR OF JOINING (BETWEEN 1950 AND 2024):");
            year = s1.nextInt();

            try {

                if (year >= 1950 && year <= 2024) {
                    break; // Valid year entered, exit loop
                } else {
                    System.out.println("INVALID YEAR. MUST BE BETWEEN 1950 AND 2024.");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC YEAR.");
            }
        } while (true);
        System.out.println("ENTER THE LOCATION");
        String loc= sstring.nextLine();
        int rat;
        do {
            System.out.println("ENTER THE TEACHER'S RATING OUT OF 10");
            rat= s1.nextInt();
            try {

                if (rat>= 0 && rat <= 10) {
                    break; // Valid year entered, exit loop
                } else {
                    System.out.println("INVALID RATING , MUST BE BETWEEN 0 AND 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT. PLEASE ENTER A NUMERIC VALUE.");
            }
        } while (true);
arrayteacher[index].name=name;
arrayteacher[index].lastname=lname;
arrayteacher[index].Residence=loc;
arrayteacher[index].year=year;
arrayteacher[index].rating=rat;
        System.out.println("TEACHER INFO UPDATED SUCCESSFULLY");
        savetoteacfile();

    }
}

    }
    //linearSearch
public void searchbyfirstandlastname(){
    if(sizeofteacher==0){
        System.out.println("FIRST ADD SOME TEACHER'S DATA");
    }
    else{
        Scanner s1=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NAME ");
        String name=s1.nextLine();
        System.out.println("ENTER THE LAST NAME ");
        String lastname=s1.nextLine();
        boolean s=false;
        for (int i = 0; i <sizeofteacher ; i++) {
            if((equals(arrayteacher[i].name,name)) && equals(arrayteacher[i].lastname,lastname)){
                System.out.println(arrayteacher[i]);
                s=true;
                break;
            }
        }
        if(!s){
            System.out.println("NO SUCH TEACHER WITH FIRST NAME AND LAST NAME");

        }

    }



}


    public void savetoteacfile() {


        try{

            FileWriter br =new FileWriter("teacher.txt");//an obj pointing to the path
            BufferedWriter f= new BufferedWriter(br);
            for (int i = 0; i < sizeofteacher; i++) {
                f.write(arrayteacher[i].id + ","+arrayteacher[i].name + ","+ arrayteacher[i].lastname + ","+ arrayteacher[i].year +","+ arrayteacher[i].Residence+','+arrayteacher[i].rating);
                f.newLine();
            }
            f.close();
            System.out.println("DATA SAVED TO FILE");
        }
        catch (IOException e ){
            System.out.println(e.getMessage());
        }

    }



    public void loadFromTeacherFile()  {
        try {
            File file = new File("teacher.txt");
            if(!file.exists()){
                file.createNewFile();

            }



            else {


                FileReader f= new FileReader(file);

                BufferedReader BR = new BufferedReader(f);
                String Line;
                while ((Line=BR.readLine())!=null){
                    String[] data= split(Line,',');
                   int ID = ParseInt(data[0]);
                   String name=data[1];
                   String lname=data[2];
                   int year=ParseInt(data[3]);
                   String res=data[4];
                   int r=ParseInt(data[5]);
Teacher teacher=new Teacher(name,lname,year,ID,res,r);
SaveinTeacher(teacher);



                }
                BR.close();


            } }catch (IOException e) {
            System.out.println("IO EXCEPTION");
        }

    }
    public void Sortbyyear(){
        Algosforteacher a=new Algosforteacher();
        a.Sortbyyear(arrayteacher);


    }




//==================GENERAL FUNCTIONS===================



    public String[] split(String a , char c){
        int count = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                count++;
            }
        }
        String[] res = new String[count];
        char [] ch = new char[a.length()];
        int countchar=0;
        int arrind =0;
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)==c){
                res [arrind++]=Convert(ch,countchar);
                countchar=0;
            }else{
                ch[countchar++]=a.charAt(i);
            }

        }
        res [arrind]=Convert(ch,countchar);
        return res;
    }

    public String Convert(char [] c,int count ){
        char []temp=new char[count];
        for (int i = 0; i < count; i++) {
            temp[i]=c[i];
        }
        return new String(temp);
    }
    public int ParseInt(String a){
        int res=0;
        for (int i = 0; i <a.length(); i++) {
            char c;
            c=a.charAt(i);
            if(c<'0' || c>'9'){
                throw new NumberFormatException("WRONG INPUT");
            }

            res=res*10+(c-48);

        }

        return res;
    }
    public boolean equals(String a, String b){
        int a1=a.length();
        int b1=b.length();
        if(a1 == 0|| a1!=b1  )return false;
//convert all to lowercase
        for (int i = 0; i < a.length(); i++) {
            char first=a.charAt(i);
            char second=b.charAt(i);
            if(first>='A' && first<='Z'){
                first=(char)(first+32);
            }
            if(second>='A' && second<='Z'){
                second=(char)(second+32);
            }
            if(first!=second)return false;
        }
        return true;}

}
