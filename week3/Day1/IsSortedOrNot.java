package Day1;

public class IsSortedOrNot {
    public static void main(String[] args) {

        int[] arr = {6,1,2,5,7};
        boolean result=false;
        if (arr.length == 1 || arr.length == 0) {
            result = true;
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    result = false;
                    break;


                } else {
                    result = true;

                }
            }


        }
        if (result) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }


    }
}


