package CodeWithHarry;



public class java_13_strings_method {
    public static void main(String[] args) {
        String name="puneet vaishnav";
      // String a1=new String("harry");
      //  System.out.printf("%s and %s",a,a1);

        int length_value=name.length();
        System.out.printf("length is %d %n",length_value);

        String ChangeToLowerCase=name.toLowerCase();
        System.out.println(ChangeToLowerCase);

        String ChangeToUpperCase=name.toUpperCase();
        System.out.println(ChangeToUpperCase);

        String nonTrimmedString="   hello    ";
        System.out.println(nonTrimmedString);

        String TrimmedString=nonTrimmedString.trim();
        System.out.println(TrimmedString);

        String start_substring=name.substring(7);
        System.out.println(start_substring);

        String start_end_substring=name.substring(0,6);
        System.out.println(start_end_substring);

        String replace_OnlyWord=name.replace('p','s');
        System.out.println(replace_OnlyWord);

        String replace_whole_name=name.replace("puneet vaishnav","hello");
        System.out.println(replace_whole_name);

        boolean check_starts_with=name.startsWith("pun");
        System.out.println(check_starts_with);

        boolean check_ends_with=name.endsWith("nav");
        System.out.println(check_ends_with);

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('p'));

        System.out.println(name.indexOf('i',7));

        System.out.println(name.lastIndexOf("vai",10));

        System.out.println(name.equals("puneet"));

    }
}
