package loops_arrays;


public class Main {
    public static void main(String[] args) {

    int[] myArray = {0,56,-6,8,0,1,-5,89};

   for (int i = 0; i < myArray.length - 1; i++) {
       for (int j = i + 1; j < myArray.length; j++){
           if (myArray[i] > myArray[j]){
               int temp = myArray[i];
               myArray[i] = myArray[j];
               myArray[j] = temp;
           }
       }

   }
        for (int x : myArray) {
            System.out.print("[" + x + "]");
        }
        System.out.println();


}
}


