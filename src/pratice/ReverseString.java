package pratice;

public class ReverseString {
    public static void main(String[] args) {
        String name = "yasin";
        int count = name.length();
        String s = "";
        for (int i = count - 1; i >= 0; i--) {
            s = s + name.charAt(i);

        }
        System.out.println(s);
    }

}

