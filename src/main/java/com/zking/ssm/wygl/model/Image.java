package com.zking.ssm.wygl.model;

public class Image {
    private Integer imageId;

    private String imageFile;

    private Integer imageHouseId;

    private Integer imageStatus;

    public Image(Integer imageId, String imageFile, Integer imageHouseId, Integer imageStatus) {
        this.imageId = imageId;
        this.imageFile = imageFile;
        this.imageHouseId = imageHouseId;
        this.imageStatus = imageStatus;
    }

    public Image() {
        super();
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public Integer getImageHouseId() {
        return imageHouseId;
    }

    public void setImageHouseId(Integer imageHouseId) {
        this.imageHouseId = imageHouseId;
    }

    public Integer getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(Integer imageStatus) {
        this.imageStatus = imageStatus;
    }
}