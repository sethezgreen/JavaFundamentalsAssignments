public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting =alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Seth");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String testRespondBeforeAlexis = alfredBot.respondBeforeAlexis("Hey Alfred, can you tell me the weather?");
        String ninjaBonus = alfredBot.guestGreeting("Seth", "Monday");
        String ninjaBonus2 = alfredBot.messageLength("Hello Alfred, you're looking well today.");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(testRespondBeforeAlexis);
        System.out.println(ninjaBonus);
        System.out.println(ninjaBonus2);
    }
}