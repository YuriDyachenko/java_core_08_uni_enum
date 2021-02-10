package kurs;
/*
класс СТЕНА, реализует ПРЕПЯТСТВИЕ
код с остальными препятствиями почти полностью идентичен, но в задаче сказано
создать отдельные классы для препятствий 
*/
public class Wall implements Obstructive {
    private final Feature feature;

    public Wall(int height) {
        this.feature = new Feature(Act.JUMP, height);
    }

    @Override
    public String toString() {
        return feature.getEquipmentName();
    }

    @Override
    public Feature getFeature() {
        return feature;
    }
}
