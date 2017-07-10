package com.hpcnt.mvpstudy.mvpstudy;

import android.app.Activity;

/**
 * Created by 0wen151128 on 2017. 7. 10..
 */

public class MainPresenterImpl implements MainPresenter {
    private Activity activity;
    private MainModel mainModel;
    private View view;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void onConfirm() {
        if (view != null)
            view.setConfirmText(mainModel.getText());
    }
}
