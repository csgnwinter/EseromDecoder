import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EseromDecoder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(decode(input));
        s.close();
    }

    static String decode(String input){
        StringBuilder sb = new StringBuilder();
        String[] words = input.split("  ");
        for(String word : words){
            String[] characters = word.split(" ");
            for(String character : characters)
            {
                sb.append(convert(character));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    static String convert(String str){
        table tb = new table();
        for (Map.Entry<String, String> entry : tb.getHm().entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return null;
    }

    static class table{
        HashMap<String, String> hm = new HashMap();
        public table(){
            hm.put("A", "10");
            hm.put("B", "0111");
            hm.put("C", "0101");
            hm.put("D", "011");
            hm.put("E", "1");
            hm.put("F", "1101");
            hm.put("G", "001");
            hm.put("H", "1111");
            hm.put("I", "11");
            hm.put("J", "1000");
            hm.put("K", "010");
            hm.put("L", "1011");
            hm.put("M", "00");
            hm.put("N", "01");
            hm.put("O", "000");
            hm.put("P", "1001");
            hm.put("Q", "0010");
            hm.put("R", "101");
            hm.put("S", "111");
            hm.put("T", "0");
            hm.put("U", "110");
            hm.put("V", "1110");
            hm.put("W", "100");
            hm.put("X", "0110");
            hm.put("Y", "0100");
            hm.put("Z", "0011");

            hm.put("1", "10000");
            hm.put("2", "11000");
            hm.put("3", "11100");
            hm.put("4", "11110");
            hm.put("5", "11111");
            hm.put("6", "01111");
            hm.put("7", "00111");
            hm.put("8", "00011");
            hm.put("9", "00001");
            hm.put("0", "00000");
        }

        public HashMap<String, String> getHm() {
            return hm;
        }
    }
}
