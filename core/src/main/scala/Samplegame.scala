package my.game.pkg

import com.badlogic.gdx.graphics.{GL20, Texture}
import com.badlogic.gdx.{Game, Gdx}

class Samplegame extends Game {
  override def create() = {

  }

  import scala.collection.mutable.Map

//  var a = (1, "as", 3)
  var map = Map.empty[(Int, Int), Int]


  for (x <- 1 to 3 ; y <- 1 to 3) {
      map.put((x, y), 0)
  }

  map.update((1, 1), 1)
  map.update((1, 2), 0)
  map.update((1, 3), 0)
  map.update((2, 1), 1)
  map.update((2, 2), 0)
  map.update((2, 3), 2)
  map.update((3, 1), 2)
  map.update((3, 2), 1)
  map.update((3, 3), 0)

  def show(map:Map[(Int, Int), Int]) = {
    for (x <- 1 to 3) {
      var line = ""
      for(y <- 1 to 3) {
        val cell= map.getOrElse((x,y), 9)
        val char = cell match {
          case 1 => "〇"
          case 2 => "×"
          case _ => "　"
        }
        line += char
      }
      println(line)
    }
  }

  show(map)


  var r = 1f
  var g = 1f
  var b = 1f

  override def render() {
    Gdx.gl.glClearColor(r, g, b, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
  }
}
