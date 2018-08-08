package de.computercamp.rpg.entities.items;

import de.computercamp.rpg.Vector2D;
import de.computercamp.rpg.entities.Player;
import de.computercamp.rpg.resources.Messages;

public class Key extends Item {

    public Key(Vector2D pos) {
        super(pos);
        symbol = '\ua720';
        displayName = Messages.key;
    }

    @Override
    public void use(Player player) {
        player.up();
    }
}