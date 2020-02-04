package com.alexsergeenko.scala

class MathDeviation extends App {
  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    1 / (sigma * Math.sqrt(2 * Math.PI)) * Math.pow(Math.E, -(x - mu) * (x - mu) / 2 * sigma * sigma)
  }
}
