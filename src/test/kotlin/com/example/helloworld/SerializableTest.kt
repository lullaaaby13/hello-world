package com.example.helloworld

import org.junit.jupiter.api.Test
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable

class SerializableTest {

    @Test
    fun name() {

        // val user = User("admin", "1234")
        //
        // val fos = FileOutputStream("user-serialize")
        // val bos = BufferedOutputStream(fos)
        // val oos = ObjectOutputStream(bos)
        // oos.writeObject(user)
        // oos.close()

        val fis = FileInputStream("user-serialize")
        val bis = BufferedInputStream(fis)
        val ois = ObjectInputStream(bis)
        val read = ois.readObject() as User
        println(read)
    }
}

data class User(
    val id: String,
    val password: String,
    val age: Int,
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 1L
    }
}
