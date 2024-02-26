import chapterEight.GeoPoliticalZone;

public class GeoPoliticalZone1 {
    public  GeoPoliticalZone displayStates(String states){
        for(GeoPoliticalZone geoPoliticalZone: GeoPoliticalZone.values()){
            GeoPoliticalZone zone = findGeoPoliticalZone(states, geoPoliticalZone);
            if(zone != null) return geoPoliticalZone;
        }
        return null;
    }

    private  GeoPoliticalZone findGeoPoliticalZone(String states, GeoPoliticalZone geoPoliticalZone) {
        String[] zone = geoPoliticalZone.getStates();
        for(String f: zone){
            if(f.equalsIgnoreCase(states)) return geoPoliticalZone;
        }
        return null;
    }

}
