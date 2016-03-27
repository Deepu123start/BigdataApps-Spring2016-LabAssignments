package edu.umkc.ic

import java.io.{File, FileFilter}

/**
 * Created by Deepu on 17/03/16.
 */
object Utils {

  /**
   * Prints the files in the directory Train
   */
  def printFiles(INPUT_DIR: String): Unit = {
    val dir = new File(INPUT_DIR)
    println(dir.listFiles().size)

    val directoryFilter = new FileFilter() {
      override def accept(pathname: File): Boolean = pathname.isDirectory
    }

    for (dir_name <- dir.listFiles(directoryFilter)) {
      for (img_name <- dir_name.listFiles()) {
        println(img_name)
      }
    }
  }

}
