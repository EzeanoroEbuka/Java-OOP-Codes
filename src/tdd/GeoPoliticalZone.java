package tdd;

public enum GeoPoliticalZone {
    NORTHCENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Katsina", "kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private String[] states;

    GeoPoliticalZone(String... states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }
}