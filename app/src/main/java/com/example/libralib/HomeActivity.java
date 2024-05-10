package com.example.libralib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarTitle = toolbar.findViewById(R.id.toolbar_title);
        String dynamicString = "Home";
        toolbarTitle.setText(dynamicString);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);


        CardView exit = findViewById(R.id.cardLogOut);
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Clear the shared preferences for log out
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });

        CardView addBook = findViewById(R.id.cardAddBook);
        addBook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, AddBookActivity.class));
            }
        });

        CardView registerMember = findViewById(R.id.cardRegisterMember);
        registerMember.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, RegisterMemberActivity.class));
            }
        });

        CardView searchBook = findViewById(R.id.cardSearchBook);
        searchBook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, SearchBookActivity.class));
            }
        });

        CardView searchMember = findViewById(R.id.cardSearchMember);
        searchMember.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, SearchMemberActivity.class));
            }
        });

        CardView loanBook = findViewById(R.id.cardBookLoan);
        loanBook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, BookLoanActivity.class));
            }
        });

        CardView returnBook = findViewById(R.id.cardReleaseBook);
        returnBook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(HomeActivity.this, ReleaseBookActivity.class));
            }
        });
    }
}