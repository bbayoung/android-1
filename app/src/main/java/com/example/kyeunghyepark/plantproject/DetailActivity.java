package com.example.kyeunghyepark.plantproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.kyeunghyepark.plantproject.utils.TabPagerAdapter;

/**
 * Created by Kyeunghye Park on 2017-04-12.
 */

public class DetailActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView tvName, tvType, tvLocation, tvState;

    private int plantId;
    private String plantName;
    private String[] tabNames = {"요약", "수분", "온도", "습도", "빛"};

    //화면 생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면 레이아웃 파일 지정
        setContentView(R.layout.activity_detail);

        // intent 가져 옴
        plantId = getIntent().getIntExtra("plantId", 0);
        plantName = getIntent().getStringExtra("plantName");

        // XML 리소스 가져옴
        toolbar = (Toolbar) findViewById(R.id.detail_bar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.pager);
        tvName = (TextView) findViewById(R.id.tvName);
        tvType = (TextView) findViewById(R.id.tvType);
        tvLocation = (TextView) findViewById(R.id.tvLocation);
        tvState = (TextView) findViewById(R.id.tvState);

        // 툴바 셋팅
        setSupportActionBar(toolbar);
        setTitle(plantName);

        // Initializing the TabLayout
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorBlack));
        for(String name: tabNames) {
            tabLayout.addTab(tabLayout.newTab().setText(name));
        }

        // Creating TabPagerAdapter adapter
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), plantId);
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Set TabSelectedListener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        // view settings
        tvName.setText("이름 : " + plantName);

        //홈으로 돌아가기 버튼
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id==android.R.id.home){
            finish();
        }

        return true;
    }
}
