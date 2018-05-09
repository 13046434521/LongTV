package com.t.longtv.detail.Main;

import com.t.longtv.base.BasePresenter;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:52
 * 描述：Home P层
 */
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    public HomePresenter(HomeContract.View view) {
        super(view);
    }

    @Override
    public void start() {

    }

    @Override
    public void selectFragment(int position){
        switch (position){
            case 0:
                getView().replaceFragment("Home");
                break;
            case 1:
                getView().replaceFragment("Match");
                break;
            case 2:
                getView().replaceFragment("Entertain");
                break;
            case 3:
                getView().replaceFragment("Park");
                break;
            case 4:
                getView().replaceFragment("Mine");
                break;
        }
    }
}
