public class ShiftArrayElements {

    public static void main(String[] args) {

        int temp;
        int[] num = {1, 3, 5, 7, 8, 11, 3, 9};
        int numsRemaining = num.length - 1;//4

        //look at each of the numbers in the num array
        for (int i = 0; i < num.length; i++) {
            printNums(num);
            if (num[i] == 3) {
                //j = 3  --- j > 0;
                int iterator = 1;
                int shift = 0;
                for (int j = numsRemaining; j > 0; j--) {
                    //stay inbounds

                    temp = num[i + iterator];
                    num[i + shift] = temp;
                    iterator++;
                    shift++;
                }
                num[num.length - 1] = 0;

            }
            numsRemaining--;
        }
    }

        public static void printNums ( int[] numbers){
            for (int n : numbers) {
                System.out.print(n + ",");
            }
            System.out.println();
        }
    }




