package com.octoriana201103650.uts_201103650;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private ResmiFragment _resmiFragment = new ResmiFragment();
    private Context _context;
    private MoodleFragment _moodleFragment = new MoodleFragment();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _resmiFragment;
            default:
                return _moodleFragment;
        }
    }

    @Override
    public int getCount()
    {
        return _tabCount;
    }
}
