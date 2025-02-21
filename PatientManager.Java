import java.util.ArrayList;

public class PatientManager{
    public ArrayList<Patient> Patients;

    public PatientManager(){
        Patients = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            Patients.add(i, null);
        }
    }
    
    public int patientAdd(Patient add){
        for(int i = 0; i < Patients.size(); i++){
            if(Patients.get(i) == null){
                Patients.set(i,add);
                return i;
            }
        }
        return -1;
    }

    public Patient RemovPatient(int remove){
        if(remove <=10){
            Patient dead = Patients.get(remove);
            Patients.set(remove,null);
            return dead;
        }
        return null;
    }

    public void caffieneAbsorption(){
        for (int i = 0; i < Patients.size(); i++){
            Patient caffiene = Patients.get(i);
            if(caffiene != null){
                if(caffiene.Caffiene <= 160){
                    Patients.set(i,null);
                }
                else{
                    caffiene.Caffiene -= 160;
                }
            }
        }
    }

    public String toString(){
        Patient spot;
        for(int i = 0; i < Patients.size(); i++){
                spot = Patients.get(i);
                if(spot != null){
                    String result = "";
                    for(int j = 0; j < Patients.size(); j++){
                        spot = Patients.get(j);
                        if(spot != null){
                            result = result + " " + spot.IDNumber + " " +spot.Caffiene + "\n";
                        }
                    }
                    return result;
                }
        }
        return "Empty";
    }
}