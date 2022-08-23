public class Main {
    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeeF12Ghhiijk99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        // ^symbol means beginning
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhabcDeeehiijk99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello")); // false
        System.out.println(alphanumeric.matches("^abcDeee")); // false
        System.out.println(alphanumeric.matches("abcDeeeeF12Ghhiijk99z")); // true

        // $ symbol means end
        System.out.println(alphanumeric.replaceAll("ijk99z$", "THE END"));

        // [] replace all instances of each character in the brackets
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        // Only occurrences of a,e,i followed by F or j will be replaced
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "I replaced a letter here"));
    }
}