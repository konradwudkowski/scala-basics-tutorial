package com.netaporter

import org.scalatest.FlatSpec
import org.scalatest.Matchers

import Multiplication.multiply

class MultiplicationSpec extends FlatSpec with Matchers {

    "Function `multiply`" should "multiply 2 & 3 and return 6" in {
        multiply(2,3) shouldBe 6
    }

    it should "work for negative numbers" in {
        multiply(-2,5) shouldBe -10
        multiply(2,-5) shouldBe -10
    }

    it should "work for zeros" in {
        multiply(0,6) shouldBe 0
        multiply(6,0) shouldBe 0
    }

    it should "work for big numbers" in {
        multiply(Int.MaxValue,Int.MaxValue) shouldBe 4611686014132420609L
    }
}
