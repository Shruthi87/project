public class SimpleJavaProgram {

    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            System.out.println(convert(i));
        }
    }

    public static String convert(int input) {
        if(input % 3 ==0) {
            return "AAA";
        }
        if(input % 5 == 0) {
            return "BBB";
        }
        if(input % 15 == 0){
            return "CCC";
        }
        return String.valueOf(input);
    }
}
