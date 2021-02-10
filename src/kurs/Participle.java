package kurs;
/*
интерфейс УЧАСТНИК
должен ументь вернуть свои возможности/способности
и преодолеть препятствие с заданным именем, действием, размером и своим пределом
предел передается извне, чтобы в каждом классе участника не дублировать код поиска в массиве возможностей
*/
public interface Participle {
    Feature[] getFeatures();
    boolean overcome(String equipmentName, Act act, int size, int limit);
}
