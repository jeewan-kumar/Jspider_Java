public class Capitalize {
    public static String capitalize(String s){
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for(char ch : s.toCharArray()){
            if (Character.isWhitespace(ch)){
                capitalizeNext = true;
            } else if(capitalizeNext) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
        
    }
    public static void main(String[] args){
        String lowercaseString = "this is an example";
        String capitalizaedString = capitalize(lowercaseString);
        System.out.println("Original:"+lowercaseString);
        System.out.println("Capitalized: "+capitalizaedString);
    }
}
