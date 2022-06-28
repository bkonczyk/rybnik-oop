package pl.sda.polymorphism;

public interface RemoteController {
    void enable(boolean enable);
}

class TvRemoteController implements RemoteController {

    @Override
    public void enable(boolean enable) {
        if (enable) {
            System.out.println("The TV is enabled");
        } else {
            System.out.println("The TV is disabled");
        }
    }
}

class ACRemoteController implements RemoteController {

    @Override
    public void enable(boolean enable) {
        if (enable) {
            System.out.println("The AC is enabled");
        } else {
            System.out.println("The AC is disabled");
        }
    }
}

class PolimorphismExample {
    public static void main(String[] args) {
        RemoteController remoteController = new TvRemoteController();
        remoteController.enable(true);
        remoteController = new ACRemoteController();
        remoteController.enable(false);
    }
}

