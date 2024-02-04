public class MocKiNg{

    public static void mock(char[] letters){
        String input;
        int i = 0;
        int j = 1;
        while(i < letters.length){
            letters[i] = Character.toUpperCase(letters[i]);
            i += 2;
        }
        while(j < letters.length){
            letters[j] = Character.toLowerCase(letters[j]);
            j += 2;
        }
        
        input = String.valueOf(letters);
        System.out.println("''" + input + "''");
    }
    public static void main(String []args){
        String input = "";
        char[] inputChars = input.toCharArray();
        System.out.println(input);
        mock(inputChars);
    }
}