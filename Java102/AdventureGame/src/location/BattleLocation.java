package location;

import item.Armor;
import item.StoreItem;
import item.Weapon;
import obstacle.Obstacle;
import player.Player;

import java.util.Random;

public class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public Random random = new Random();
    private Weapon weaponAward;
    private Armor armorAward;
    private boolean isAwardCollected;


    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle, int id) {
        super(player, name, id);
        setObstacle(obstacle);
        setAward(award);
        setMaxObstacle(maxObstacle);
        setIsAwardCollected(this.getPlayer().getCharacter().getInventory().isAwardCollected(award));

    }

    @Override
    public boolean onLocation() {

        if (getIsAwardCollected() == false) {
            int obsNum = this.randomObstacleNumber();
            System.out.println("You are in: " + this.getName());
            System.out.println("Careful! There are " + obsNum + " " + this.getObstacle().getName() + " " + "in here.");

            System.out.println("<F> fight or <R> run: ");
            String selectCase = Location.scan.next().toUpperCase();
            if (selectCase.equals("F")) {
                System.out.println("If you choose to fight, there is a 50% chance that either you or obstacle will attack first.");

                if (fight(obsNum) == true) {

                    if (this.getPlayer().getCharacter().getHealth() <= 0) {

                        return false;

                    } else {

                        if (this.getPlayer().getLocation().getName().equals("Mine")) {
                            mineAward();
                        } else {
                            System.out.println("You defeated all enemies in " + this.getPlayer().getLocation().getName());
                            System.out.println("You earned these awards: " + this.getAward() + " and " + " money (" + this.getObstacle().getGold() + ")");

                            this.getPlayer().getCharacter().getInventory().setAwards(this.getAward());
                            this.getPlayer().printHowManyCollectInfo();

                            this.getPlayer().getCharacter().setMoney(this.getPlayer().getCharacter().getMoney() + this.getObstacle().getGold());
                            return true;
                        }
                    }

                } else {
                    return true;
                }

            }

            return true;
        } else {
            System.out.println("You already collected the award of " + getName() + ". So you can't go that location anymore.");
            return true;
        }
    }

    public boolean fight(int obsNum) {
        for (int i = 1; i <= obsNum; i++) {

            this.getObstacle().setRemainingHealth(this.getObstacle().getBeginningHealth());


            while (this.getPlayer().getCharacter().getHealth() > 0 && this.getObstacle().getRemainingHealth() > 0) {

                System.out.println("<A> attack or <R> run: ");
                String selectFight = Location.scan.next().toUpperCase();

                if (selectFight.equals("A")) {

                    int whoIsFirst = random.nextInt(2);
                    if (whoIsFirst == 0) {
                        playerAttackFirst(i);
                        obstacleAttackFirst(i);
                    } else if (whoIsFirst == 1) {
                        obstacleAttackFirst(i);
                        playerAttackFirst(i);
                    }


                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public void playerAttackFirst(int whichObs) {

        if (this.getPlayer().getCharacter().getHealth() > 0) {
            System.out.println("You attacked!!!");

            this.obstacle.setRemainingHealth(this.obstacle.getRemainingHealth() - this.getPlayer().getCharacter().getTotalDamage());

            playerStats();
            obsStats(whichObs);
            System.out.println("");
            if (this.obstacle.getRemainingHealth() == 0) {
                System.out.println("You killed " + whichObs + ". " + this.getObstacle().getName());
            }
            System.out.println("");
        }

    }


    public void obstacleAttackFirst(int whichObs) {
        if (this.getObstacle().getRemainingHealth() > 0) {
            System.out.println(this.obstacle.getName() + " attacked!!!");

            int obstaclesDamage = this.getObstacle().getDamage() - this.getPlayer().getCharacter().getBlocking();
            if (obstaclesDamage < 0) {
                obstaclesDamage = 0;
            }
            int newHealth = this.getPlayer().getCharacter().getHealth() - obstaclesDamage;
            this.getPlayer().getCharacter().setHealth(newHealth);

            playerStats();
            obsStats(whichObs);
            System.out.println("");
        }

    }

    public void playerStats() {
        System.out.println("      Your Stats:" +
                " | health: " + this.getPlayer().getCharacter().getHealth() +
                " | Weapon: " + this.getPlayer().getCharacter().getInventory().getWeapon().getName() +
                " | Damage: " + this.getPlayer().getCharacter().getDamage() +
                " | Armor: " + this.getPlayer().getCharacter().getInventory().getArmor().getName() +
                " | Blocking " + this.getPlayer().getCharacter().getBlocking() + " | ");
    }

    public void obsStats(int i) {
        System.out.println("      " + i + ". " + this.getObstacle().getName() + "'s Stats:" +
                " | health: " + this.getObstacle().getRemainingHealth() +
                " | Damage: " + this.getObstacle().getDamage() +
                " | Award " + this.getObstacle().getGold() + " | ");

    }

    public void mineAward() {
        System.out.println("You defeated all enemies in " + this.getPlayer().getLocation().getName());
        int categoryChance = random.nextInt(1, 100);
        int weaponTypeChance = random.nextInt(1, 100);
        int armorTypeChance = random.nextInt(1, 100);
        int moneyAmountChance = random.nextInt(1, 100);


        if (1 <= categoryChance && categoryChance <= 24) {

            if (1 <= moneyAmountChance && moneyAmountChance <= 19) {

                System.out.println("You have won 10 coin!");
                this.getPlayer().getCharacter().setMoney(this.getPlayer().getCharacter().getMoney() + 10);
            } else if (20 <= moneyAmountChance && moneyAmountChance <= 49) {

                System.out.println("You have won 5 coin!");
                this.getPlayer().getCharacter().setMoney(this.getPlayer().getCharacter().getMoney() + 5);
            } else {

                System.out.println("You have won 1 coin!");
                this.getPlayer().getCharacter().setMoney(this.getPlayer().getCharacter().getMoney() + 1);
            }

        } else if (25 <= categoryChance && categoryChance <= 39) {

            if (1 <= weaponTypeChance && weaponTypeChance <= 19) {

                System.out.println("You have won a rifle!");
                weaponAward = (Weapon) StoreItem.getItemByName("Rifle", Weapon.weapons());
                this.getPlayer().getCharacter().getInventory().setWeapon(weaponAward);
            } else if (20 <= weaponTypeChance && weaponTypeChance <= 49) {

                System.out.println("You have won a sword!");
                weaponAward = (Weapon) StoreItem.getItemByName("Sword", Weapon.weapons());
                this.getPlayer().getCharacter().getInventory().setWeapon(weaponAward);
            } else {

                System.out.println("You have won a gun!");
                weaponAward = (Weapon) StoreItem.getItemByName("Gun", Weapon.weapons());
                this.getPlayer().getCharacter().getInventory().setWeapon(weaponAward);
            }
        } else if (40 <= categoryChance && categoryChance <= 54) {

            if (1 <= armorTypeChance && armorTypeChance <= 19) {
                System.out.println("You have won a heavy armor!");
                armorAward = (Armor) StoreItem.getItemByName("Heavy armor", Armor.armors());
                this.getPlayer().getCharacter().getInventory().setArmor(armorAward);

            } else if (20 <= armorTypeChance && armorTypeChance <= 49) {

                System.out.println("You have won a medium armor!");
                armorAward = (Armor) StoreItem.getItemByName("Heavy armor", Armor.armors());
                this.getPlayer().getCharacter().getInventory().setArmor(armorAward);
            } else {
                System.out.println("You have won a light armor!");
                armorAward = (Armor) StoreItem.getItemByName("Heavy armor", Armor.armors());
                this.getPlayer().getCharacter().getInventory().setArmor(armorAward);
            }

        } else {
            System.out.println("You couldn't get an award from Mine :(");
        }

    }

    public int randomObstacleNumber() {
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    ;

    public boolean getIsAwardCollected() {
        return isAwardCollected;
    }

    public void setIsAwardCollected(boolean awardCollected) {
        isAwardCollected = awardCollected;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        if (!award.equals("random")) {
            this.award = award;

        } else {
            this.award = null;
        }

    }

}
