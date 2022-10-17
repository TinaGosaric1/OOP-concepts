import mojaMapa.composition.computer.*;
import mojaMapa.composition.room.Bed;
import mojaMapa.composition.room.Bedroom;
import mojaMapa.composition.room.Lamp;
import mojaMapa.encapsulation.Account;
import mojaMapa.inheritance.animals.Animal;
import mojaMapa.inheritance.animals.Dog;
import mojaMapa.inheritance.shapes.Rectangle;
import mojaMapa.inheritance.avti.*;
import mojaMapa.inheritance.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Bedroom myRoom = new Bedroom(new Bed(5), new Lamp());
        myRoom.getLamp().turnOn();

        Account myAccount1 = new Account();
        Account myAccount2 = new Account();
        Account myAccount3 = new Account("TG","1213",150.0);
        System.out.println(Account.getNumberOfAccounts());
    }
}