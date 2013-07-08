package tech;

/**
 *
 * @author paul
 */
public enum ItemType {

    DRINKS("drinks", "A liquid that is fit for drinking; a beverage"),
    FOOD("food", " Material, usually of plant or animal origin, that contains or consists of essential body nutrients, such as carbohydrates, fats, proteins, vitamins, or minerals, and is ingested and assimilated by an organism to produce energy, stimulate growth, and maintain life"),
    SERVICES("service", "");
    
    
    private String title;
    private String description;

    private ItemType() {
    }

    private ItemType(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
