package com.example.android.miwok.Models;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.Fragments.ColorsFragment;
import com.example.android.miwok.Fragments.FamilyFragment;
import com.example.android.miwok.Fragments.NumbersFragment;
import com.example.android.miwok.Fragments.PhrasesFragment;
import com.example.android.miwok.R;

/**
 * Created by ramonsl on 29/04/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new NumbersFragment();
            }
            case 1:{
                return new FamilyFragment();
            }
            case 2:{
                return new ColorsFragment();
            }
            default:{
                return new PhrasesFragment();

            }
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:{
                return mContext.getString(R.string.category_numbers);
            }
            case 1:{
                return mContext.getString(R.string.category_family);
            }
            case 2:{
                return mContext.getString(R.string.category_colors);
            }
            default:{
                return mContext.getString(R.string.category_phrases);

            }
        }
    }
}
