public class Aspirant extends Student {
    boolean dissertation;
    public Aspirant (String firstName, String lastName, String group, boolean dissertation) {
        super (firstName, lastName, String group);
        this.dissertation = dissertation;
    }
    @Override
    void getScholarship (){
            System.out.println("- стипендия - 180 рублей");
           else System.out.println("- стипендия - 200 рублей")}
    }
                 
}
