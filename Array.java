public class Array {
    public static void main(String[] args)
    {
        int[] arr = {1,2,23,3,4};
        System.out.println("Method 1: Using for loop");
    
        for(int i = 0; i<5; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Method 2: Using for-each loop");
        for(int num : arr)
        {
            System.out.println(num);
        }
        System.out.println("Method 3: Using Arrays.toString()");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }


}
