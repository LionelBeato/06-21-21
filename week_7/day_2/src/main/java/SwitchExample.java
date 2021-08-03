public class SwitchExample {

    public static void printShirtSize(char shirt) {
        String msg = "";
        switch (Character.toLowerCase(shirt)) {
            case 's':
                msg = "shirt is small";
                break;
            case 'm':
                msg = "shirt is medium";
                break;
                // you can stack switch cases like so:
            case 'L':
            case 'l':
                msg = "shirt is large";
                break;
            case 'x':
                msg = "shirt is extra large";
                break;
            default:
                msg = "shirt size unknown";
                break;
        }

        System.out.println(msg);
    }

    public static void enhancedSwitch(char myCharacter) {

        switch (myCharacter) {
            case 'a' -> System.out.println("Case a was evaluated successfully");
            case 'b' -> System.out.println("Case b was evaluated successfully");
            default -> System.out.println("Did not understand input");
        }

    }




}
