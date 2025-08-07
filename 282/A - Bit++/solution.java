import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        sc.nextLine();
        String s;
        for(int i = 0;i<n;i++){
            s = sc.nextLine();
            if(s.charAt(0) == '+' || s.charAt(1) == '+')
            x++;
            else if(s.charAt(0) == '-' || s.charAt(1) == '-')
            x--;
        }
        System.out.print(x);
        sc.close();
    }
}