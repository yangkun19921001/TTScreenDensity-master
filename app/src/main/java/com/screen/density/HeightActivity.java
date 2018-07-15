package com.screen.density;

import com.screen.density.utils.AppUtils;
import com.screen.density.utils.Density;


public class HeightActivity extends BaseActivity {

    @Override
    public void setOrientation() {
        Density.setOrientation(mActivity, AppUtils.HEIGHT);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_height;
    }

    @Override
    protected void initEvent() {

    }
}
