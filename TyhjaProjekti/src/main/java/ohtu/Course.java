package ohtu;

public class Course {
    private String name, term;
    private String week1, week2, week3, week4, week5, week6;

    public int getMaxPoints(int week) {
        String[] weeks = {week1, week2, week3, week4, week5, week6};
        return Integer.parseInt(weeks[week - 1]);
    }

    @Override
    public String toString() {
        return "Kurssi: " + name + ", " + term;
    }
}