public class myRec {
    public static void main(String[] args) {
        sayHi(9);
    }
    private static void sayHi(int count){
        System.out.println("Hi");

        if (count <= 1) {
            return;
        }
        sayHi(count - 2);
    }
}
