public class Student {
     String firstName;
    String lastName;
    String group;
    int averageMark[];

    public Student (String firstName, String lastName, String group, int averageMark[]){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    String getFirstName() {return this.firstName;}
    String getLastName() {return this.lastName;}
    String getGroup() {return this.group;}
    String getAverageMark() {return this.getAverageMark();}
    void getScholarship () {
        int [] averageMark;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += averageMark[i];}
        if (sum / 5 < 5) {
            System.out.println("- стипендия - 80 рублей");}
        else System.out.println("- стипендия - 100 рублей");
    }


}
