package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {

    private Key content;
    private boolean isCovered = true;

    /**
     * A constructor with one parameter.
     * @param key Sets the content of the hole to the provided key.
     */
    public HoleContent(Key key) {
        this.content = key;
    }
    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }
    public boolean isCovered() {
        return isCovered;
    }
    public Key getKey() {
        return content;
    }
}
