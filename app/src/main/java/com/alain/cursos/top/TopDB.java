package com.alain.cursos.top;

/* *
 * Projecto: MD Top
 *
 * Daniel Fernandez Guarneros
 *
 * 4A Desarrollo de Software Multiplataforma
 * Diseño de Apps
 */

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = TopDB.NAME, version = TopDB.VERSION)
public class TopDB {

    static final String NAME = "TopDatabase";
    static final int VERSION = 1;
}
