public class Person {
    private String name;
    private String number;
    private int age;
    private int height;
    private int weight;


    public Person(String initialName, String initialNumber) {
        this.name = initialName;
        this.number = initialNumber;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    // Retrieve Data
    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public int getAge() {
        return this.age;
    }

    // Modify data
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }

    // Additional Features
    public void becomeOlder() {
        this.age += 1;
    }

    public boolean isAdult(){
        if(this.age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public double bodymassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }

    // Display
    public String toString() {
        return this.name + "     number: " + this.number;
    }

    public void printPerson() {
        System.out.println(this);
    }


}
