
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.examPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
    public double averageOfGrades(){
        double sum = 0;
        if(grades.size() > 0){
            for (Integer each : grades){
                sum += each;
            }
            return sum / grades.size();
        }
        
        return -1;
    }
    
    public double averageOfPoints(){
        double sum = 0;
        if(examPoints.size() > 0){
            for(Integer each : examPoints){
                sum+= each;
            }
            return sum /examPoints.size();
        }        
        return -1;
    }
}
