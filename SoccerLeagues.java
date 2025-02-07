public class SoccerLeagues {
    public int[] points(String[] matches) {
        int numTeams = matches.length;
        int[] points = new int[numTeams];
        for (int teamNum = 0; teamNum < numTeams; teamNum++){
            String[] matchList = matches[teamNum].split("");
            for (int matchNum = 0; matchNum < matchList.length; matchNum ++)
            {
                if (matchList[matchNum].equals("W")){
                    points[teamNum] +=3;
                }
                if (matchList[matchNum].equals("L")){
                    points[matchNum] +=3;
                }
                if (matchList[matchNum].equals("D")){
                    points[teamNum] +=1;
                    points[matchNum] +=1;
                }
            }

        }
        return points;
    }
}