import java.util.Objects;

public class Auto {


    private String make;
    private int yearOfBuild;
    private String color;
    private double engineVolume;
    private String condition;
    private String typeOfFuel;
    private int kmDriven;


    private int yearNow=2021;

    public Auto(String make, int yearOfBuild, String color, double engineVolume, String condition, String typeOfFuel, int kmDriven) {
        this.make =make;
        this.setYearOfBuild(yearOfBuild);
        this.color=color;
        this.setEngineVolume(engineVolume);
        this.condition=condition;
        this.typeOfFuel=typeOfFuel;
        this.setKmDriven(kmDriven);



    }

    public void setYearNow(int yearNow){
        yearNow=this.yearNow;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(int yearOfBuild) {
        if (yearOfBuild<=yearNow){
            this.yearOfBuild = yearOfBuild;}


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {

        if (engineVolume>0&&engineVolume<10)
            this.engineVolume = engineVolume;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        if (kmDriven>0&&kmDriven<1000000)
            this.kmDriven = kmDriven;
    }


    @Override
    public String toString() {
        return "Auto [ " +
                "make= '" + make + '\'' +
                ", yearOfBuild= " + yearOfBuild +
                ", color= '" + color + '\'' +
                ", engineVolume= " + engineVolume +
                ", condition= '" + condition + '\'' +
                ", typeOfFuel= '" + typeOfFuel + '\'' +
                ", kmDriven= " + kmDriven +
                " ]";

    }




    private int normalKmPerYear=0;
    public boolean  isSuspicious(){

        for (int i = 1; i <yearNow-yearOfBuild ; i++) {

            normalKmPerYear +=15000;


        }

        if (normalKmPerYear>kmDriven){
            return true;
        }else return false;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return yearOfBuild == auto.yearOfBuild &&
                Double.compare(auto.engineVolume, engineVolume) == 0 &&
                kmDriven == auto.kmDriven &&
                yearNow == auto.yearNow &&
                Objects.equals(make, auto.make) &&
                Objects.equals(color, auto.color) &&
                Objects.equals(condition, auto.condition) &&
                Objects.equals(typeOfFuel, auto.typeOfFuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, yearOfBuild, color, engineVolume, condition, typeOfFuel, kmDriven, yearNow);
    }
}
