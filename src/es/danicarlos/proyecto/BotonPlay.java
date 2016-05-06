package es.danicarlos.proyecto;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class BotonPlay extends Boton{

	public BotonPlay(int x, int y) {
		super(x, y);
		texture = new Texture(Gdx.files.internal("play.jpg")); // Se asigna textura. Muy importante!!
	}

	@Override
	protected void funcionamiento() {
		System.out.println("hola");
		Screens.juego.setScreen(Screens.GAMESCREEN); // Se asigna la pantalla de juego
	}
}
