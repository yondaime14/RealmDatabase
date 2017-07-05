package com.carllewis14.realmdatabase.Database;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Configuration of Realm Database
 */

public class DatabaseConfiguration extends Application{

    @Override
    public void onCreate() {

        super.onCreate();

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}
