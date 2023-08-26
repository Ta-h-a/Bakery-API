package com.tahasindoli.cakes;

import java.util.List;
import java.util.Objects;

public class Cake {
    private Integer id;
    private String name;
    private String category;
    private String description;
    private List<String> ingredients;

    public Cake(Integer id, String name, String category, String description, List<String> ingredients) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.ingredients = ingredients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return Objects.equals(id, cake.id) && Objects.equals(name, cake.name) && Objects.equals(category, cake.category) && Objects.equals(description, cake.description) && Objects.equals(ingredients, cake.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, description, ingredients);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
