public class App {
    public static void main(String[] args) throws Exception {
        int[] numList = {5,15,3,8,9,1,20,7};

        //Printing the original list
        for (int i = 0; i < numsList.length; i++) {
            System.out.print(numList[i]);
        }

        //overwriting with the sorted list
        numList = sort(numList);

        //Printing the sorted data
        System.out.println("\nThe sorted version is: ");
        for (int i = 0; i < numsList.length; i++) {
            System.out.print(numList[i]);
        }

    }

    public static int[] sort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i - 1; j++){

                if (nums[j] > nums[j+1]) {
                    
                }

            }
        }
        
        return nums;
    }

}


