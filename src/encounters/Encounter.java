package encounters;

import java.util.Objects;

public class Encounter<T> {
    private T encounterWhat;

    public Encounter(){
        encounterWhat=null;
    }

    public T getEncounterWhat() {
        return encounterWhat;
    }

    public void setEncounterWhat(T encounterWhat) {
        this.encounterWhat = encounterWhat;
    }

    public Encounter(T encounterWhat){
        this.encounterWhat=encounterWhat;
   }

   public String printEncounterString(){
        final String emptyEncounterString="Something runs past you!. You have missed an encounter";

        if (Objects.isNull(encounterWhat)){
            return emptyEncounterString;
        }
        return "You have encountered a "+encounterWhat.toString()+"!";
   }
}
