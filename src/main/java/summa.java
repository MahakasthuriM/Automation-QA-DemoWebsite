import java.util.*;
public class summa {
    public static void main(String [] args){
        HashMap<Character,Integer> hm=new HashMap<>();
        String a="mAhakasthuri";


        for(char c: a.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else
                hm.put(c,1);
        }
        System.out.println(hm.toString());
        for(char m:hm.keySet()){
            System.out.println(m);
        }
    }
}
