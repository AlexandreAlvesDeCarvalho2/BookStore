package com.example.bookstore.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookstore.R
import com.example.bookstore.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*


class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.books_title)
        setSupportActionBar(toolbarMain)

        with(recycleBooks){
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }

    }

    fun getBooks(): List<Book>{
        return listOf(
            Book("Title","Author"),
            Book("Title","Author"),
            Book("Title","Author")
        )
    }
}