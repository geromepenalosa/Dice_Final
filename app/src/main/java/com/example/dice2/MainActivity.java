package com.example.dice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Vibrator;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;

    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                imageViewDice = findViewById(R.id.image_view_dice);
                imageViewDice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDice();
                    }
                });
            }

            private void rollDice() {
                int randomNumber = rng.nextInt(6) + 1;

                switch (randomNumber) {
                    case 1:
                        MediaPlayer sfx= MediaPlayer.create(MainActivity.this,R.raw.sfx);
                        sfx.start();
                        imageViewDice.setEnabled(false);

                        Timer buttonTimer = new Timer();
                        buttonTimer.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        imageViewDice.setEnabled(true);
                                    }
                                });
                            }
                        }, 2000);
                        imageViewDice.setImageResource(R.drawable.germdiceani1);
                        Toast.makeText(MainActivity.this, "You got 1", Toast.LENGTH_LONG).show();
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        v.vibrate(500); // 5000 miliseconds = 5 seconds
                        break;
                    case 2:
                        MediaPlayer sfx2= MediaPlayer.create(MainActivity.this,R.raw.sfx);
                        sfx2.start();
                        imageViewDice.setEnabled(false);

                        Timer buttonTimer2 = new Timer();
                        buttonTimer2.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        imageViewDice.setEnabled(true);
                                    }
                                });
                            }
                        }, 2000);
                        imageViewDice.setImageResource(R.drawable.germdiceani2);
                        Toast.makeText(MainActivity.this, "You got 2", Toast.LENGTH_LONG).show();
                        Vibrator a = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        a.vibrate(500); // 5000 miliseconds = 5 seconds
                        break;
                    case 3:
                        MediaPlayer sfx3= MediaPlayer.create(MainActivity.this,R.raw.sfx);
                        sfx3.start();
                        imageViewDice.setEnabled(false);

                        Timer buttonTimer3 = new Timer();
                        buttonTimer3.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        imageViewDice.setEnabled(true);
                                    }
                                });
                            }
                        }, 2000);
                        imageViewDice.setImageResource(R.drawable.germdiceani3);
                        Toast.makeText(MainActivity.this, "You got 3", Toast.LENGTH_LONG).show();
                        Vibrator b = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        b.vibrate(500); // 5000 miliseconds = 5 seconds
                        break;
                    case 4:
                        MediaPlayer sfx4= MediaPlayer.create(MainActivity.this,R.raw.sfx);
                        sfx4.start();
                        imageViewDice.setEnabled(false);

                        Timer buttonTimer4 = new Timer();
                        buttonTimer4.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        imageViewDice.setEnabled(true);
                                    }
                                });
                            }
                        }, 2000);
                        imageViewDice.setImageResource(R.drawable.germdiceani4);
                        Toast.makeText(MainActivity.this, "You got 4", Toast.LENGTH_LONG).show();
                        Vibrator e = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        e.vibrate(500); // 5000 miliseconds = 5 seconds
                        break;
                    case 5:
                        MediaPlayer sfx5= MediaPlayer.create(MainActivity.this,R.raw.sfx);
                        sfx5.start();
                        imageViewDice.setEnabled(false);

                        Timer buttonTimer5 = new Timer();
                        buttonTimer5.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        imageViewDice.setEnabled(true);
                                    }
                                });
                            }
                        }, 2000);
                        imageViewDice.setImageResource(R.drawable.germdiceani5);

                        Vibrator c = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        c.vibrate(500); // 5000 miliseconds = 5 seconds
                        Toast.makeText(MainActivity.this, "You got 5", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        MediaPlayer sfx6= MediaPlayer.create(MainActivity.this,R.raw.sfx);
                        sfx6.start();

                        imageViewDice.setEnabled(false);

                        Timer buttonTimer6 = new Timer();
                        buttonTimer6.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        imageViewDice.setEnabled(true);
                                    }
                                });
                            }
                        }, 2000);
                        imageViewDice.setImageResource(R.drawable.germdiceani6);
                        Toast.makeText(MainActivity.this, "You got 6", Toast.LENGTH_LONG).show();
                        Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        d.vibrate(500); // 5000 miliseconds = 5 seconds
                        break;
                }

    }



        }


