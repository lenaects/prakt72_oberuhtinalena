fun main()
{
    print ("введите первое число:")
    var a1:Double = readLine()!!.toDouble()
    print ("введите вторе число:")
    var a2:Double = readLine()!!.toDouble()
when
{
    (a1%2==0.0&&a2%2==0.0)-> println("оба четных")
    (!(a1%2==0.0)&&!(a2%2==0.0))-> println("оба нечетных")
    else->println("одно четное другое нечетное")
}

}
