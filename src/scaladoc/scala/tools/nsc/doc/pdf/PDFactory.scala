package scala.tools.nsc.doc.pdf

import scala.tools.nsc.doc.model._
import scala.tools.nsc.doc.{Index, Universe}


/**
 * Created by yaroslav on 03.05.2015.
 */
class PDFactory(univ: Universe, index: Index) {
  def generate(): Unit = {

    def showPackage(root: Entity)(implicit out: (String => Unit)): Unit = root match {
      case (p: Package) =>
        out(p.name)
        p.packages.foreach(showPackage(_))
    }
    showPackage(univ.rootPackage)(println(_))

  }

}
