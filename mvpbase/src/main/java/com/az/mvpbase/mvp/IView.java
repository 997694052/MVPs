package com.az.mvpbase.mvp;

import android.app.Application;

/**
 * View层接口.
 * presenter最终会获取这个类型,并通过{@link #obtainApplication()}获取Application
 * @param <A> 应用的Application
 */
public interface IView<A extends Application> {

    /**
     * 获取应用的Application
     * @return application
     */
    A obtainApplication();

}
