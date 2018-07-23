package com.mygdx.game.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.game.screen.GameScreen;

public class BodyPart {

    private Integer bX, bY;
    private Texture texture;

    public BodyPart(Texture texture) {
        this.texture = texture;
    }

    public void movePart(Integer x, Integer y) {
        this.bX = x;
        this.bY = y;
    }

    public void drawBodyPart(Batch batch, Integer snakeX, Integer snakeY) {
        if(!(this.bX == snakeX && this.bY == snakeY)) {
            batch.draw(this.texture, bX, bY);
        }

    }

}
