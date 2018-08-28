import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
    def main(args: Array[String]) {
        
       val writer = PrintWriter("test.txt")
       writer.write("Just some random text\n Some more random text on the file")
       writer.close()

       val textFromFile = Source.fromFile("text.txt", "UTF-8")

       val lineIterator = textFromFile.getLines

        for(line <- lineIterator) 
            println(line)
        
        textFromFile.close()
    }
} 