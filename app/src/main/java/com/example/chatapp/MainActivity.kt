package com.example.chatapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.telephony.SmsManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example code to send an SMS
        val phoneNumber = "1234567890"
        val message = "Hello, this is a test SMS!"

        try {
            val smsManager: SmsManager = SmsManager.getDefault()
            smsManager.sendTextMessage(phoneNumber, null, message, null, null)
            Toast.makeText(applicationContext, "SMS sent.", Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            Toast.makeText(applicationContext, "SMS failed, please try again.", Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }
}
