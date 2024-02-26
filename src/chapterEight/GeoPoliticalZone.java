package chapterEight;

public enum GeoPoliticalZone {
    NORTHEAST("Adamawa", "Yobe", "Borno","Bauchi", "Gombe", "Taraba","Jigawa"),
    NORTHWEST("Kebbi", "Sokoto", "Kano", "Kastina","Kaduna","Zamfara"),
    NORTHCENTRAL("Plateau", "Kwara", "Benue", "Niger", "Nasarawa", "FCT"),
    SOUTHWEST("Lagos", "Ondo", "Osun", "Oyo", "Ogun", "Ekiti"),
    SOUTHEAST( "Abia", "Anambra", "Ebonyi","Enugu", "Imo"),
    SOUTHSOUTH("Bayelsa", "Edo", "Cross-River", "Delta", "River", "Akwa-Ibon");

    private String[] states;


    GeoPoliticalZone(String... states) {
        this.states = states;
    }
    public String[] getStates(){
        return states;
    }

}
