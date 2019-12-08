package demo02;

public class Class {
    private String school;
    private String grade;
    private String className;
    private Integer classId;
    private Integer number;//班级人数

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Class{" +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", className='" + className + '\'' +
                ", classId=" + classId +
                ", number=" + number +
                '}';
    }
}
