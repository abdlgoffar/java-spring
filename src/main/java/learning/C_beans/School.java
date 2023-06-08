package learning.C_beans;

public class School {
   private University university;
   private Teacher teacher;

    public School(Teacher teacher) {
        this.teacher = teacher;
    }

    public School() {
    }


    public School(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
