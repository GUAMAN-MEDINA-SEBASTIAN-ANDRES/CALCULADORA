import javax.swing.JFrame

var total: Double=0.0
var numStr: String=""
var num: Double=0.0
var ultAcao: Char='T'

fun main(args: Array<String>){
    JanCalculadora().defaultCloseOperation=JFrame.EXIT_ON_CLOSE
}
fun mostrar(i: Byte): String{
    numStr+= i
    return numStr
}
fun calcular(c: Char): String{

    if (c=='C'){
        ultAcao='I'
        num=0.0
        total=0.0
        numStr=""
    } else {
        if(numStr.isNotEmpty()){
            num=java.lang.Double.parseDouble(numStr)
            numStr=""
        }
        when(ultAcao){
            'I' -> total = num
            '+' -> total += num
            '-' -> total -= num
            'X' -> total *= num
            '/' -> total /= num
        }
        ultAcao = c
    }

    return "" +total
}

