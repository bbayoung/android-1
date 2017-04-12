package com.example.kyeunghyepark.plantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// 1. 위젯 선언(멤버 변수)
// 2. findViewById(리소스 아이디)로 불러옴
// 3. 이벤트(버튼클릭 이벤트)

public class MainActivity extends AppCompatActivity {

    //1. 위젯 변수 선언
    Button btnPlant1;

    //화면 생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면 레이아웃 파일 지정
        setContentView(R.layout.activity_main);
        //2. 위젯 객체(인스턴스) 생성
        btnPlant1 = (Button)findViewById(R.id.btnPlant);
        //3. 버튼 클릭 이벤트(파라미터에 클래스넣음. 내부클래스)
        //이벤트 소스, 이벤트 리스너(이벤트 일어나는지 감시), 이벤트 핸들러(이벤트 일어나면 무슨일 할지)
        btnPlant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                MainActivity.this.startActivity(detailIntent);
            }
        });
    }
}
