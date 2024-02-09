public class STRING_2 {
    public static void main(String[] args) {
//        String a = new String("shatadal");
        String name ="Shatadal";
        int value = name.length();
        System.out.println(value);
        System.out.println(name);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmmedString = "      Shatadal      ";
        System.out.println(nonTrimmmedString);
        String TrimmmedString = nonTrimmmedString.trim();
        System.out.println(TrimmmedString);
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,7));
        System.out.println(name.replace('S','s'));
        System.out.println(name.startsWith("Sha"));
        System.out.println(name.startsWith("Pha"));
        System.out.println(name.endsWith("dal"));
        System.out.println(name.endsWith("dad"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("da"));
        System.out.println(name.equals("Shatadal"));
        System.out.println(name.equals("shatadal"));
        System.out.println(name.equalsIgnoreCase("shatadal"));


    }

}