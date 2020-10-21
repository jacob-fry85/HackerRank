//Complete this code or write your own from scratch

import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Dictionary dictionary = new Hashtable();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            dictionary.put(name, phone);
        }
        boolean isfound;
        while (in.hasNext()) {
            isfound = false;
            String s = in.next();
            if(dictionary.get(s) != null) {
                System.out.println(s + "=" + dictionary.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
