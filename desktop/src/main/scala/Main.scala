package my.game.pkg

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.backends.lwjgl._

object Main extends App {
    val cfg = new LwjglApplicationConfiguration
    cfg.title = "SampleGame"
    cfg.height = 720
    cfg.width = 720
    cfg.forceExit = false
    new LwjglApplication(new Samplegame, cfg)
}
