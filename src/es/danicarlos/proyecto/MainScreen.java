package es.danicarlos.proyecto;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class MainScreen extends AbstractScreen {
	private SpriteBatch batch;
	private BotonExit exit;
	private BotonPlay play;
	public MainScreen(MainProyecto main) {
		super(main);
		// TODO Auto-generated constructor stub
		
		
	}
	public void show(){
		batch= MainProyecto.getbatch();
		Texture texture = new Texture(Gdx.files.internal("badlogic.jpg")); // Cogemos la textura del botón para usar su ancho y alto
		int centroY = Gdx.graphics.getHeight() / 2 - texture.getHeight() / 2; // Centro en el eje x de la pantalla centrando el botón
		int centroX = Gdx.graphics.getWidth() / 2 - texture.getWidth() / 2; // Centro en el eje y de la pantalla centrando el botón
		exit = new BotonExit(centroX, centroY );
		play = new BotonPlay(centroX, centroY + 50);
	}

	public void render (float delta){
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		exit.update(); // Comprobamos que se pulsan los botones
		play.update();
		
		batch.begin();
		exit.draw(batch); // Dibujamos el botón exit
		play.draw(batch); // Dibujamos el botón play
		batch.end();
	}
}
