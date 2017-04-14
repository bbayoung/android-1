package com.example.kyeunghyepark.plantproject;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

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

        //2. 위젯 객체(인스턴스) 생성
        //btnPlant1 = (Button)findViewById(R.id.btnPlant);
        //3. 버튼 클릭 이벤트(파라미터에 클래스넣음. 내부클래스)
        //이벤트 소스, 이벤트 리스너(이벤트 일어나는지 감시), 이벤트 핸들러(이벤트 일어나면 무슨일 할지)
        //btnPlant1.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View v) {

           // }
      //  });
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
