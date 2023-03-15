package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb verb;
        switch (verbString.toLowerCase()) {
            case "take":
                verb = CommandVerb.TAKE;
                break;
            case "move":
                verb =  CommandVerb.MOVE;
                break;
            case "use":
                verb =  CommandVerb.USE;
                break;
            case "dig":
                verb = CommandVerb.DIG;
                break;
            case "examine":
                verb = CommandVerb.EXAMINE;
                break;
            case "look":
                verb = CommandVerb.LOOK;
                break;
            case "help":
                verb =  CommandVerb.HELP;
                break;
            case "fight":
                verb = CommandVerb.FIGHT;
                break;
            case "inventory":
                verb = CommandVerb.INVENTORY;
                break;
            default:
                verb = CommandVerb.INVALID;
                break;
        }
        return verb;
    }
}
