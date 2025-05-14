/**
* You can edit, run, and share this code.
* play.kotlinlang.org
*/
import kotlin.random.Random
fun subtracao(a: Int, b:Int):Int  {
    return a-b
}
fun main(){
    val n1 = Random.nextInt (1,10)
   val n2 = Random.nextInt (1,10)
   val resultado = subtracao(n1,n2)
   println ("subtracao $n1 - $n2= $resultado")   
}