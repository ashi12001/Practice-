public class Q1_Approach2 {
    
                                        
       public static void main(String[] args) {
        System.out.println("hello");

        String sentence = "h";
        
        boolean[] seen = new boolean[26];
        for (boolean status : seen){
            System.out.print(status+" ");
        }
        
        // For every letter 'currChar', we find its ASCII code, 
        // and update value at the mapped index as true.
        for (char currChar : sentence.toCharArray())
            seen[currChar - 'a'] = true;
        
        // Once we finish iterating, check if 'seen' contains false.
       
                                        
                                        
                                        
  }
}
