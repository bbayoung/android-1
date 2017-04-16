package com.example.kyeunghyepark.plantproject;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by Kyeunghye Park on 2017-04-12.
 */

public class DetailActivity extends AppCompatActivity {

    //툴바 선언
    private Toolbar toolbar;
    //1. 위젯 변수 선언
    //Button btnPlant1;

    //화면 생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면 레이아웃 파일 지정
        setContentView(R.layout.activity_detail);

        //툴바 리소스 가져옴
        toolbar= (Toolbar) findViewById(R.id.detail_bar);
        setSupportActionBar(toolbar);

        //홈으로 돌아가기 버튼
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        //if(id == R.id.action_settings){
           // return true;
       // }
        if(id==android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }


}
