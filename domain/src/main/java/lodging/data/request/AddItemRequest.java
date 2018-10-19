package lodging.data.request;

public class AddItemRequest {

    private String nameItem;
    private int quantity;
    private String itemDescription;
    private Float entryValue;
    private Float outValue;

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Float getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Float entryValue) {
        this.entryValue = entryValue;
    }

    public Float getOutValue() {
        return outValue;
    }

    public void setOutValue(Float outValue) {
        this.outValue = outValue;
    }
}
