package login;

import io.cucumber.java.sl.In;

import java.util.*;

public class Main {

    public static String reverseString(String reverse){

        StringBuilder result = new StringBuilder();

      for(int i =reverse.length()-1;i>=0;i--){
          //char str = result.charAt(i);
            Character str = reverse.charAt(i);
          result.append(str);
      }
     // System.out.println(result);

        return result.toString();
    }

    public static int[] twoSum(int[]nums, int target){
        //List<Integer> result  = new ArrayList<>();
        int[] result = new int[2];
        int left =0;
        int right = nums.length-1;
        while(left < right){

            int a = nums[left];
            int b = nums[right];
            int currentSum = nums[left]+nums[right];
            if(currentSum == target){
                result[0] = a;
                result[1] = b;

           left +=1;
           right -=1;


            }

            else if(currentSum > target){
                left +=1;

            }
            else{
                right -=1;
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums,int target){

        int[] result = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int temp = target - num;


        }
        return result;
    }
    public static boolean containsDuplicate(int[] nums){

        HashSet<Integer> myset = new HashSet<>();
        for(int num:nums){
            if(!myset.contains(num)){
                myset.add(num);
            }else{
                return false;
            }
        }
        return true;
    }
    
    public double division(int a,int b){
        double c = 0;
        try{
           
           c=   a/b ;
           return c;
        } catch (ArithmeticException e){
            System.out.println("invalid number enter");
        }
        
        return c;
        
    }
    

    public static boolean isUnique(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr  = str.toCharArray();
        for(char c:arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

            int maxNum = 0;
            //char maxChar = '';
            Set<Character> characters = map.keySet();
            Collection<Integer> values = map.values();
            System.out.println(characters);
           // System.out.println(values);
            for(Character str1:characters){
                if (map.get(str1) > maxNum){
                    maxNum = map.get(str1);
                    Character ca =str1;
                }
            }


        }
        return false;

    }
    public static void main(String[] args){
        System.out.println(reverseString("bolofinde"));

        int[] nums = new int[] {1,2,3,4,5};
        int target = 9;
        //System.out.println(Arrays.toString(twoSum(nums, target)));
      //  System.out.println(Arrays.toString(twoSum2(nums, target)));
      //  String name = "Bolofinde";
      //  String name2 = "Olusegun";
       // System.out.println(name.toCharArray());
       // System.out.println(name.equals(name2));
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(10);
       /* Iterator<Integer> itr = list.iterator() ;
            while (itr.hasNext()) {
                System.out.println(itr.next());
                System.out.println(itr.next());

        }}*/
        System.out.println((isUnique("bolofindde")));




    }}

