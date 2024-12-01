package com.example.daisy

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentTransaction
import com.example.daisy.R
import com.example.daisy.fragment.CameraFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard) // Set the content view to activity_dashboard.xml

        // Find the CardViews by their IDs
        val realTimeCard: CardView = findViewById(R.id.camera_fragment)
        val learnSignLanguageCard: CardView = findViewById(R.id.learn_signlanguage_card)
        val sampleQuizCard: CardView = findViewById(R.id.sample_quiz_card)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Set up click listeners for CardViews
        realTimeCard.setOnClickListener {
            // Handle the Real-Time Sign Language card click
            Toast.makeText(this, "Real-Time Sign Language clicked!", Toast.LENGTH_SHORT).show()

            // Create an intent to navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Optionally, add flags to clear the activity stack or control behavior
            // For example, to make MainActivity the only activity in the stack:
            // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)

            // Start MainActivity
            startActivity(intent)

            // Optional: If you want to close the current activity, you can do:
            // finish()
        }

        learnSignLanguageCard.setOnClickListener {
            // Handle the Learn Sign Language card click
            Toast.makeText(this, "COMING SOON!", Toast.LENGTH_SHORT).show()
            // Navigate to the Learn Sign Language Activity
            // val intent = Intent(this, LearnSignLanguageActivity::class.java)
            // startActivity(intent)
        }

        sampleQuizCard.setOnClickListener {
            // Handle the Sample Quiz card click
            Toast.makeText(this, "COMING SOON!", Toast.LENGTH_SHORT).show()
            // Navigate to the Sample Quiz Activity
            // val intent = Intent(this, SampleQuizActivity::class.java)
            // startActivity(intent)
        }

        // Set up the BottomNavigationView listener
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_settings -> {
                    Toast.makeText(this, "Settings selected!", Toast.LENGTH_SHORT).show()
                    // Navigate to Settings Activity
                    // val intent = Intent(this, SettingsActivity::class.java)
                    // startActivity(intent)
                    true
                }
                R.id.nav_messages -> {
                    Toast.makeText(this, "Messages selected!", Toast.LENGTH_SHORT).show()
                    // Navigate to Messages Activity
                    // val intent = Intent(this, MessagesActivity::class.java)
                    // startActivity(intent)
                    true
                }
                R.id.nav_user -> {
                    Toast.makeText(this, "User selected!", Toast.LENGTH_SHORT).show()
                    // Navigate to User Profile Activity
                    // val intent = Intent(this, UserProfileActivity::class.java)
                    // startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
