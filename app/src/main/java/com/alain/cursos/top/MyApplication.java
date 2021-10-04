package com.alain.cursos.top;

/* *
 * Projecto: MD Top
 *
 * Daniel Fernandez Guarneros
 *
 * 4A Desarrollo de Software Multiplataforma
 * Diseño de Apps
 */

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FlowManager.init(this);
    }
}
