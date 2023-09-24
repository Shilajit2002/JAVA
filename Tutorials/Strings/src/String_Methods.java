public class String_Methods {
    public static void main(String[] args) {

        String name="Shilajit Acharjee";
        System.out.println(name);

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5, 8));
        System.out.println(name.replace(' ', '*'));
        System.out.println(name.startsWith("Shila"));
        System.out.println(name.startsWith("Shilj"));
        System.out.println(name.endsWith("jee"));
        System.out.println(name.endsWith("Jee"));
        System.out.println(name.charAt(9));
        System.out.println(name.indexOf('h')); //Return First Occurrence
        System.out.println(name.indexOf('h', 8));
        System.out.println(name.lastIndexOf('a')); //Return Last Occurrence
        System.out.println(name.lastIndexOf('a',6)); //Return Last Occurrence
        System.out.println(name.equals("Shilajit Acharjee"));
        System.out.println(name.equals("Shilajit"));
        System.out.println(name.equalsIgnoreCase("sHiLaJit acharJEe"));

        String name1="      Happy       ";
        System.out.println(name1.trim());

        int i=name.compareTo(name1);
        System.out.println(i);
    }
}
