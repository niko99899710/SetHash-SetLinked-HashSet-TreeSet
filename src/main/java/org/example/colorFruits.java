package org.example;

import java.util.Objects;

public class colorFruits {
    String nameFruits;
    String colorFruits;

    public colorFruits(String nameFruits, String colorFruits) {
        this.nameFruits = nameFruits;
        this.colorFruits = colorFruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        colorFruits that = (colorFruits) o;
        return Objects.equals(nameFruits, that.nameFruits) && Objects.equals(colorFruits, that.colorFruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFruits, colorFruits);
    }

    @Override
    public String toString() {
        return "colorFruits{" +
                "nameFruits='" + nameFruits + '\'' +
                ", fruits='" + colorFruits + '\'' +
                '}';
    }
}
