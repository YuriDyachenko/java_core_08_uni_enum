package kurs;
/*
БЕГОВАЯ ДОРОЖКА, реализует ПРЕПЯТСТВИЕ
код с остальными препятствиями полностью идентичен, но в задаче сказано
создать отдельные классы для препятствий
*/
public class Tredline implements Obstructive {
    private final Feature feature;

    public Tredline(Act act, double value) {
        this.feature = new Feature(act, value);
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
