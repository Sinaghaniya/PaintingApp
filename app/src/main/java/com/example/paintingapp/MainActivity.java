package com.example.paintingapp;

import static com.example.paintingapp.display.colorList;
import static com.example.paintingapp.display.current_brush;
import static com.example.paintingapp.display.pathList;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redColor(View view) {
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());

    }

    public void pencil(View view) {

        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void eraser(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }

    public void yellowcolor(View view) {
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }

    public void greencolor(View view) {
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }
    public void bluecolor(View view) {
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }
    public void currentColor(int c){
        current_brush = c;
        path = new Path();
    }


}