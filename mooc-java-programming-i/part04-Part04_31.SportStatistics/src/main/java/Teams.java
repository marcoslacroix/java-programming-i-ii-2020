public class Teams {
    
    private String hometeam;
    private String visitingTeam;
    private int homeTeamPoint;
    private int visitingTeamPoint;

    public Teams(String hometeam, String visitingTeam, int homeTeamPoint, int visitingTeamPoint) {
        this.hometeam = hometeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoint = homeTeamPoint;
        this.visitingTeamPoint = visitingTeamPoint;
    }

    public String getHometeam() {
        return hometeam;
    }

    public void setHometeam(String hometeam) {
        this.hometeam = hometeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public int getHomeTeamPoint() {
        return homeTeamPoint;
    }

    public void setHomeTeamPoint(int homeTeamPoint) {
        this.homeTeamPoint = homeTeamPoint;
    }

    public int getVisitingTeamPoint() {
        return visitingTeamPoint;
    }

    public void setVisitingTeamPoint(int visitingTeamPoint) {
        this.visitingTeamPoint = visitingTeamPoint;
    }      

    @Override
    public String toString() {
        return "Teams{" + "hometeam=" + hometeam + ", visitingTeam=" + visitingTeam + ", homeTeamPoint=" + homeTeamPoint + ", visitingTeamPoint=" + visitingTeamPoint + '}';
    }
    
    
}
