import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
  val potatoDryWeight = weight * (1 - potatoWaterRatio)
  val answer = (potatoDryWeight * weight) / (weight - crispsWaterRatio)
  answer.setScale(5, HALF_UP)
}

crispsWeight(100.0, 0.99, 0.98)

