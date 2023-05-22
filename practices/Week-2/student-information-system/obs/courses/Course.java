package obs.courses;
import obs.persons.Teacher;
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    public int note;
    public int verbalNote;
    public double averageAllNote;
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.averageAllNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public void calculateAvgWithVerbal() {
        this.averageAllNote = (0.2 * this.verbalNote) + (0.8 * this.note);
    }
}
