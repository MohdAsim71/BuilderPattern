package com.example.builderpattern

class User private constructor(
    val name:String,
    val id:Int,
    val email:String,
    val phoneNumber:Int
){

    class Builder(private val name: String, private val id: Int){
        private var email:String?= null
        private var phone:Int?= null

        fun email(email: String):Builder{
            return apply {
                this.email = email
            }
        }

        fun phone(phone: Int):Builder{
            return apply {
                this.phone = phone
            }
        }

        fun build():User
        {
            return User(name,id, email!!, phone!!)
        }
    }
}


fun main() {
    val user = User.Builder("user1",1).email("user1@gmail.com").phone(111111).build()

    println(user.email)
    println(user.id)
    println(user.email)
    println(user.phoneNumber)
}








