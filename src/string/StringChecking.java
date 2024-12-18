package string;

public class StringChecking {

    public void check() {
        String s1 = "Cat";
        String s2 = "Cat";

        String p1 = new String("Cat");
        String p2 = new String("cat");

        System.out.println(s1 == s2);
        System.out.println(s1 == p1.intern());
        System.out.println(s1 == p2.intern());
        System.out.println(s1.contains("cat"));
    }
}
