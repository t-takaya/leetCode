package easy

// Result
// https://leetcode.com/submissions/detail/273948855/
object UniqueEmailAddresses {
  def numUniqueEmails(emails: Array[String]): Int = {
    val distinctEmails = emails.map { x =>
      val index = x.indexOf("+")
      val local = x.substring(0, x.indexOf("@"))
      val filteredLocal = local.substring(0, if (index < 0) { local.length } else { index })
                               .replaceAll("\\.","")
      val domain = x.substring(x.indexOf("@"))
      filteredLocal + domain
    }.distinct

    distinctEmails.length
  }
}
