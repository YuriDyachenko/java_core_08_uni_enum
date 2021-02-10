package kurs;
/*
класс РОБОТ, реализует УЧАСТНИКА
код одинаковый "до одного слова" с другими участниками, но в задании сказано - разные классы для участников
там же сказано, что должны уметь бегать и прыгать, выводя информацию в консоль, поэтому добавлен
метод преодолеть, который можно было бы полностью перенести в СОРЕВНОВАНИЕ
*/
public class Robot implements Participle {
    private final String name;
    private final Feature[] features;

    public Robot(String name, Feature[] features) {
        this.name = name;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Робот " + name;
    }

    @Override
    public Feature[] getFeatures() {
        return features;
    }

    @Override
    public boolean overcome(String equipmentName, Act act, int size, int limit) {
        if (size > limit) {
            System.out.printf("%s%s %dм\n", equipmentName, act.getNotDoneName(), size - limit);
            return false;
        }
        System.out.printf("%s%s\n", equipmentName, act.getDoneName());
        return true;
    }
}
