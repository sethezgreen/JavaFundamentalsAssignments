import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        String guestGreeting = String.format("Hello %s, how are you doing?", name);
        return guestGreeting;
    }

    // Ninja Bonus 1
    public String guestGreeting(String name, String day) {
        return String.format("Hello %s, how are you doing on this %s?", name, day);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        String dateAnnouncement = "The current date is: " + date;
        return dateAnnouncement;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally";
        }
        else {
            return "Right. And with that I shall retire";
        }
    }

    // Ninja Bonus 2
    public String messageLength(String message) {
        int length = message.length();
        return String.format("That's quite the message you've sent me, at %o characters.", length);
    }
}