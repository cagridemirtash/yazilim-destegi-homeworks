package obs.persons;
import obs.courses.Course;
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    //Add verbal note for each course for student.
    //And then calcAverage function will be executed. calcAverage() -> 67.Line
    public void addVerbalNote(int verbalMat, int verbalFizik, int verbalKimya) {
        if(verbalMat >= 0 && verbalMat <= 100) {
            this.mat.verbalNote = verbalMat;
        }
        if(verbalFizik >= 0 && verbalFizik <= 100) {
            this.fizik.verbalNote = verbalFizik;
        }
        if(verbalMat >= 0 && verbalMat <= 100) {
            this.kimya.verbalNote = verbalKimya;
        }
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.1f%n",this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    //These object which have a calculateAvgWithVerbal function calculates average point of single course.
    //Then push to average variable.
    public void calcAverage() {
        this.mat.calculateAvgWithVerbal();
        this.fizik.calculateAvgWithVerbal();
        this.kimya.calculateAvgWithVerbal();
        this.average = (this.fizik.averageAllNote + this.kimya.averageAllNote + this.mat.averageAllNote) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}