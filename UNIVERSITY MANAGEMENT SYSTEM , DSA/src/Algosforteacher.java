public class Algosforteacher {

    public int binarySearchById(int id,Teacher[] array) {

        int left=0;
        int right=array.length-1;

        while (left<=right) {
            int mid=(left+right)/2;
            if (array[mid].id==id) {
                return mid; // ID found
            } else if (array[mid].id<id) {
                left=mid+1; // Search in the right half
            } else {
                right=mid-1; // Search in the left half
            }
        }

        return -1; // ID not found
    }

    public void sortbyID(Teacher[] array){ //bubble sort

        int size= array.length;
        if(size==0 ){
            System.out.println("NO Teacher");

        }
        else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i].id > array[j].id) {
                        Teacher temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println("SORTED BY ID : ");
            display(array);
        }


    }
    public void Sortbyyear(Teacher[] arr) { //bubble sort
        DynamicFunctiom d1= new DynamicFunctiom();
        int n = arr.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].year<arr[j+1].year) {
                    // Swap arr[j] and arr[j+1]
                    Teacher temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) break;
        }
        display(arr);

    }



    public void display(Teacher [] arr){
        for(Teacher t : arr){
            System.out.println(t);
        }


    }


}
