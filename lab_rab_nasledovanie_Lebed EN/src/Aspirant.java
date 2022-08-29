public class Aspirant extends Student {
    boolean dissertation;
    public Aspirant (String firstName, String lastName, String group, boolean dissertation) {
        super (firstName, lastName, String group);
        this.dissertation = dissertation;
    }
    void Dissertation (){
         int [] averageMark;
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += averageMark[i];}
                
                if (sum / 5 < 5) {
                    System.out.println("- стипендия - 180 рублей");
           else System.out.println("- стипендия - 200 рублей")}
}
