package com.netaporter

object Multiplication {

    def multiply(x: Int, y: Int): Double = {

        var result = 0L
        val isNegative = x < 0

        (1 to math.abs(x)).foreach { _ =>  
            result += y
        }

        if (isNegative) - result else result

    }


}
