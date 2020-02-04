package com.alexsergeenko.scala

class PotatoWeight extends App {
  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    weight./(potatoWaterRatio)
  }

  println(crispsWeight(90.0, 0.9, 0.1))
}
