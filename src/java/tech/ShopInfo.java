package tech;

import tech.util.Contact;

/**
 * Describes shop contact information 
 * @author paul
 */
public class ShopInfo {

    public ShopInfo() {
    }

    public ShopInfo(Integer shopId, String description) {
        this.shopId = shopId;
        this.description = description;
    }
    
    private Integer shopId;
    private Contact contact;
    private String description;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ShopInfo{" + "shopId=" + shopId + ", description=" + description + '}';
    }
}
