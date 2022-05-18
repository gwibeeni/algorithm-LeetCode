import re

class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        return len(set(map(self.parseEmail, emails)))

    def parseEmail(self, email: str) -> str:
        localName, domainName = email.split("@")

        forwardedLocalName = self.parseLocalName(localName)

        return f"{forwardedLocalName}@{domainName}"

    def parseLocalName(self, localName: str) -> str:
        return re.sub(r"\.", "", re.sub(r"\+.*", "", localName))
