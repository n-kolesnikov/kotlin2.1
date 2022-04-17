import kotlin.math.roundToInt

fun main(){

    val amountRub:Double = 1002.34
    var amountKop = amountRub * 100
    val commissionPercent = amountKop * 0.0075
    val commission = 3500
    if (commissionPercent >= commission){
        amountKop = (amountKop + commissionPercent).roundToInt() / 100.0
        println("Сумма учетом комиссии: $amountKop")
    }
    else{
        amountKop = (amountKop + commission) / 100
        println("Сумма учетом комиссии: $amountKop")
    }

}