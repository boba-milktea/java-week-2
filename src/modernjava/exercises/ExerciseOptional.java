package modernjava.exercises;

import java.util.Optional;

/**
 * Exercise: Working with Optional
 * -------------------------------
 * TODO:
 * 1. Create a method `findEmailByUsername(String username)`
 *    - If username is "admin", return "admin@example.com"
 *    - Otherwise, return an empty Optional
 *
 * 2. In main():
 *    - Call the method with a valid username
 *    - Call the method with an invalid username
 *    - Print the result using `orElse("No email found")`
 */

public class ExerciseOptional {
    public static void main(String[] args) {
        //ExerciseOptional obj = new ExerciseOptional();


        // TODO: Call with an existing user
        Optional<String> email1 = findEmailByUsername("admin");
        System.out.println(email1.orElse("No email found."));

        // TODO: Call with a missing user
       /* Optional<String> email2 = obj.findEmailByUsername("guest");
        System.out.println(email2.orElse("No email found"));
    */
        Optional<String> email2 = findEmailByUsername("guest");
        System.out.println(email2.orElse("No email found."));

    }

    private static Optional<String> findEmailByUsername(String username) {
        if (username.equals("admin")) {
            return Optional.of("admin@gmail.com");
        } else {
            return Optional.empty();
        }

        // TODO: Write findEmailByUsername(String username)
    }
}
