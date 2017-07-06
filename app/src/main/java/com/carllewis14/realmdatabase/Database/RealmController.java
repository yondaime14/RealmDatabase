package com.carllewis14.realmdatabase.Database;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;


import com.carllewis14.realmdatabase.Model.Book;

import io.realm.Realm;

/**
 * Realm methods for app defined here
 */

public class RealmController {

    private static RealmController realmController;
    private final Realm realm;


    public RealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {
        if (realmController == null) {
            realmController = new RealmController(fragment.getActivity().getApplication());
        }
        return realmController;
    }

    public static RealmController with(Application application) {
        if (realmController == null) {
            realmController = new RealmController(application);
        }

        return realmController;
    }

    public static RealmController with(Activity activity) {

        if (realmController == null) {
            realmController = new RealmController(activity.getApplication());
        }

        return realmController;
    }

    public static RealmController getRealmController() {

        return realmController;
    }

    public Realm getRealm(){

        return realm;
    }


    //Refresh realm instance
    public void refreshRealm(){

        realm.refresh();
    }

    //clears all objects from Book Class
    public void clearAllBooks(){

        realm.beginTransaction();
        realm.clear(Book.class);
        realm.commitTransaction();
    }




}
