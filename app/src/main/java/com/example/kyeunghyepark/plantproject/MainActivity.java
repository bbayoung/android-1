package com.example.kyeunghyepark.plantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
//import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Kyeunghye Park on 2017-04-12.
 */



// 1. 위젯 선언(멤버 변수)
// 2. findViewById(리소스 아이디)로 불러옴
// 3. 이벤트(버튼클릭 이벤트)

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    //툴바 선언
    private Toolbar toolbar;

    //ListView 선언
    ListView list;
    String[] pots = {"율마1","율마2","수국1"};

    //화면 생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면 레이아웃 파일 지정
        setContentView(R.layout.activity_main);

        //툴바 리소스 가져옴
        toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        list = (ListView) findViewById(R.id.potList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView,pots);

        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        MainActivity.this.startActivity(detailIntent);
    }
}