package com.az.mvpbase.basic;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.az.mvpbase.mvp.IActivity;
import com.az.mvpbase.mvp.IView;

/**
 * 应用的Activity基类.
 * 这个类不是必须的!
 * 对于具有包含需要Presenter的Fragment的Activity只需要实现{@link IActivity}
 * 如果只有该Activity需要Presenter,只需要实现{@link IView}
 *
 * @param <A> 应用的Application.这里不知道具体类型
 */
public abstract class MostBasicActivity<A extends Application>
        extends AppCompatActivity
        implements IView<A>, IActivity {

}
