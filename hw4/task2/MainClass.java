package hw4.task2;

public class MainClass {

    public static void main(String[] args) {
        PhoneTableClass phoneTableClass = new PhoneTableClass();
        phoneTableClass.add("+79000238822","Ivanov");
        phoneTableClass.add("+73338882991","Smith");
        phoneTableClass.add("+78292882222","Smith");
        phoneTableClass.add("+837363646282","Petrov");
        phoneTableClass.add("+383746494847","Lock");
        phoneTableClass.add("+83763636322","Unlock");
        phoneTableClass.add("+8383747484848","Baskov");

        System.out.println(phoneTableClass.getPhoneByLastName("Smith"));
        System.out.println(phoneTableClass.getPhoneByLastName("Petrov"));
        System.out.println(phoneTableClass.getPhoneByLastName("Petrova"));
    }
}