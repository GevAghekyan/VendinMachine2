package com.company;

import com.company.types.CategoryType;
import com.company.types.ProductType;

public class Command {

    private CategoryType categoryType;
    private ProductType productType;
    private int quantity;

    public Command() {
    }

    public Command(CategoryType categoryType, ProductType productType, int quantity) {
        this.categoryType = categoryType;
        this.productType = productType;
        this.quantity = quantity;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Command command = (Command) o;

        if (quantity != command.quantity) return false;
        if (categoryType != command.categoryType) return false;
        return productType == command.productType;
    }

    @Override
    public int hashCode() {
        int result = categoryType != null ? categoryType.hashCode() : 0;
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return "Command{" +
                "categoryType=" + categoryType +
                ", productType=" + productType +
                ", quantity=" + quantity +
                '}';
    }
}
