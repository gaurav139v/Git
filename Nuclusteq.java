import java.util.HashMap;

public class Nuclusteq {

    public static String solution(String input) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('a', 1);
        m.put('e', 1);
        m.put('i', 1);
        m.put('o', 1);
        m.put('u', 1);

        for(int i=0; i<input.length(); i++) {
            if(m.get(input.charAt(i)) != null) {
                m.put(input.charAt(i), m.get(input.charAt(i))+1);
                input = input.substring(0,i) + (m.get(input.charAt(i))-1) + input.substring(i+1);
            }
        }
        return input;
    }

    public static void main(String[] args) {
//        Input: Nucleusteq
//        Output: N1cl12st2q
        String input = "Nucleusteq";
        String result = solution(input);
        System.out.println(result);
    }
}
