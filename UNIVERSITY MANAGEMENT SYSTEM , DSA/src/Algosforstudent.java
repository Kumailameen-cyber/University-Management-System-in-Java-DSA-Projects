public class Algosforstudent {
    public int binarySearchById(int id,Student[] array) {

        int left=0;
        int right=array.length-1;

        while (left<=right) {
            int mid=(left+right)/2;
            if (array[mid].ID==id) {
                return mid; // ID found
            } else if (array[mid].ID<id) {
                left=mid+1; // Search in the right half
            } else {
                right=mid-1; // Search in the left half
            }
        }

        return -1; // ID not found
    }

    public void sortbyID(Student[] array){ //selection Sort
        int size= array.length;
        if(size==0 ){
            System.out.println("NULL");

        }
        else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i].ID > array[j].ID) {
                        Student temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println("SORTED BY ID : ");
            for(Student s : array){
                System.out.println(s.toString());
            }

            }
        }
        public void CountSort(Student[] arr) {
            try {
                int size = arr.length;
                if (size == 0) {
                    System.out.println("NULL");

                } else {
                    Student[] sorted = new Student[size];

                    int max = arr[0].total;
                    for (int i = 1; i < size; i++) {
                        if (arr[i].total > max) {
                            max = arr[i].total;
                        }
                    }
                    boolean[] used = new boolean[size];
                    int[] temp = new int[max + 1];
                    for (int i = 0; i < size; i++) {
                        temp[arr[i].total]++;
                    }
                    int k = 0;
                    //frequency loop
                    for (int i =max; i >= 0;i--) {
                        while (temp[i] > 0) {


                            for (int j = 0; j <size; j++) {
                                if (arr[j].total == i && !used[j]) {//total matches the student with the same total
                                    sorted[k++] = arr[j];  // Assign the object to the sorted position
                                    used[j] = true; // flag it so no duplicate values
                                    temp[i]--;  // Decrease the count for that total
                                    break; // Move to the next object with the same total
                                }
                            }
                        }
                    }
                    arr = sorted;
                    System.out.println("SORTED BY TOTAL : ");

                    for (Student s : arr) {
                        System.out.println(s.toString());
                    }

                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

}
