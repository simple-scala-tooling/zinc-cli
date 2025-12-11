package org.scala.abusers.zincCli

import java.nio.file.Path
import java.{util => ju}

class OutputJar(outputDir: Path, tempDir: Path, jarName: String) {
  def temp: Path = tempDir.resolve(s"$jarName-temp.jar")
  def path: Path = outputDir.resolve(s"$jarName.jar")
}
