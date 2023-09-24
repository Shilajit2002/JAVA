package Practice;

abstract  class Telephone {
    public abstract void ring();
    public abstract void lift();
    public abstract void disconnect();
}

class SmartTelephone extends Telephone{
    @Override
    public void ring() {
        System.out.println("Ringing....");
    }

    @Override
    public void lift() {
        System.out.println("Lifting....");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected....");
    }
}

class Tell_Smart {
    public static void main(String[] args) {
        SmartTelephone S = new SmartTelephone();
        S.ring();
        S.lift();
        S.disconnect();
    }
}
