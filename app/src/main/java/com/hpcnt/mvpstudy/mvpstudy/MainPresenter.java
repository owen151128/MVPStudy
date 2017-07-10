package com.hpcnt.mvpstudy.mvpstudy;

/**
 * Created by 0wen151128 on 2017. 7. 10..
 */

public interface MainPresenter {

    void setView(View view);

    void onConfirm();

    interface View {
        void setConfirmText(String text);
    }
}
