
package com.example.daisy.fragment

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.daisy.databinding.ItemGestureRecognizerResultBinding
import com.google.mediapipe.tasks.components.containers.Category
import java.util.Locale
import kotlin.math.min

class GestureRecognizerResultsAdapter(private val textView: TextView) {
    companion object {
        private const val NO_VALUE = "--"
    }

    // Appends new results to the TextView as a continuous sentence
    fun updateResults(categories: List<com.google.mediapipe.tasks.components.containers.Category>?) {
        categories?.let {
            // Create a sentence from the category names
            val resultsText = it.joinToString(separator = " ") { category ->
                category.categoryName() ?: NO_VALUE
            }

            // Append the new sentence to the existing TextView text
            textView.append("$resultsText. ") // Adds a period at the end of the sentence
        }
    }
}

