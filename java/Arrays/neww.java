public class neww {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int[] arr = new int[26];
        
        // checks the frequency of the alphabets
        for(var i: sentence.toCharArray()){
            arr[i - 'a']+=1;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        
        System.out.println("hello");
    }}
