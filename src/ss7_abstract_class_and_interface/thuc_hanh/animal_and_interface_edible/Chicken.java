package ss7_abstract_class_and_interface.thuc_hanh.animal_and_interface_edible;

public class Chicken extends Animal implements Edible{


    @Override
    public String makeSound() {
        return "ò ó o!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
