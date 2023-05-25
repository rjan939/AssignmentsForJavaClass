public class WeekFourAssignment {
    public static void main(String[] args) {
        String firstName = "ryan";
        String lastName = "jan";
        String primaryPhone = "555-123-1245";
        String secondaryPhone = "555.123.1246";
        String sanitizedFirstName = sanitizeName(firstName);
        String sanitizedLastName = sanitizeName(lastName);
        String sanitizedPrimaryPhone = sanitizePhoneNumber(primaryPhone);
        String sanitizedSecondaryPhone = sanitizePhoneNumber(secondaryPhone);
        System.out.println("Name: " + sanitizedFirstName.concat(" ").concat(sanitizedLastName));
        System.out.println("Primary Phone Number: " + sanitizedPrimaryPhone);
        System.out.println("Secondary Phone Number: " + sanitizedSecondaryPhone);



    }
    static String sanitizeName(String name) {
        String firstCharOfName = name.substring(0, 1).toUpperCase();
        String firstNameWithoutFirstChar = name.substring(1);
        return firstCharOfName.concat(firstNameWithoutFirstChar);
    }


    static String sanitizePhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("\\D+", "");
    }
}
