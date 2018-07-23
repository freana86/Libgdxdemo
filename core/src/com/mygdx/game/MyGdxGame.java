package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.mygdx.game.screen.GameScreen;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		this.setScreen(new GameScreen());
	}
}
