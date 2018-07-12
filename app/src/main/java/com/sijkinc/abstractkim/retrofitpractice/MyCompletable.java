package com.sijkinc.abstractkim.retrofitpractice;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;

public class MyCompletable extends Completable {
    CompletableObserver completableObserver;
    @Override
    protected void subscribeActual(CompletableObserver s) {
        completableObserver = s;
    }
    public void completeAction(){
        if(completableObserver != null)
            completableObserver.onComplete();
    }
}
