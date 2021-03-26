package com.company.products;

import com.company.types.CategoryType;

public abstract class Product {

    private CategoryType categoryType;
    private String name;

    public Product() {
    }

    public Product(CategoryType categoryType, String name) {
        this.categoryType = categoryType;
        this.name = name;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (categoryType != product.categoryType) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = categoryType != null ? categoryType.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType=" + categoryType +
                ", name='" + name + '\'' +
                '}';
    }
}
