package com.example.bhatt.dopecards;

import android.support.v4.view.PagerAdapter;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by bhatt on 10-05-2018.
 */

public class VerticalPagerAdapter extends PagerAdapter {

    String mResources[] = {"To start off lets understand what exactly Android CardView is? Its a new widget for Android, which can be used to display a card sort of a layout in android. As you may know Android material design is inspired from paper and ink concept. Mostly it displays views on top of each other, with shadows. In simple terms, Android CardView is such a view which has all material design properties, most importantly showing shadows according the elevation. The best part about this view is that it extends FrameLayout and it can be displayed on all the platforms of android since it’s available through the Support v7 library. Lets have a look at some of its properties:","To start off lets understand what exactly Android CardView is? Its a new widget for Android, which can be used to display a card sort of a layout in android. As you may know Android material design is inspired from paper and ink concept. Mostly it displays views on top of each other, with shadows. In simple terms, Android CardView is such a view which has all material design properties, most importantly showing shadows according the elevation. The best part about this view is that it extends FrameLayout and it can be displayed on all the platforms of android since it’s available through the Support v7 library. Lets have a look at some of its properties:"};

    Context mContext;
    LayoutInflater mLayoutInflater;

    public VerticalPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.vertical_card_main, container, false);

        TextView label = (TextView) itemView.findViewById(R.id.textViewVertical);
        label.setText(mResources[position]);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}



