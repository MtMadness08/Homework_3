public class Patient{
    public int IDNumber;
    public double Caffiene;
    
    public Patient(){
        IDNumber = 0;
        Caffiene = 0.0;
    }

    public Patient(int IDNumber,double Caffiene){
        this.IDNumber = IDNumber;
        this.Caffiene = Caffiene;
    }
    
    public String toString(){
        return "ID Number: " + IDNumber + "Caffiene Level: " + Caffiene;
    }
}