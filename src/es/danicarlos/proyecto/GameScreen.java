package es.danicarlos.proyecto;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends AbstractScreen{
	
	private SpriteBatch  batch;
	private Texture texture;
	private float escala;
	
	public GameScreen(MainProyecto main) {
		super(main);
		// TODO Auto-generated constructor stub
	}
	public void show(){
		batch = MainProyecto.getbatch();
		texture = new Texture(Gdx.files.internal("badlogic.jpg"));
	}
	public void render (float delta){
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//para que coja la altura y anchura de la pantalla
		batch.draw(texture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}

}
