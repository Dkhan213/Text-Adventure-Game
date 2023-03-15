package main.com.adventure;

import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandConstants;
import main.com.adventure.settings.CommandVerb;

import java.util.Locale;
import java.util.Scanner;

public class GameInputProcessor {

    /**
     * Asks the user for their next command.
     * @return the response from the user.
     */
    public String prompt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your next command:");
        return scan.nextLine();
    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank.
     * Example input:
     *  "help"
     *  "look"
     *
     *  Note: this command must stay private when running the tests
     *
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) {
        if (input.contains(" ")) {
            String verb = input.substring(0, input.indexOf(" "));
            return new Command(CommandVerb.getVerb(verb), "");
        } else {
            return new Command(CommandVerb.getVerb(input), "");
        }
    }

    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object parameter as part of the Command object.
     * Example input:
     *  "use key"
     *  "examine door"
     *  "move west"
     *
     * You should also account for incomplete actions (i.e. the object is missing). In that case, you should return an
     * empty string for the object parameter.
     * Example bad input:
     *  "move"
     *  " use "
     *
     *  Note: this command must stay private when running the tests
     *
     * @param input - the input from the user
     * @return - the Command object with the proper verb and object
     */
    private Command buildCommandWithObject(String input) {
        if (input.contains(" ")) {
            String verb = input.substring(0, input.indexOf(" "));
            String object = input.substring(input.indexOf(" ") + 1);
            return new Command(CommandVerb.getVerb(verb), object);
        } else {
            return new Command(CommandVerb.getVerb(input), "");
        }
    }


    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/

    /**
     * Gets the next command from the user.
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        return processCommand(input);
    }

    private Command processCommand(String input) {
        String normalizedInput = input.toLowerCase(Locale.ROOT);
        if (normalizedInput.contains(CommandConstants.MOVE) ||
                normalizedInput.contains(CommandConstants.USE) ||
                normalizedInput.contains(CommandConstants.TAKE) ||
                normalizedInput.contains(CommandConstants.EXAMINE)
        ) {
            return buildCommandWithObject(normalizedInput);
        } else {
            return buildSimpleCommand(normalizedInput);
        }
    }

}
