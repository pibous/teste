package lodging.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private long idItem;
    private String nameItem;
    private int quantity;
    private String itemDescription;
    private Float entryValue;
    private Float outValue;

    public Item(String nameItem, int quantity, String itemDescription, Float entryValue, Float outValue) {
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.itemDescription = itemDescription;
        this.entryValue = entryValue;
        this.outValue = outValue;
    }

    public Item() {
    }

    public long getIdItem() {
        return idItem;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }

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
