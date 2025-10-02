import java.util.Scanner;

public class MainResume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResumeBuilder builder = new ResumeBuilder();

        System.out.println("=== Resume Builder ===");

        System.out.print("Enter your name: ");
        builder.setName(scanner.nextLine());

        System.out.print("Enter your education: ");
        builder.setEducation(scanner.nextLine());

        // Skills
        System.out.println("Enter skills (type 'done' to finish):");
        while (true) {
            String skill = scanner.nextLine();
            if (skill.equalsIgnoreCase("done")) break;
            builder.addSkill(skill);
        }

        // Experience
        System.out.println("Enter work experiences (type 'done' to finish):");
        while (true) {
            String exp = scanner.nextLine();
            if (exp.equalsIgnoreCase("done")) break;
            builder.addExperience(exp);
        }

        Resume resume = builder.build();
        resume.showResume();

        scanner.close();
    }
}
