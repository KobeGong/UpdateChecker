package com.rampo.updatechecker.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kobe.gong on 2015/6/1.
 */
public class UpdateItemEntity implements Parcelable{
    private String version;
    private String title;
    private String note;
    private String url;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(version);
        parcel.writeString(title);
        parcel.writeString(note);
        parcel.writeString(url);
    }

    public static final Creator<UpdateItemEntity> CREATOR = new Creator<UpdateItemEntity>() {
        @Override
        public UpdateItemEntity createFromParcel(Parcel parcel) {
            UpdateItemEntity entity = new UpdateItemEntity();
            entity.version = parcel.readString();
            entity.title = parcel.readString();
            entity.note = parcel.readString();
            entity.url = parcel.readString();
            return entity;
        }

        @Override
        public UpdateItemEntity[] newArray(int i) {
            return new UpdateItemEntity[i];
        }
    };
}
