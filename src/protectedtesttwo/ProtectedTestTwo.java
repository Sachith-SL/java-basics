package protectedtesttwo;

import protectedtestone.ProtectedTestOne;

public class ProtectedTestTwo extends ProtectedTestOne {

    public static void testProtected(){
        ProtectedTestTwo obj = new ProtectedTestTwo();
        System.out.println(obj.str);
    }
}
