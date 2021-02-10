package kurs;
/*
класс БЕГОВАЯ ДОРОЖКА, реализует ПРЕПЯТСТВИЕ
код с остальными препятствиями почти полностью идентичен, но в задаче сказано
создать отдельные классы для препятствий
*/
public class Tredline implements Obstructive {
    private final Feature feature;

    public Tredline(int length) {
        this.feature = new Feature(Act.RUN, length);
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
