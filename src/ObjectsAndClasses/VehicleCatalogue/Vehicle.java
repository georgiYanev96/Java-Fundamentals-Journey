package ObjectsAndClasses.VehicleCatalogue;

public class Vehicle {
    public String type;
    public String model;
    public String color;
    public int horsepower;

    //Type: {typeOfVehicle}
    //Model: {modelOfVehicle}
    //Color: {colorOfVehicle}
    //Horsepower: {horsepowerOfVehicle}


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Type: ").append(type).append("\n");
        output.append("Model: ").append(model).append("\n");
        output.append("Color: ").append(color).append("\n");
        output.append("Horsepower: ").append(horsepower).append("\n");
        return output.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
