import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String s = sc.nextLine();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        if(set.size() %2 == 0){
            System.out.print("CHAT WITH HER!");
        }
        else{
            System.out.print("IGNORE HIM!");
        }
        sc.close();
    }
}