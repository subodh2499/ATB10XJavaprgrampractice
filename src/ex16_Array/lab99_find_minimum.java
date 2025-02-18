package ex16_Array;

public class lab99_find_minimum {
    public static void main(String[] args) {
        //find max value in array
        int[] array = {25, 35, 45, 75, 26, 24};

        int min_output = give_min(array);
        System.out.println(min_output);
        //logic building
        //input=int
        //output=int
        // we sre using the function now that we have studied previously,
    }

    static int give_min(int[] array) {    //this is function
        int min = array[0]; //it means i am saying 25 is bigger one
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}


