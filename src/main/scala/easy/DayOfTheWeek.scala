package easy



// Result
// https://leetcode.com/submissions/detail/273958127/
object DayOfTheWeek {
  def dayOfTheWeek(day: Int, month: Int, year: Int): String = {
    val dayOfWeeks = Array("Sunday", "Monday", "Tuesday", "Wednesday",
                           "Thursday", "Friday", "Saturday")
    import java.util.Calendar
    val cal = Calendar.getInstance()
    cal.set(year, month - 1, day)
    val dayOfWeeNum = cal.get(Calendar.DAY_OF_WEEK) - 1

    dayOfWeeks(dayOfWeeNum)
  }
}
