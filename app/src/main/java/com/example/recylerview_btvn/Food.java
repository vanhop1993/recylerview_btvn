package com.example.recylerview_btvn;

public class Food {
    private int image;
    private String foodName;
    private String address;
    private String discount;
    private String promotion;

    public Food(int image,String foodName, String address, String discount, String promotion) {
        this.image =image;
        this.foodName = foodName;
        this.address = address;
        this.discount = discount;
        this.promotion = promotion;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
}
