class Solution {
    private static final int MAX_ROUND = 96;

    public int numberOfRounds(String loginTime, String logoutTime) {
        int loginTimestamp = this.parseTime(loginTime);
        int logoutTimestamp = this.parseTime(logoutTime);

        int firstRoundNumber = this.calculateFirstRound(loginTimestamp);
        int lastRoundNumber = this.calculateLastRound(logoutTimestamp);

        if (loginTimestamp > logoutTimestamp) {
            return MAX_ROUND + lastRoundNumber - firstRoundNumber;
        }

        if (lastRoundNumber - firstRoundNumber < 0) {
            return 0;
        }

        return lastRoundNumber - firstRoundNumber;
    }

    private int calculateFirstRound(int startTime) {
        if (startTime % 15 == 0) {
            return startTime / 15;
        }

        return (startTime / 15) + 1;
    }

    private int calculateLastRound(int endTime) {
        return endTime / 15;
    }

    private int parseTime(String time) {
        String[] timeToken = time.split(":");

        int hour = Integer.parseInt(timeToken[0]);
        int minute = Integer.parseInt(timeToken[1]);

        return (hour * 60) + minute;
    }
}
