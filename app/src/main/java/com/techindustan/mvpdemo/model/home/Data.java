package com.techindustan.mvpdemo.model.home;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Awesome Pojo Generator
 * */
public class Data implements Parcelable {
    @SerializedName("profile_image")
    @Expose
    private String profile_image;
    @SerializedName("images")
    @Expose
    private List<String> images;
    @SerializedName("favs_count")
    @Expose
    private Integer favs_count;
    @SerializedName("comments_count")
    @Expose
    private Integer comments_count;
    @SerializedName("is_bookmarked")
    @Expose
    private Integer is_bookmarked;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tags")
    @Expose
    private String tags;
    public void setProfile_image(String profile_image){
        this.profile_image=profile_image;
    }
    public String getProfile_image(){
        return profile_image;
    }
    public void setImages(ArrayList<String> images){
        this.images=images;
    }
    public List<String> getImages(){
        return images;
    }
    public void setFavs_count(Integer favs_count){
        this.favs_count=favs_count;
    }
    public Integer getFavs_count(){
        return favs_count;
    }
    public void setComments_count(Integer comments_count){
        this.comments_count=comments_count;
    }
    public Integer getComments_count(){
        return comments_count;
    }
    public void setIs_bookmarked(Integer is_bookmarked){
        this.is_bookmarked=is_bookmarked;
    }
    public Integer getIs_bookmarked(){
        return is_bookmarked;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getTime(){
        return time;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setTags(String tags){
        this.tags=tags;
    }
    public String getTags(){
        return tags;
    }

    protected Data(Parcel in) {
        profile_image = in.readString();
        if (in.readByte() == 0x01) {
            images = new ArrayList<String>();
            in.readList(images, String.class.getClassLoader());
        } else {
            images = null;
        }
        favs_count = in.readByte() == 0x00 ? null : in.readInt();
        comments_count = in.readByte() == 0x00 ? null : in.readInt();
        is_bookmarked = in.readByte() == 0x00 ? null : in.readInt();
        name = in.readString();
        description = in.readString();
        time = in.readString();
        title = in.readString();
        tags = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(profile_image);
        if (images == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(images);
        }
        if (favs_count == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(favs_count);
        }
        if (comments_count == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(comments_count);
        }
        if (is_bookmarked == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(is_bookmarked);
        }
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(time);
        dest.writeString(title);
        dest.writeString(tags);
    }

    @SuppressWarnings("unused")
    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}/*{
  @SerializedName("profile_image")
  @Expose
  private String profile_image;
  @SerializedName("images")
  @Expose
  private List<String> images;
  @SerializedName("favs_count")
  @Expose
  private Integer favs_count;
  @SerializedName("comments_count")
  @Expose
  private Integer comments_count;
  @SerializedName("is_bookmarked")
  @Expose
  private Integer is_bookmarked;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("description")
  @Expose
  private String description;
  @SerializedName("time")
  @Expose
  private String time;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("tags")
  @Expose
  private String tags;
  public void setProfile_image(String profile_image){
   this.profile_image=profile_image;
  }
  public String getProfile_image(){
   return profile_image;
  }
  public void setImages(ArrayList<String> images){
   this.images=images;
  }
  public List<String> getImages(){
   return images;
  }
  public void setFavs_count(Integer favs_count){
   this.favs_count=favs_count;
  }
  public Integer getFavs_count(){
   return favs_count;
  }
  public void setComments_count(Integer comments_count){
   this.comments_count=comments_count;
  }
  public Integer getComments_count(){
   return comments_count;
  }
  public void setIs_bookmarked(Integer is_bookmarked){
   this.is_bookmarked=is_bookmarked;
  }
  public Integer getIs_bookmarked(){
   return is_bookmarked;
  }
  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setDescription(String description){
   this.description=description;
  }
  public String getDescription(){
   return description;
  }
  public void setTime(String time){
   this.time=time;
  }
  public String getTime(){
   return time;
  }
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
  public void setTags(String tags){
   this.tags=tags;
  }
  public String getTags(){
   return tags;
  }
}*/