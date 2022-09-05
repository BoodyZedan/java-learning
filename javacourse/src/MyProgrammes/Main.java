package MyProgrammes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("What is your First name");
        Scanner firstNameInput = new Scanner(System.in);
        user.firstName = firstNameInput.nextLine();
        String oldMemberFN = "caleb";
        String oldMemberLN = "curly";
        System.out.println("What is your Last name");
        Scanner lastNameInput = new Scanner(System.in);
        user.lastName = lastNameInput.nextLine();
        if ((user.firstName.equals(oldMemberFN)) & (user.lastName.equals(oldMemberLN))) {
            System.out.println("Wellcome back " + oldMemberFN + " " + oldMemberLN);

        } else {
            System.out.println(user.getfullname());
        }
    }
}
