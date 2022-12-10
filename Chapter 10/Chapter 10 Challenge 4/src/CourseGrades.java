public class CourseGrades extends GradedActivity {
    private int lab;
    private int outcome;
    private int essay;
    private int exam;

    public CourseGrades(int lab, int outcome, int essay, int exam) {
        this.lab = lab;
        this.outcome = outcome;
        this.essay = essay;
        this.exam = exam;
    }

    public void setLab(int lab) {
        this.lab = lab;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public void setEssay(int essay) {
        this.essay = essay;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public int getLab() {
        return lab;
    }

    public int getOutcome() {
        return outcome;
    }

    public int getEssay() {
        return essay;
    }

    public int getExam() {
        return exam;
    }



}
