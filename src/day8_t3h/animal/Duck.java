package day8_t3h.animal;

public class Duck implements RunITF,SwimITF {

    @Override
    public void run() {
        System.out.println("Vit chay");
    }

    @Override
    public void swim() {
        System.out.println("Vit boi");
    }
}
