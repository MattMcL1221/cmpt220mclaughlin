package hw01;

public class Problem3 {
    public static void main(String[] args) {
        Row1();
        for(int i = 0; i < 3; i++){
            Row2();
        }
        Row1();
    }
    private static void Row1() {
        System.out.println("* ***** *****");
    }
    private static void Row2(){
        System.out.println("* *   * *   *");
    }
}