import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean passwordf(String pass){
        String  password="abcd";
        if(pass.length()!=password.length())return false;
        for (int i = 0; i < password.length(); i++) {

            if(password.charAt(i)!=pass.charAt(i)){
                return false;
            }

        }
        return true;

    }



    public static void main(String[] args) {

      DynamicFunctiom d1 = new DynamicFunctiom();
        Scanner inpforstring = new Scanner(System.in);
Scanner inpforint= new Scanner(System.in);

        while (true) {
            System.out.println("ENTER THE PASSWORD");
            String p= inpforstring.nextLine();     // Verify the password
            if (passwordf(p)) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO UNIVERSITY MANAGEMENT SYSTEM!");




while(true){
                System.out.println(" 1 :  TEACHER " );
                System.out.println(" 2 :  STUDENT " );
                System.out.println(" 3 :  EXIT " );
                int x = inpforint.nextInt();
                switch (x) {
                    case 1: {

                        System.out.println("       1   :   ADD A TEACHER");
                        System.out.println("       2   :   REMOVE A TEACHER FROM ID");
                        System.out.println("       3   :   UPDATE A TEACHER FROM ID");//binary search
                        System.out.println("       4   :   SEARCH A TEACHER BY NAME");//linear search
                        System.out.println("       5   :   DISPLAY ALL TEACHER BY THEIR YEAR OF JOINING");//

                        System.out.println("       6  :   EXIT");
                        int input = inpforint.nextInt();
                        switch (input){
                            case 1 :
                                d1.addinTeacher();

                                break;
                            case 2 :
                                d1.removefromteach();
                                break;
                            case 3 :
                                d1.updateTeacherByID();
                                break;
                            case 4:
                                d1.searchbyfirstandlastname();
                                break;
                            case 5:
                                d1.Sortbyyear();
                                break;
                            case 6:
                                System.exit(0);
                            default:{
                                System.out.println("WRONG INPUT - TRY AGAIN");
                            }


                        }

                        break;
                    }
                    case 2 : {

                        System.out.println("       1   :   ADD A STUDENT");
                        System.out.println("       2   :   REMOVE A STUDENT");
                        System.out.println("       3   :   UPDATE A STUDENT FROM ID");
                        System.out.println("       4   :   SEARCH A STUDENT BY NAME");//linear search
                        System.out.println("       5   :   SEARCH A STUDENT BY ID");//Binary Search
                        System.out.println("       6   :   DISPLAY ALL STUDENT BY HIGHEST TOTAL");//count sort
                        System.out.println("       7   :   DISPLAY ALL STUDENT BY ID NUMBER");//sorted by ID
                        System.out.println("       8   :   EXIT");
                        int input = inpforint.nextInt();
switch (input){

    case 1 :
        d1.addinStudent();
        break;
    case 2 :
        d1.removefromstudent();
        break;
    case 3:
        d1.updateStudentByID();
        break;
    case 4:
        d1.searchStudentbyfirstandlastname();
        break;
    case 5:
        d1.SearchByID();
        break;
    case 6:
d1.Sortbytotal(); //
break;
    case 7 :
        d1.Sortbyid();
        break;
    default:{
        System.out.println("WRONG INPUT - TRY AGAIN");
    }
}

                        break;
                    }
                    case 3 : {
                       System.exit(0);


                    }
                    default:{
                        System.out.println("WRONG INPUT - TRY AGAIN");

                    }

                }

    System.out.println("DO YOU WANT TO TRY AGAIN? PRESS 1 TO CONTINUE");
                int inp = inpforint.nextInt();
                if(inp!=1){
                    System.out.println("EXITING");
                    System.exit(0);
                }
}
    }
            else {
                System.out.println("Access denied! Incorrect password.");
                boolean flag=true;
                while(flag){
Scanner in = new Scanner(System.in);

                System.out.println(" 1 : TRY AGAIN");
                System.out.println(" 2 : EXIT");
                int ifdontknowpass= in.nextInt();
                switch (ifdontknowpass){
                    case 1 :
                        flag=false;

                        break;
                    case 2 :
                        System.exit(0);
                    default:
                        System.out.println("WRONG INPUT");

                }
}}}}}
