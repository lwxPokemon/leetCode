import java.util.Scanner;

public class WyDigitalRearrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){

            String str = String.valueOf(arr[i]);
            int count = 0;
            for(int j = 2;j<10;j++){
                String temp = String.valueOf(arr[i]*j);
                count = 0;
                if(str.length()==temp.length()){
                    for(int k = 0;k<temp.length();k++){
                        if(!str.contains(String.valueOf(temp.charAt(k)))){
                            break;
                        }
                        count++;
                    }
                }

                if(count==str.length()){
                    break;
                }

            }
            if(count==str.length()){
                System.out.println("Possible");
            }
            else{
                    System.out.println("Impossible");
                }
        }
    }
}
