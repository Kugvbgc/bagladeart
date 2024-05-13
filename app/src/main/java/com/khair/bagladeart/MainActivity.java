package com.khair.bagladeart;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bangladate.androidlibrarybyfoysaltech.BanglaDateUtils;

public class MainActivity extends AppCompatActivity {

    TextView BanglaTimeTv, BanglaDateTv, EnglishDateTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BanglaTimeTv = findViewById(R.id.BanglaTimeTv);
        BanglaDateTv = findViewById(R.id.BanglaDateTv);
        EnglishDateTv = findViewById(R.id.EnglishDateTv);


        String banglaFullDate = BanglaDateUtils.getBanglafullDate();
        String WeekDay = BanglaDateUtils.getWeekDay();
        String banglaDay = BanglaDateUtils.getBanglaDay();
        String banglaMonth = BanglaDateUtils.getBanglaMonth();
        String banglaSeason = BanglaDateUtils.getBanglaSeason();
        String englishDate = BanglaDateUtils.getEnglishDate();

        BanglaDateTv.setText(banglaFullDate + " | " + banglaSeason);
        BanglaDateUtils.startUpdatingTime(BanglaTimeTv, false, true);
        EnglishDateTv.setText(englishDate);


    }
}