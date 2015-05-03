package scala.tools.nsc.doc.pdf

import scala.tools.nsc.doc.doclet.{Indexer, Universer, Generator}

/**
 * Created by yaroslav on 03.05.2015.
 */
class Doclet extends Generator with Universer with Indexer{

  override protected def generateImpl(): Unit = {
    new PDFactory(universe,index).generate()
  }
}
