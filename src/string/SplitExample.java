package string;

public class SplitExample {

    public static void example1(){
        String myStr = "Sachith Nanayakkara 9 8 10";
        String regex = " ";
        int total = 0;
        int count = 0;

        String[] myArray = myStr.split(regex,3);

        String firstName =myArray[0];
        String lastName = myArray[1];
        System.out.println(firstName+" "+ lastName+" : ");

        String[] numArray = myArray[2].split(" ",3);

        for (String s : numArray) {
//            System.out.println(s);
            if (s.matches("\\d")) {
                count++;
                System.out.println(s);
                total +=Integer.parseInt(s);

            }
        }
        System.out.println(total/count);
    }

    public static void example2(){
        String myStr = " Sachith Nanayakkara.9-9;9;";
        System.out.println(myStr.replaceAll("[.;-]", " ").trim());
    }
}
