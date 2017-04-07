package ohtu;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private int max;
    private Boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getWeek() {
        return week;
    }

    public int getHours() {
        return hours;
    }

    public int completedAssignments() {
        int sum = 0;
        Boolean[] assignments = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21};
        for (int i = 0; i < 21; ++i) {
            if (assignments[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    public String getAssignments() {
        String string = "";
        Boolean[] assignments = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21};
        for (int i = 0; i < 21; ++i) {
            if (assignments[i] != null) {
                string += " " + (1 + i);
            }
        }
        return string;
    }

    @Override
    public String toString() {
        return "viiko " + week + ": tehtyjä tehtäviä yhteensä: " + completedAssignments() + " (maksimi " + max + "), aikaa kului " +
                hours + " tuntia, tehdyt tehtävät: " + getAssignments();
    }
    
}