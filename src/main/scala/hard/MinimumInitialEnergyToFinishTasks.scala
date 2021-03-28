package hard

// Result
// https://leetcode.com/submissions/detail/472652860/
object MinimumInitialEnergyToFinishTasks {
  def minimumEffort(tasks: Array[Array[Int]]): Int = {
    var _eft = 0
    var _min = 0
    tasks.sortWith((x ,y) => (y(1) - y(0)) < (x(1) - x(0))).foreach { task =>
      if (_eft < task(1)) {
        val add = task(1) - _eft
        _eft += add
        _min += add
      }
      _eft -= task(0)
    }
    _min
  }
}

