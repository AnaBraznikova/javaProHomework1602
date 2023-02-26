package telran.homework1602;

public class Apple extends Phone {

    public Apple(String name) {
        this.name = name;
    }

    private String name;
   


    public Apple() {
    }

    @Override
    public void call() {
        //super.call();
        System.out.println("Phone " + name + " call to " + "+" + getRandomNumber());
    }

    @Override
    public void receiveCall() {
        //super.receiveCall();
        System.out.println("Phone " + name + " receive call from " + "+" + getRandomNumber());
    }

}

