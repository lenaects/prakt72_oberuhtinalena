fun main()
{
    print("введите трехзначное число:")
    var x:Int = readLine()!!.toInt()
    var x1:Int
    var x2:Int
    var x3:Int
    if(x>99&&x<1000)
    {
        x1=x%10
        x2=(x/10)%10
        x3=x/100
        when
        {
            (x1<x2&&x2<x3)->println("упорядоченый")
            (x1>x2&&x2>x3)->println("упорядоченый")
            (x1==x2&&x2==x3)->println("цифры равны")
            else->println("не упорядоченый")
        }



    }
    else println("число не трехзначное")
}