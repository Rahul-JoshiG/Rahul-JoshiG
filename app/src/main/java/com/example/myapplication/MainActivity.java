package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button playerX, playerO, startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerX = findViewById(R.id.player1);
        playerO = findViewById(R.id.player2);
        startGame = findViewById(R.id.startGame);

        String X_player = playerX.toString();
        String O_player = playerO.toString();

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent game_screen = new Intent(MainActivity.this, Game.class);
                startActivity(game_screen);

            }
        });
    }
}