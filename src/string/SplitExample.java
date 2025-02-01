package string;

public class SplitExample {

    public static void example1(){
        String myStr = "Sachith Nanayakkara 9 9 9";
        String regex = " ";

        String[] myArray = myStr.split(regex,3);

        String firstName =myArray[0];
        String lastName = myArray[1];
        System.out.println(firstName+" "+ lastName);

        for (String s : myArray) {
            System.out.println(s);
        }
    }

    public static void example2(){
        String myStr = " Sachith Nanayakkara.9-9;9;";
        System.out.println(myStr.replaceAll("[.;-]", " ").trim());
    }
}
