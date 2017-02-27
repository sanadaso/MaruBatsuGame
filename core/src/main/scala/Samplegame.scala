package my.game.pkg

import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.{Game, Gdx}

class Samplegame extends Game {
  override def create() {}

  var r = 0f
  var g = 0f
  var b = 0f

  override def render() {
    r += 0.02f
    g += 0.04f
    b += 0.06f

    Gdx.gl.glClearColor(Math.sin(r).toFloat, Math.sin(g).toFloat, Math.sin(b).toFloat, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
  }
}
