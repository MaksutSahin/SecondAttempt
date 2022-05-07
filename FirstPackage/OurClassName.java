package FirstPackage;
public class OurClassName {
    private static String name="Ayse";
    private String name1a="Ayse Baci";
    static String name2="Fatma"; //default
    public static String name2a="Extravert Fatma";
    String name3="Hayriye"; //default
    public String name4="Huriye";
    protected String name5="Duriye Yenge";
    protected static String name5a="Duriye";

    public static String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getName5() {
        return name5;
    }

    public static String getName() { // Both variable and method are static
        return name;
    }

    public String getName1a() { // Method cannot contain static if variable is not static
        return name1a;
    }

    public void abcPublic(){
        System.out.println("abcPublic");
    }

    public static void abcPublicStatic(){
        System.out.println("abcPublicStatic");
    }



    //Protected
    protected String abcProtected(){
        return "abcProtected";
    }
    public String getAbcProtected(){
        return abcProtected();
    }

    protected static void abcProtectedStatic(){
        System.out.println("abcProtectedStatic");
    }





    String abcDefault(){
       return "abcDefault";
    }
    public String getAbcDefault(){
        return abcDefault();
    }

    static String abcDefaultStatic(){
        return "abcDefaultStatic";
    }
    public static String getAbcDefaultStatic(){
        return abcDefaultStatic();
    }



    //Private
    private String abcPrivate(){
       return "abcPrivate";
    }
    public String getAbcPrivate() { //with public method
        return abcPrivate();
    }

    private static String abcPrivateStatic(){
        return "abcPrivateStatic";
    }
    public static String getAbcPrivateStatic() { //with public method
        return abcPrivateStatic();
    }


}

//			Access modifiers: public, protected, default, private
// access modifiers explain your access level to the variable ,method or class

//Private: The access level of a private modifier is only within the class.
// It cannot be accessed from outside the class.


//Default: The access level of a default modifier is only within the package.
// It cannot be accessed from outside the package.
// If you do not specify any access level, it will be the default.


//Protected: The access level of a protected modifier is within the package
// and outside the package through child class.
// If you do not make the child class, it cannot be accessed from outside the package.


//Public: The access level of a public modifier is everywhere.
// It can be accessed from within the class, outside the class, within the package and outside the package.

