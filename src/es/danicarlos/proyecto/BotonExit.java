package es.danicarlos.proyecto;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class BotonExit extends Boton { // Botón que permitirá salir del juego

	public BotonExit(int x, int y) {
		super(x, y);
		texture = new Texture(Gdx.files.internal("exit.jpg")); // Se asigna textura. Muy importante!!
	}

	@Override
	protected void funcionamiento() {
		Gdx.app.exit(); // Cierra la aplicación
	}
}