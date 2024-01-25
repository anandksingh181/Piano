package com.example.piano


import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.key1).setOnClickListener {
            playMusic("note1")
        }

        findViewById<Button>(R.id.key2).setOnClickListener {
            playMusic("note2")
        }

        findViewById<Button>(R.id.key3).setOnClickListener {
            playMusic("note3")
        }

        findViewById<Button>(R.id.key4).setOnClickListener {
            playMusic("note4")
        }

        findViewById<Button>(R.id.key5).setOnClickListener {
            playMusic("note5")
        }

        findViewById<Button>(R.id.key6).setOnClickListener {
            playMusic("note6")
        }

        findViewById<Button>(R.id.key7).setOnClickListener {
            playMusic("note7")
        }
    }

    private fun playMusic(fileName: String) {
        mediaPlayer?.release()
        val resId = resources.getIdentifier(fileName, "raw", packageName)
        mediaPlayer = MediaPlayer.create(this, resId)
        mediaPlayer?.start()
    }

//    private fun playMusic(fileName: String) {
//        mediaPlayer?.release()
//        val resId = resources.getIdentifier(fileName, "raw", packageName)
//
//        if (resId != 0) {
//            mediaPlayer = MediaPlayer.create(this, resId)
//            mediaPlayer?.start()
//        } else {
//            Log.e("MediaPlayer", "Resource ID not found for file: $fileName")
//
//            // You can also show a Toast message to inform the user
//            Toast.makeText(this, "Error: File not found", Toast.LENGTH_SHORT).show()
//        }
//    }
}


