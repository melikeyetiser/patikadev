package location;

import item.Armor;
import item.Weapon;
import player.Player;

public class Store extends NormalLocation {
    public int pickedToolID;

    public Weapon weapon = this.getPlayer().getCharacter().getInventory().getWeapon();
    public Armor armor = this.getPlayer().getCharacter().getInventory().getArmor();

    public Weapon pickedWeapon;
    public Armor pickedArmor;

    public Store(Player player) {
        super(player, "Store", 2);
    }

    @Override
    public boolean onLocation() {
        System.out.println("************ Welcome to the Store ************");
        System.out.println("1 - Weapons");
        System.out.println("2 - Armors");
        System.out.println("3 - Exit");
        System.out.println("***********************************************");

        System.out.println("Your choice: ");
        pickedToolID = scan.nextInt();


        switch (pickedToolID) {
            case 1:
                weapon.printItemsInfo();

                pickingWeapon();
                break;
            case 2:
                armor.printItemsInfo();

                pickingArmor();

                break;
            case 3:
                System.out.println("Come again :)");
                break;

        }
        return true;
    }

    public void pickingWeapon() {
        System.out.println("Chose a weapon: ");
        pickedToolID = scan.nextInt();

        if (pickedToolID == 4) {
            onLocation();
        }

        while (pickedToolID == (this.getPlayer().getCharacter().getInventory().getWeapon().getId())) {
            System.out.println("You already have a " + this.getPlayer().getCharacter().getInventory().getWeapon().getName());
            pickingWeapon();
        }
        buyWeapon();


    }

    public void buyWeapon() {
        pickedWeapon = (Weapon) weapon.getItemByID(pickedToolID, weapon.weapons());


        if (pickedWeapon != null) {

            if (pickedWeapon.getPrice() > this.getPlayer().getCharacter().getMoney()) {
                System.out.println("Sorry, you haven't got enough money!!");
                pickingWeapon();
            } else {
                int newMoney = this.getPlayer().getCharacter().getMoney() - pickedWeapon.getPrice();
                this.getPlayer().getCharacter().setMoney(newMoney);

                System.out.println("Previous weapon " + this.getPlayer().getCharacter().getInventory().getWeapon().getName()
                        + ", changed with " + pickedWeapon.getName());

                this.getPlayer().getCharacter().getInventory().setWeapon(pickedWeapon);

            }

        }
    }

    public void pickingArmor() {
        System.out.println("Chose an armor: ");
        pickedToolID = scan.nextInt();

        if (pickedToolID == 4) {
            onLocation();

        }

        while (pickedToolID == (this.getPlayer().getCharacter().getInventory().getArmor().getId())) {
            System.out.println("You already have an " + this.getPlayer().getCharacter().getInventory().getArmor().getName());
            pickingArmor();
        }
        buyArmor();

    }

    public void buyArmor() {
        pickedArmor = (Armor) armor.getItemByID(pickedToolID, armor.armors());

        if (pickedArmor != null) {

            if (pickedArmor.getPrice() > this.getPlayer().getCharacter().getMoney()) {
                System.out.println("Sorry, you haven't got enough money!!");
                pickingArmor();
            } else {
                int newMoney = this.getPlayer().getCharacter().getMoney() - pickedArmor.getPrice();
                this.getPlayer().getCharacter().setMoney(newMoney);

                System.out.println("Previous armor " + this.getPlayer().getCharacter().getInventory().getArmor().getName()
                        + ", changed with " + pickedArmor.getName());

                this.getPlayer().getCharacter().getInventory().setArmor(pickedArmor);

            }

        }
    }
}
