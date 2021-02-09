package kurs;
/*
СОРЕВНОВАНИЕ
отдельный класс, чтобы не дублировать одинаковый большой код в участниках
провести: все участники в цикле преодолевают все барьеры
лимит участника: поиск для конкретного участника по заданному действию
имя участника: формирование имени с перечислением всех возможностей
*/
public class Competition {
    private final Participle[] members;
    private final Obstructive[] barriers;

    public Competition(Participle[] members, Obstructive[] barriers) {
        this.members = members;
        this.barriers = barriers;
    }

    public void hold() {
        //все участники
        for (Participle member: members) {
            System.out.println(memberName(member));
            //все препятствия
            for (Obstructive barrier: barriers) {
                String barrierName = "  " + barrier.toString() + ": ";
                //если участник и не заявлен, то можно и не посылать его на состязание
                double limit = memberLimit(member, barrier.getFeature().getAct());
                if (limit == -1) {
                    System.out.printf("%s: пропускает\n", barrierName);
                    continue;
                }
                //преодолевает
                Feature feature = barrier.getFeature();
                if (!member.overcome(barrierName, feature.getAct(), feature.getValue(), limit)) {
                    System.out.println("      выбыл из соревнований");
                    break;
                }
            }
        }
    }

    public double memberLimit(Participle participle, Act act) {
        Feature[] abilities = participle.getFeatures();
        for (Feature feature : abilities) {
            if (feature.getAct() == act) {
                return feature.getValue();
            }
        }
        //-1 означает, что не заявлена возможность такого действия/умения
        return -1;
    }

    public String memberName(Participle participle) {
        String name = participle.toString() + ": ";
        Feature[] features = participle.getFeatures();
        if (features.length == 0) {
            return name + "совсем без умений";
        }
        StringBuilder sb = new StringBuilder();
        for (Feature feature : features) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(feature.getActName());
        }
        return name + sb.toString();
    }
}
