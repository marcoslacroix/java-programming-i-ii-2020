
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static ArrayList<Teams> readRecordsFromFile(String file) {
        ArrayList<Teams> team = new ArrayList<>();
        
        try ( Scanner scanTxt = new Scanner(Paths.get(file))) {
            while (scanTxt.hasNextLine()) {
                String line = scanTxt.nextLine();
                
                String[] parts = line.split(",");
                
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                team.add(new Teams(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Failled to read file.");
        }
        return team;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File: ");
        String readFile = scan.nextLine();
        System.out.print("Team: ");
        String readTeam = scan.nextLine();
        int count = 0;
        int win = 0;
        int losses = 0;
        ArrayList<Teams> records = readRecordsFromFile(readFile);
        for (Teams time : records) {
            if (time.getHometeam().equals(readTeam) || time.getVisitingTeam().equals(readTeam)) {
                count++;
            }
        }
        for (Teams winLoses : records) {
            if (winLoses.getHometeam().equals(readTeam)) {
                if (winLoses.getHomeTeamPoint() > winLoses.getVisitingTeamPoint()) {
                    win++;
                }
            } else if (winLoses.getVisitingTeam().equals(readTeam)) {
                if (winLoses.getVisitingTeamPoint() > winLoses.getHomeTeamPoint()) {
                    win++;
                }
            }
        }

        for (Teams loss : records) {
            if (loss.getHometeam().equals(readTeam)) {
                if (loss.getHomeTeamPoint() < loss.getVisitingTeamPoint()) {
                    losses++;
                } else if (loss.getVisitingTeam().equals(readTeam)) {
                    if (loss.getVisitingTeamPoint() < loss.getHomeTeamPoint()) {
                        losses++;
                    }
                }
            }

        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + losses);
    }
}
