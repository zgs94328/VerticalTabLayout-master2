package q.rorbin.verticaltablayout.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;


import java.util.List;

/**
 * Created by mcy on 2017/7/6.
 * 描述:
 */

public class TabViewpager extends FragmentPagerAdapter {


    private Context context;
    private List<String> titles;
    private List<Fragment> fragmentList;

    public TabViewpager(FragmentManager fm, Context context, List<String> titles, List<Fragment> fragmentList) {
        super(fm);
        this.context = context;
        this.titles = titles;
        this.fragmentList = fragmentList;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

}
