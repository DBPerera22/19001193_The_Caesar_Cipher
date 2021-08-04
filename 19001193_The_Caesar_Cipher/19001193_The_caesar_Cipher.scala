class Caesar_Ciper {

	var Space_str = ""

//Data Encrypt
	def encrypt_data(shftLetter: Int): String = {
		
		val Add_shftLetter = shftLetter % 26
		val charset = this.Space_str.toUpperCase().toCharArray()
		var Space_ret = ""

		for (i<-charset) {

			if (i.toInt == 32) {
				Space_ret += " ";
			} 
			else {
				var temp_val = (i.toInt - 65 + Add_shftLetter) % 26
				if (temp_val < 0) {
					temp_val += 26
				}
				Space_ret += (temp_val + 65).toChar
			}
		}

		return Space_ret
	}

//Data Decrypt
	def decrypt_data(shftLetter: Int): String = {
		
		return encrypt_data(shftLetter * - 1)
	}
}

//Caeser Ciper
object Caesar_Ciper_Implement {

   //Main Function
	def main(args: Array[String]) {

		print("\n\t\t\t**** [Caesar Cipher] ****\n")
        print("\nEnter the secret messege: ")
        val secmessage= scala.io.StdIn.readLine()

		var caesar_obj = new Caesar_Ciper()
		caesar_obj.Space_str = secmessage

		caesar_obj.Space_str = caesar_obj.encrypt_data(4)
		println("\n\tEncrypted Messeege: " +caesar_obj.Space_str)
		caesar_obj.Space_str = caesar_obj.decrypt_data(4)
		println("\n\tDecrypted Messeege: " +caesar_obj.Space_str +"\n")
		
	}
}