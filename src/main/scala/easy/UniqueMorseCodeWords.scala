package easy

// Result
// https://leetcode.com/submissions/detail/274245498/
object UniqueMorseCodeWords {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val alphabets = 'A' to 'Z'
    val morses    = Seq(".-","-...","-.-.","-..",".","..-.",
                        "--.","....","..",".---","-.-",".-..",
                        "--","-.","---",".--.","--.-",".-.","...",
                        "-","..-","...-",".--","-..-","-.--","--..")
    val morseMap = alphabets.zipWithIndex.map { case (v, i) =>
      v -> morses(i)
    }.toMap

    val morseWords = words.map { x =>
      x.toUpperCase.toCharArray.map { c =>
        morseMap(c)
      }.mkString
    }

    morseWords.distinct.length
  }
}
