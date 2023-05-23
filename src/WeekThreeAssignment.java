public class WeekThreeAssignment {
    public static void main(String[] args) {
        // Part 1
        String firstName = "Ryan_Jan";

        System.out.println("First Name : " + firstName.replaceAll("_", " "));
        // Part 2
        firstName = "ryan jan";
        String firstCharOfName = firstName.substring(0, 1).toUpperCase();
        String firstNameWithoutFirstChar = firstName.substring(1);
        System.out.println("First Name : " + firstCharOfName.concat(firstNameWithoutFirstChar));
    }
}