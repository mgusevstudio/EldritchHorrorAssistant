package ru.mgusev.eldritchhorror.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "specializations")
public class Specialization {

    public static final String SPECIALIZATION_FIELD_ID = "_id";
    public static final String SPECIALIZATION_FIELD_IMAGE_RESOURCE = "image_resource";
    public static final String SPECIALIZATION_FIELD_NAME_EN = "name_en";
    public static final String SPECIALIZATION_FIELD_NAME_RU = "name_ru";
    public static final String SPECIALIZATION_FIELD_IS_ENABLE = "is_enable";
    @PrimaryKey
    @ColumnInfo(name = SPECIALIZATION_FIELD_ID)
    private int id;

    @ColumnInfo(name = SPECIALIZATION_FIELD_IMAGE_RESOURCE)
    private String imageResource;

    @ColumnInfo(name = SPECIALIZATION_FIELD_NAME_EN)
    private String nameEN;

    @ColumnInfo(name = SPECIALIZATION_FIELD_NAME_RU)
    private String nameRU;

    @ColumnInfo(name = SPECIALIZATION_FIELD_IS_ENABLE)
    private boolean isEnable;

    public Specialization() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageResource() {
        return imageResource;
    }

    public void setImageResource(String imageResource) {
        this.imageResource = imageResource;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public String getNameRU() {
        return nameRU;
    }

    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public String getName() {
        if (Localization.getInstance().isRusLocale()) return nameRU;
        else return nameEN;
    }

    /*@Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        Specialization specialization = new Specialization();
        if (obj instanceof Specialization) specialization = (Specialization) obj;
        return specialization.id == id && specialization.isEnable == isEnable;
    }*/
}