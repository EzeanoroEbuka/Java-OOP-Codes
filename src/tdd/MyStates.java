package tdd;

public class MyStates {

    public GeoPoliticalZone checkStateInZone(String state){
        for(GeoPoliticalZone zone : GeoPoliticalZone.values()){
            boolean stateFound = getStateInZone(zone, state);
            if(stateFound){
                return zone;
            }
        }
        return null;
    }

    private  boolean getStateInZone(GeoPoliticalZone zone , String state) {
        String[] listOfStates = zone.getStates();
        for (String eachState : listOfStates) {
            if (eachState.equalsIgnoreCase(state)) return true;
        }
        return false;
    }

    public String[] getAllStatesInZones(String myZone){
        GeoPoliticalZone zone = GeoPoliticalZone.valueOf(myZone.toUpperCase());
        for(GeoPoliticalZone eachZone : GeoPoliticalZone.values()){
            if(eachZone.equals(zone)){
                return zone.getStates();
            }
        }
        return null;

    }

}
 