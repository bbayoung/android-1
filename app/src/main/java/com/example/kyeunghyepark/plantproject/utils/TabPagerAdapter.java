package com.example.kyeunghyepark.plantproject.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.kyeunghyepark.plantproject.DetailHumidityFragment;
import com.example.kyeunghyepark.plantproject.DetailLightFragment;
import com.example.kyeunghyepark.plantproject.DetailMoistureFragment;
import com.example.kyeunghyepark.plantproject.DetailSummaryFragment;
import com.example.kyeunghyepark.plantproject.DetailTemperatureFragment;

/**
 * Created by Park on 2017. 4. 16..
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    final private int tabCount;
    final private int plantId;

    public TabPagerAdapter(FragmentManager fm, int tabCount, int plantId) {
        super(fm);
        this.tabCount = tabCount;
        this.plantId = plantId;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return DetailSummaryFragment.newInstance(plantId);
            case 1:
                return DetailMoistureFragment.newInstance(plantId);
            case 2:
                return DetailTemperatureFragment.newInstance(plantId);
            case 3:
                return DetailHumidityFragment.newInstance(plantId);
            case 4:
                return DetailLightFragment.newInstance(plantId);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
