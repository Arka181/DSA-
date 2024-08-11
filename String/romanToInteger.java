package String;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    static int RomantoInt(String s){
        Map<Character,Integer> m=new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int res=m.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(m.get(s.charAt(i))<m.get(s.charAt(i+1))){
                res-=m.get(s.charAt(i));
            }else{
                res+=m.get(s.charAt(i));
            }
        }
        return res; 
    }
    public static void main(String[] args) {
        String s="IV";
        int ans = RomantoInt(s);
        System.out.println(ans);

    }
}
