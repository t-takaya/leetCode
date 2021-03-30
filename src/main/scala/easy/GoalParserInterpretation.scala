package easy

// Result
// https://leetcode.com/submissions/detail/474123551/
object GoalParserInterpretation {
  def interpret(command: String): String = {
    command.replace("()", "o").replace("(al)", "al")
  }
}
