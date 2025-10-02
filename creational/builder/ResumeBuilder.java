import java.util.ArrayList;
import java.util.List;

public class ResumeBuilder {
    private String name;
    private String education;
    private List<String> skills = new ArrayList<>();
    private List<String> experience = new ArrayList<>();

    public ResumeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ResumeBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    public ResumeBuilder addSkill(String skill) {
        this.skills.add(skill);
        return this;
    }

    public ResumeBuilder addExperience(String exp) {
        this.experience.add(exp);
        return this;
    }

    public Resume build() {
        return new Resume(name, education, skills, experience);
    }
}
