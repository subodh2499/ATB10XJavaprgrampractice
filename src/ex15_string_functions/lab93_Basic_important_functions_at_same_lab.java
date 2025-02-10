package ex15_string_functions;

import java.util.Locale;

public class lab93_Basic_important_functions_at_same_lab {
    public static void main(String[] args) {
        String s1="subodh";
        //char at
        System.out.println(s1.charAt(2));
        //length
        System.out.println(s1.length());
        //concat
        System.out.println(s1.concat(" patil"));
        //contains
        System.out.println(s1.contains("sub"));
        //equals
        System.out.println(s1.equals("Subodh"));
        //equal ignore
        System.out.println(s1.equalsIgnoreCase("subodh"));
        //index of
        System.out.println(s1.indexOf("s"));
        //replace
        System.out.println(s1.replace("s","k"));
        //split
        String a1="tejas@mail.com";
        String[] split=a1.split("@");
        System.out.println(split[0]);
        //substring for subodh,
        System.out.println(s1.substring(2,5));
        //upper case
        System.out.println(s1.toUpperCase());
        //starts with- it just check true or false
        System.out.println(s1.startsWith("a"));
        //trim- only remove leading and trailing spaces
        String s3=" nilam ";
        System.out.println(s3.trim());
        //compare to
        System.out.println(s1.compareTo("SUBODH"));


    }
}
