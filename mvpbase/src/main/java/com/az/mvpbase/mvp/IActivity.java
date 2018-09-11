package com.az.mvpbase.mvp;

/**
 * Activity需要实现的接口.
 * Application通过这个类型判断Activity是否有需要被监听生命周期的Fragment.
 */
public interface IActivity{

    /**
     * Activity内部是否有需要被监听生命周期的fragment
     * @return return
     */
    boolean hasFragment();

}
