package exercises.exercise4;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] patterns = {
            "\\d+",                 // Matches one or more digits
            "\\w+",                 // Matches one or more word characters
            "\\b\\d{3}\\b",         // Matches exactly three digits as a whole word
            "\\b[A-Z][a-z]+\\b",    // Matches words starting with an uppercase letter followed by lowercase letters
            "\\b\\d{2}-\\d{2}-\\d{4}\\b" // Matches a date pattern (MM-DD-YYYY)
        };

        String[] subjects = {
            "12345",
            "Hello123",
            "4567 Hello 890 ABC",
            "Java Regex",
            "12-31-2022",
            "abc",
            "Hello_World",
            "12 345 6789",
            "Regex101",
            "2023-11-21"
        };

        System.out.println("-------------------------------------------");
        for (String pattern : patterns) {
            System.out.println("Regular Expression Pattern: " + pattern);
            Pattern regex = Pattern.compile(pattern);
            
            for (String subject : subjects) {
                Matcher matcher = regex.matcher(subject);
                boolean found = matcher.find();
                System.out.println("Subject: " + subject + " - Match: " + found);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }
}

