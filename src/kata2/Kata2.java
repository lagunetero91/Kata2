package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] numbers = {3,5,6,4,3,12,4,6,8,1,5,12,42};
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashmap.get(numbers[i]) == null){
                hashmap.put(numbers[i],1);
                
            }else{
                hashmap.put(numbers[i], hashmap.get(numbers[i]) + 1);
            }
        }
        int max = 0;
        int maxNum = 0;
        for (Integer key : hashmap.keySet()) {
            if (hashmap.get(key) > max) {
                max=hashmap.get(key);
                maxNum = key;
            }
            System.out.println(key + "->" + hashmap.get(key));
            
        }
        System.out.println("El número que más aparece es " + maxNum);
    }
    
}
