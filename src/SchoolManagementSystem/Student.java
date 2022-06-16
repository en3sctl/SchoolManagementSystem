package SchoolManagementSystem;

public class Student {
    private int id;
    private String name;
    private double grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, double grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void payingFees(int fees) {
        feesPaid += fees;
        School.updateTotalEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                " Total fees paid so far Zl: " + feesPaid;
    }
}
