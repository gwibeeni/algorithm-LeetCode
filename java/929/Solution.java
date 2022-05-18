import java.util.Arrays;

class Solution {
    public int numUniqueEmails(String[] emails) {
        return (int) Arrays.stream(emails)
            .map(this::parseEmail)
            .distinct()
            .count();
    }

    private String parseEmail(String email) {
        String[] emailToken = email.split("@");

        String localName = emailToken[0];
        String domainName = emailToken[1];

        String forwardedLocalName = parseLocalName(localName);

        return forwardedLocalName + "@" + domainName;
    }

    private String parseLocalName(String localName) {
        return localName.replaceAll("\\.", "")
            .replaceAll("\\+.*", "");
    }
}
