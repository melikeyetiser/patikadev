public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralExamNote;
    int oralExamWeightPercentage;

    public Course(String name, String code, String prefix, int oralExamWeightPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralExamNote = 0;
        this.oralExamWeightPercentage = oralExamWeightPercentage;
    }

    public int getNote() {
        return note;
    }

    public int getOralExamNote() {
        return oralExamNote;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setOralExamNote(int oralExamNote) {
        this.oralExamNote = oralExamNote;
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
}
