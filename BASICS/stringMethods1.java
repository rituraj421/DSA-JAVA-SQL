package BASICS;

public class stringMethods1 {
    public static void main(String[] args) {
        String name = " Ritu raj ";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lbadri = name.toLowerCase();
        System.out.println(lbadri);

        String ubadri = name.toUpperCase();
        System.out.println(ubadri);

        String tbadri = name.trim();
        System.out.println(tbadri);

        System.out.println(name.substring(2));

        System.out.println(name.substring(2, 8));

        System.out.println(name.replace('R', 'b'));

        System.out.println(name.replace("Ritu", "bdri"));

        System.out.println(name.startsWith("ritu"));

        System.out.println(name.endsWith("aj "));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("u"));

        System.out.println(name.indexOf("u", 7));

        System.out.println(name.lastIndexOf("r"));

        System.out.println(name.lastIndexOf("R", 1));

        System.out.println(name.equals("ritu"));

        System.out.println(name.equals(" Ritu raj "));

        System.out.println(name.equalsIgnoreCase(" ritu raj "));

    }
}
