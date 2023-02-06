fun main() {
    print("введите N1 :")
    var N1: Double = readLine()!!.toDouble()
    print("введите  N2:")
    var N2: Double = readLine()!!.toDouble()
    print("введите  N2:")
    var N3: Double = readLine()!!.toDouble()
    if(N1>=0&&N2>=0&&N3>=0)
    {
        when
        {
            (N1<=5&&N2<=5&&N3<=5)->print("все товары хорошие")
            else->print("есть плохие товары")
        }
    }
    else print("не может быть отрицательным")

}