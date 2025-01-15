public class TeacherStudent {

    // Teacher class
    public static class Teacher {
        private String tname;
        private String subject;
        private int yrsOfExp;

        public Teacher(String tname, String subject, int yrsOfExp) {
            this.tname = tname;
            this.subject = subject;
            this.yrsOfExp = yrsOfExp;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getYrsOfExp() {
            return yrsOfExp;
        }

        public void setYrsOfExp(int yrsOfExp) {
            this.yrsOfExp = yrsOfExp;
        }
    }

    // Student class
    public static class Student {
        private String sname;
        private String degree;
        private String college;

        public Student(String sname, String degree, String college) {
            this.sname = sname;
            this.degree = degree;
            this.college = college;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }
    }

    // Static method to show relationship between teacher and student
    public static void showRelationship(Teacher teacher, Student student) {
        System.out.println(student.getSname() + " takes " + teacher.getSubject() + " class under " + teacher.getTname() + " Sir");
    }

    // Static method to show a detailed relationship
    public static void showCompleteRelationship(Teacher teacher, Student student) {
        System.out.println(teacher.getTname() + " sir teaches " + teacher.getSubject() + " to " + student.getSname() +
                " who reads as a " + student.getDegree() + " student in " + student.getCollege() + " college");
    }

    // Main method
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Amitava", "OOPS design", 10);
        Teacher teacher2 = new Teacher("Amitava", "Java", 5);

        Student student1 = new Student("Ankan", "Btech", "UEM");
        Student student2 = new Student("Madhu", "Btech", "UEM");

        // Show relationships
        showRelationship(teacher2, student1);  // Ankan takes Java class under Amitava Sir
        showCompleteRelationship(teacher1, student2);  // Amitava teaches OOPS design to Madhu
    }
}
