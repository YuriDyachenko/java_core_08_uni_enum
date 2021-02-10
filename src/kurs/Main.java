package kurs;
/*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь
бегать и прыгать (методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
не смог пробежать и т.д.).
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/
public class Main {

    public static void main(String[] args) {

        Participle[] members = new Participle[3];

        members[0] = new Man("Сергей", new Feature[]{
                new Feature(Act.RUN, 300),
                new Feature(Act.JUMP, 2)
            });
        members[1] = new Cat("Барсик", new Feature[]{
                new Feature(Act.RUN, 100),
                new Feature(Act.JUMP, 1)
            });
        members[2] = new Robot("c3pO", new Feature[]{
                new Feature(Act.RUN, 100)
            });

        Obstructive[] barriers = new Obstructive[4];

        barriers[0] = new Tredline(50);
        barriers[1] = new Wall(1);
        barriers[2] = new Tredline(200);
        barriers[3] = new Wall(2);

        Competition competition = new Competition(members, barriers);
        competition.hold();
    }
}
