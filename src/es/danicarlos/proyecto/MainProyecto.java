package es.danicarlos.proyecto;


import java.awt.FlowLayout;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MainProyecto extends Game {
	private static SpriteBatch batch;
	//public AbstractScreen GAMESCREEN;
	@Override
	public void create () {
//		batch = new SpriteBatch();
//		Gdx.input.setCatchBackKey(true); // Bloquea el boton "Back" de android para que se tenga que salir del juego usando el boton "Exit"
//		Screens.juego = this;
		Screens.GAMESCREEN = new GameScreen(this); // Se inicializan las pantallas
		Screens.MAINSCREEN = new MainScreen(this);

		batch = new SpriteBatch();
		//Screens.GAMESCREEN = new GameScreen(this);
		//setScreen(Screens.GAMESCREEN);
		setScreen(Screens.MAINSCREEN);
	}

	public static SpriteBatch getbatch(){
		return batch;
	}
}
