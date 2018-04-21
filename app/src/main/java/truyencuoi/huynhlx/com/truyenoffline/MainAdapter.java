package truyencuoi.huynhlx.com.truyenoffline;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import truyencuoi.huynhlx.com.truyenoffline.favourite.FavouriteFragment;
import truyencuoi.huynhlx.com.truyenoffline.topic.TopicFragment;

public class MainAdapter extends FragmentPagerAdapter{
    public MainAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if ( position == 0) {
            return new TopicFragment();
        }else {
            return new FavouriteFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if ( position == 0) {
            return "Topic";
        }else {
            return "Favourite";
        }
    }
}
