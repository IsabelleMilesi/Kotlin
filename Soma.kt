/**
* You can edit, run, and share this code.
* play.kotlinlang.org
*/
import kotlin.random.Random
fun soma(a: int, b:int):Int  {
    return a+b
}
fun main{
   val n1 = Random.nextInt (1,10)
   val n2 = Random.nextInt (1,10)
   val resultado = soma (n1,n2)
   println ("Soma $n1 + $n2= $resultado")
}