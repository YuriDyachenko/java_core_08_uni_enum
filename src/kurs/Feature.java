package kurs;
/*
класс СВОЙСТВО (ОСОБЕННОСТЬ, ВОЗМОЖНОСТЬ)
для человека - это действие и сколько он может
для препятствия - оборудование и его размер
*/
public class Feature {
    private final Act act;
    private final int value;

    public Feature(Act act, int value) {
        this.act = act;
        this.value = value;
    }

    public Act getAct() {
        return act;
    }

    public int getValue() {
        return value;
    }

    //добавляем к имени действия значение
    public String getActName() {
        return String.format("%s %dм", act.getActName(), value);
    }

    //добавляет к имени оборудования значение
    public String getEquipmentName() {
        return String.format("%s %dм", act.getEquipmentName(), value);
    }
}
