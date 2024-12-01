import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Sample Dashboard Items
        val dashboardItems = listOf(
            DashboardItem("Sign Translator", R.drawable.ic_sign_language),
            DashboardItem("Settings", R.drawable.ic_settings)
        )

        // Setup RecyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = DashboardAdapter(dashboardItems) { item ->
            when (item.title) {
                "Sign Translator" -> startActivity(Intent(this, SignTranslatorActivity::class.java))
                "Settings" -> startActivity(Intent(this, SettingsActivity::class.java))
            }
        }
    }
}
