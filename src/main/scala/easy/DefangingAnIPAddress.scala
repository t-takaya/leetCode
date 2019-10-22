package easy

object DefangingAnIPAddress {
  def defangIPaddr(address: String): String = {
    val defangAddressSeq = address.split("").map { x =>
      if(x == "."){
        s"[$x]"
      }else{
        x
      }
    }
    defangAddressSeq.mkString("")
  }
}
