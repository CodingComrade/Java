public class TeamLeader extends ProductionWorker{
    private int monthlyBonus;
    private int trainingHours;
    private int trainingHoursCompleted;

    public TeamLeader(int monthlyBonus, int trainingHours,
                      int trainingHoursCompleted) {
        this.monthlyBonus = monthlyBonus;
        this.trainingHours = trainingHours;
        this.trainingHoursCompleted = trainingHoursCompleted;
    }

    public int getMonthlyBonus() {
        return monthlyBonus;
    }

    public int getTrainingHours() {
        return trainingHours;
    }

    public int getTrainingHoursCompleted() {
        return trainingHoursCompleted;
    }

    public void setMonthlyBonus(int monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }

    public void setTrainingHoursCompleted(int trainingHoursCompleted) {
        this.trainingHoursCompleted = trainingHoursCompleted;
    }
}
