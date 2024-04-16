public class HashFunction {
    public static void main(String[] args) {
        String [] name = {"John Smith", "Lisa Smith", "Sam Doe", "Sandra Dee"};
        int ascii_value;
        int add = 0;
        char value;

        // value = name[0].charAt(0);
        // ascii_value = (int) value;
        
        for(int loop1 = 0 ; loop1 <4; loop1++){
            System.out.println("Fetching the next person which is: " + name[loop1]);
            for (int i = 0; i<name[loop1].length(); i++){
                value = name[loop1].charAt(i);
                ascii_value = (int) value;
                add = add + ascii_value;
                System.out.println(ascii_value);
            }
            System.out.println("final code for add is : "+ add);
            add  = 0;
        }

        
    }
}
