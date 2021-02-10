package kurs;
/*
enum ДЕЙСТВИЕ (УМЕНИЕ/ВОЗМОЖНОСТЬ, ОБОРУДОВАНИЕ)
как тип для возможностей человека или для препятствия
содержит все "нужные слова"
*/
public enum Act {
    RUN("бег", "беговая дорожка", "пробежал", "не добежал"),
    JUMP("прыжок", "стена", "перепрыгнул", "не допрыгнул");

    private final String actName;
    private final String equipmentName;
    private final String doneName;
    private final String notDoneName;

    Act(String actName, String equipmentName, String doneName, String notDoneName) {
        this.actName = actName;
        this.equipmentName = equipmentName;
        this.doneName = doneName;
        this.notDoneName = notDoneName;
    }

    public String getActName() {
        return actName;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String getDoneName() {
        return doneName;
    }

    public String getNotDoneName() {
        return notDoneName;
    }
}
