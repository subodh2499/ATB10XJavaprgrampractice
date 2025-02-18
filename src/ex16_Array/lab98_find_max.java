package ex16_Array;

public class lab98_find_max {
    public static void main(String[] args) {
        //find max value in array
        int[] array = {25, 35, 45, 75, 26, 24};

        int max_output = give_max(array);
        System.out.println(max_output);
        //logic building
        //input=int
        //output=int
        // we sre using the function now that we have studied previously,
    }

    static int give_max(int[] array) {    //this is function
        int max = array[0]; //it means i am saying 25 is bigger one
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}


