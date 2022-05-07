package SecondPackage;
import FirstPackage.OurClassName;// to be able to call class from another package import is needed (to create a new obj etc..)
public class ClassInAnotherPackage extends OurClassName {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------------
        /*
                                                 = Private VS Protected =
        ♦For both private static and private instant attributes, setter and getter methods need to be created to call.
        ♦For protected instant attribute setter and getter methods need to be created while protected static
        attribute can be called directly without creating setter and getter methods.

        */

        System.out.println(getName()); //private static attribute *extends needed *only import is not enough *method needed to call
        System.out.println(name5a); //protected static attribute *extends needed *only import is not enough
        System.out.println(getName2()); //default static attribute *extends needed *only import is not enough *method needed to call
        System.out.println(name2a); //public static attribute *extends needed *only import is not enough
//-----------------------------------------------------------------------------------------------------------------------
        OurClassName x=new OurClassName(); // obj is needed to call non-static variables
        System.out.println(x.getName1a()); //private instant attribute *obj is needed *method needed to call
        System.out.println(x.getName5()); //protected instant attribute *obj is needed *method needed to call
        System.out.println(x.getName3()); //default instant attribute *obj is needed *method needed to call
        System.out.println(x.name4); //public attribute (no need to extends because it works everywhere)

//-----------------------------------------------------------------------------------------------------------------------
        /*
        ♦
         */

        System.out.println("*****************************************************");

        abcPublicStatic(); // *extends needed
        abcProtectedStatic(); // *extends needed
//      abcPrivateStatic(); // *extends needed *method is needed to call
//      abcDefaultStatic(); // *extends needed *method is needed to call
//      abcPublic(); // *obj is needed
//      abcProtected(); // *obj is needed *method is needed to call
//      abcPrivate(); // *obj is needed *method is needed to call
//      abcDefault(); // *obj is needed *method is needed to call

        System.out.println("*****************************************************");

        System.out.println(getAbcPrivateStatic()); // *extends needed *method is needed to call
        System.out.println(getAbcDefaultStatic()); // *extends needed *method is needed to call
//        getAbcProtected(); //obj needed
//        getAbcPrivate(); //obj needed
//        getAbcDefault(); //obj needed

        System.out.println("*****************************************************");

        OurClassName.abcPublicStatic(); // works with/without extends
        OurClassName.abcProtectedStatic(); // *extends needed
        System.out.println(OurClassName.getAbcPrivateStatic()); // works with/without extends *method is needed to call
        System.out.println(OurClassName.getAbcDefaultStatic()); // works with/without extends *method is needed to call
//      OurClassName.abcPublic(); // *obj is needed
//      OurClassName.getAbcProtected(); // *obj is needed *method is needed to call
//      OurClassName.getAbcPrivate(); // *obj is needed *method is needed to call
//      OurClassName.getAbcDefault(); // *obj is needed *method is needed to call

        System.out.println("*****************************************************");

        x.abcPublicStatic(); // works with/without extends
        x.abcProtectedStatic(); // *extends needed
        System.out.println(x.getAbcPrivateStatic()); // works with/without extends *method is needed to call
        System.out.println(x.getAbcDefaultStatic()); // works with/without extends *method is needed to call
        x.abcPublic(); // works with/without extends *obj is needed
        System.out.println(x.getAbcProtected()); // works with/without extends *obj is needed *method is needed to call
        System.out.println(x.getAbcPrivate()); // works with/without extends *obj is needed *method is needed to call
        System.out.println(x.getAbcDefault()); // works with/without extends *obj is needed *method is needed to call
    }
}
