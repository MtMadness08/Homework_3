public class PatientTester{
    public static void main(String[] args){
        PatientManager caffeinated = new PatientManager();
        System.out.println(caffeinated);

        for(int i = 1; i < 5; i++){
            Patient subject = new Patient(i,200*i);
            caffeinated.patientAdd(subject);
        }
        System.out.println(caffeinated);

        caffeinated.caffieneAbsorption();
        caffeinated.caffieneAbsorption();
        System.out.println(caffeinated);

        caffeinated.RemovPatient(3);
        System.out.println(caffeinated);

    }
}