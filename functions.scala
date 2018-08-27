import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
    def main(args: Array[String]) {
        
        def getSum(num1: Int = 1, num2 : Int = 2) : Int = {
            return num1 + num2
        }

        def getSum2(args : Int*) : Int = {
            var sum : Int = 0
            for(num <- args) {
                sum += num
            }
            sum
        }

        // recursion
        def factorial(num : BigInt) : BigInt = {
            if( num <= 1)
                1
            else 
                num * factorial(num - 1)
        }

        // print results
        println("Factorial of 4 = " + factorial(4))
        println("List of args: " + getSum2(1,3,4,5,7,8))
        println("5 + 4 = " + getSum(5,4))
    }
}