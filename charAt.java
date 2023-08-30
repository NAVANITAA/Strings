public class charAt {

    public static void printletters(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String firstName = "Shraddha";
        String lastName = "Khapra";
        String fullName = firstName + " " + lastName;
        printletters(fullName);
    }
}
