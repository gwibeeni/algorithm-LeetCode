class Solution:
    def __init__(self):
        self.MAX_ROUND = 96

    def numberOfRounds(self, loginTime: str, logoutTime: str) -> int:
        login_timestamp = self.parseTime(loginTime)
        logout_timestamp = self.parseTime(logoutTime)

        first_round_number = self.calculateFirstRound(login_timestamp)
        last_round_number = self.calculateLastRound(logout_timestamp)

        if login_timestamp > logout_timestamp:
            return self.MAX_ROUND + last_round_number - first_round_number

        if last_round_number < first_round_number:
            return 0

        return last_round_number - first_round_number

    def calculateFirstRound(self, start_time: int) -> int:
        if start_time % 15 == 0:
            return start_time // 15

        return (start_time // 15) + 1

    def calculateLastRound(self, end_time: int) -> int:
        return end_time // 15

    def parseTime(self, time: str) -> int:
        time_token = time.split(':')

        hour = int(time_token[0])
        minute = int(time_token[1])

        return (hour * 60) + minute
