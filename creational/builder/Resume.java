import java.util.List;

public class Resume {
    private String name;
    private String education;
    private List<String> skills;
    private List<String> experience;

    public Resume(String name, String education, List<String> skills, List<String> experience) {
        this.name = name;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
    }

    public void showResume() {
        System.out.println("\n===== Generated Resume =====");
        System.out.println("Name: " + name);
        System.out.println("Education: " + education);
        System.out.println("Skills: " + skills);
        System.out.println("Experience: " + experience);
        System.out.println("============================");
    }
}
