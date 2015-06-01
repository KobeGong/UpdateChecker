package com.rampo.updatechecker.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kobe.gong on 2015/6/1.
 */
public class UpdateEntity implements Parcelable {
    private String appId;
    private UpdateItemEntity Android;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateItemEntity getAndroid() {
        return Android;
    }

    public void setAndroid(UpdateItemEntity android) {
        Android = android;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(appId);
        parcel.writeParcelable(Android, i);
    }

    public static final Creator<UpdateEntity> CREATOR = new Creator<UpdateEntity>() {
        @Override
        public UpdateEntity createFromParcel(Parcel parcel) {
            UpdateEntity entity = new UpdateEntity();
            entity.appId = parcel.readString();
            entity.Android = parcel.readParcelable(UpdateItemEntity.class.getClassLoader());
            return entity;
        }

        @Override
        public UpdateEntity[] newArray(int i) {
            return new UpdateEntity[i];
        }
    };
}
