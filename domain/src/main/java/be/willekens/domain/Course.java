package be.willekens.domain;

public class Course {

    private int id;
    private String name;
    private int amountOfStudyPoints;
    private Professor professor;

    public Course(int id, String name, int amountOfStudyPoints, Professor professor) {
        this.id = id;
        this.name = name;
        this.amountOfStudyPoints = amountOfStudyPoints;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfStudyPoints() {
        return amountOfStudyPoints;
    }

    public void setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
