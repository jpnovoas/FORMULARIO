package com.example.formulario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DeveloperBD extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="developerbd";
    private static final int VERSION_BD=1;
    private static final String TABLA_CURSO="CREATE TABLE CURSOS (ID TEXT PRIMARY KEY, ASIGNATURA TEXT, CARRERA TEXT)";

    public DeveloperBD(Context context) {
        super(context, NOMBRE_BD, null , VERSION_BD);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_CURSO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_CURSO);
        sqLiteDatabase.execSQL(TABLA_CURSO);
    }

    public void agregarCursos (String id, String asignatura, String carrera ){
        SQLiteDatabase bd=getWritableDatabase();
        if (bd!=null){
            bd.execSQL("INSERT INTO CURSOS VALUES('"+id+"' , '"+asignatura+"' , '"+carrera+"')");
            bd.close();



        }
    }
}
