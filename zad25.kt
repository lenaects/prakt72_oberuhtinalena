import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    print("введите x:")
    var x: Double = readLine()!!.toDouble()
    print("введите y:")
    var y: Double = readLine()!!.toDouble()
    print("введите r:")
    var r: Double = readLine()!!.toDouble()
    var otv=0.0
    if(r>0)
    {
    if(y>0)
    {
       otv= sqrt((y.pow(2)+x.pow(2))) +r
        print("раастояние = $otv")
    }
    else
    {
        otv= sqrt((y.pow(2)+x.pow(2))) -r
        print("раастояние = $otv")
    }
    }
else print("радиус не может быть отрицательным")

}