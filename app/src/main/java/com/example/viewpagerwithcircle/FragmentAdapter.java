package com.example.viewpagerwithcircle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull  FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return FragmentA.newInstance();
            case 1:
                return FragmentB.newInstance();
            case 2:
                return FragmentC.newInstance();
            case 3:
                return FragmentD.newInstance();
        }
        return FragmentA.newInstance();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
