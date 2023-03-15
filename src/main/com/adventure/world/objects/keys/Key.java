package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 *
 * The default values for a door are level = 1 and name = "key"
 */

public class Key implements Tangible {

    //TODO variable for level and name needed here
    private int level;
    private String name;
    //TODO Add default (i.e. no params) constructor

    /**
     * Add a constructor with no parameters
     * Sets the level and name fields to the default values of 1, and "key" respectively.
     */
    public Key() {
        level = 1;
        name = "key";
    }

    /**
     * Add a constructor with a single parameter.
     * @param level Sets the level field to the provided value.
     * Sets the name field to the default "key" value.
     */
    //TODO add constructor that takes a level, and saves it
    public Key(int level) {
        this.level = level;
        name = "key";
    }

    /**
     * Add a constructor with two fields.
     * @param level Sets the level field to the provided value.
     * @param name Sets the name field to the provided value.
     */
    //TODO add constructor that takes a level and name, and saves it
    public Key(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        //TODO Fix this so it references the level property instead of 0
        return level;
    }

    //TODO Fix this so it references the name property instead of "key"
    @Override
    public String getName() {
        return name;
    }





    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
