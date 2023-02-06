import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("введите k:")
    var k: Double = readLine()!!.toDouble()
    print("введите  a:")
    var a: Double = readLine()!!.toDouble()
    print("введите  b:")
    var b: Double = readLine()!!.toDouble()
    var D=0.0
    var x1=0.0
    var x2=0.0
    D=a.pow(2)-(4*b)
    if(D>=0)
    {
        x1=(-a+ sqrt(D))/2
        x2=(-a- sqrt(D))/2
        print(x1)
        print(x2)
        when
    {
        (-k<x1&&x1<k) ->print("корень $x1 попадает  в интервал от ${-k} до $k ")
        (-k<x2&&x2<k) ->print("корень $x2 попадает  в интервал от ${-k} до $k ")
        else -> print("нет корней которые потходит в интервал")
    }
    }
    else print("решение нет")


}