public class Concatination {
    public static void main(String[] args) {
        String line = "Some Line.";
        String line2 = "Second Line.";
        String number = "1";
        String empty = "";

        System.out.println(line);
        System.out.println(line.concat(line2));
        System.out.println(line + 2);
        System.out.println(2 + number);
        System.out.println(empty);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("-------");

        String name = "Alex";
        System.out.println(name.charAt(1));

        char ch = 'a';
        System.out.println(ch);

        String mjQuote = "I've failed over and over again, that is why I succeed!";
        int mjQuoteLength = mjQuote.length();
        System.out.println(mjQuote.charAt(mjQuoteLength - 1));
        System.out.println(mjQuote.substring(5));
        System.out.println(mjQuote.substring(5, 12));
        System.out.println(mjQuote.substring(mjQuote.lastIndexOf("succeed"), mjQuote.lastIndexOf("succeed") + "succeed".length()));

        if (mjQuote.indexOf("again") != -1){
            System.out.println(mjQuote.substring(mjQuote.lastIndexOf("again"), mjQuote.lastIndexOf("again") + "again".length()));
        }

        System.out.println(mjQuote.replace("over", "OOO"));

        System.out.println("1234567890\n" +
                "0987654321");

        double value = 25.6;
        String stringValue = String.valueOf(value);
        System.out.println(stringValue.substring(0, stringValue.indexOf('.')));
        System.out.println(stringValue.substring(stringValue.indexOf('.') + 1, stringValue.length()));

        String s = "Education is the powerful weapon which you can use to change the world.";
        String t = "An investment in knowledge pays the best interest.";
        int use = s.indexOf("use");
        int knowledge = t.indexOf("knowledge");
        System.out.println(s.substring(use, use + 4) + t.substring(knowledge, knowledge + 9) + s.substring(use + 3));
    }
}
