package easy

// Result
// https://leetcode.com/submissions/detail/474110158/
object DesignParkingSystem {
  class ParkingSystem(_big: Int, _medium: Int, _small: Int) {
    val spaces = Array(_big, _medium, _small)

    def addCar(carType: Int): Boolean = {
      val index = carType - 1
      val ret   = spaces(index) > 0
      spaces(index) = spaces(index) - 1
      ret
    }
  }
  /**
    * Your ParkingSystem object will be instantiated and called as such:
    * var obj = new ParkingSystem(big, medium, small)
    * var param_1 = obj.addCar(carType)
    */
}
