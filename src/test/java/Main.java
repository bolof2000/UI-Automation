import java.util.*;

public class Main {

    public static boolean palindrome(String s){
        int left =0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left +=1;
            right -=1;
        }

        return true;
    }

    public static boolean isPalindrome(String s){
        StringBuffer st = new StringBuffer();

        for(int i =s.length()-1;i>=0;i--){
            st.append(s.charAt(i));
        }
        return s.equals(st.toString());


    }

    public static int[] twoSum(int[]nums,int target){
        int[] results = new int[2];
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                results[0] = left;
                results[1] = right;
            }else if(sum > target){
                right -=1;
            }
            else{
                left +=1;
            }
            left +=1;
            right -=1;
        }

        return results;

    }

    public static int[] twoSumSol(int[] nums,int target){
        int[] results = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int temp = target-num;
            if(map.containsKey(temp)){
                results[0] = temp;
                results[1] = num;
            }else{
                map.put(num,i);
            }
        }
        return results;
    }


    public static void main(String[] args){

            int[] nums = {1,2,3,4,5};
            System.out.println(twoSumSol(nums,9));
            ArrayList<Integer> mylist = new ArrayList<>();
            mylist.add(10);
        mylist.add(15);
        mylist.add(5);
        mylist.add(3);
        mylist.add(25);
        mylist.add(18);
        mylist.add(8);
        Collections.sort(mylist);
        Collections.reverse(mylist);
        System.out.println(mylist);
        ArrayList<Character> names = new ArrayList<>();
        String surname = "bolofinde";
        for(Character c:surname.toCharArray()){
            names.add(c);
        }
        Collections.reverse(names);
        StringBuffer str = new StringBuffer(names.size());
        for(Character c:names){
            str.append(c);
        }
        System.out.println(str.toString());
        Collections.reverse(names);
        System.out.println(str.toString());
        System.out.println(names);

        String text = "The giant pand has Lorem Ipsum is unadulterated drivel. It means nothing whatsoever, but it's surprisingly useful. The main idea behind lorem ipsum is to have 'convincing' text, separated into words, paragraphs and with punctuation etc. This 'text' is then used by DTP bureaux and web designers for roughing out document designs, illustrating text flow and run arounds before the final text arrives. It allows designers to show their proposals without having clients distracted by meaningful text. It also avoids fine publications like N.T.K. detecting irony which may become apparent in old web page drafts loitering around dusty servers which had English-language garbage text used as filler";

        String[] sentence = text.split("\\.");
        System.out.println(sentence);







       /* System.out.println(mylist);
    ArrayList<Integer> mylist = new ArrayList<>();
    int[] mylist2 = {1,2,3,4,5,6,7};
        for(int i=0;i<20;i++){
        mylist.add(i);

        String name = "bolofinde";
        ArrayList<Character> chars = new ArrayList<>();
        for(Character c:name.toCharArray()){
            chars.add(c);

        }
        Iterator<Integer> its = mylist.iterator();
        while(its.hasNext()){
            if(its.next().equals(1)){

            }
        }





        System.out.println(palindrome("abba"));

        System.out.println(isPalindrome("abba"));

        String name2 = "bolofinde";
        name.length();
        System.out.println(name2.equals("bolofinde"));
        System.out.println(name2.toCharArray());
        name.contains("boa");
        name.equals("bb");


        HashMap<String,Integer> map = new HashMap<>();
        map.put("Olusegun",1);
        map.put("Damilola",2);
        map.put("Dami",3);
        map.put("tOPE",4);
        map.put("ADRIEL",5);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        for(String key:keys){
            System.out.println(key);

        */

    }

}
