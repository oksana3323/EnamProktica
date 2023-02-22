public class Main {
    public static void main(String[] args) {


        Warroir warroir = new Warroir("Barxammer", 100, "100%", "90", "weapeon");

        Warroir warroir1 = new Warroir("Revolber", 100, "100%", "90", "weapeon");
        Archer archer = new Archer("Key", 100, "905", "67", "archer");
        Archer archer1 = new Archer("Key", 100, "905", "67", "archer");

        Character[] characters = {warroir, warroir1, archer, archer1};

        for (Character character : characters) {

            if (character.equals(warroir)) {
                warroir.setWeapon(new Weapon(WeaponType.SWORD));

                warroir1.setWeapon(new Weapon(WeaponType.AXE));

                System.out.println("Archer:" +
                        "" + warroir.getName() + "\n"+"Weapon:" + warroir.getName());
                System.out.println("Archer" + warroir1.getName() + "Weapon" + warroir1.getName());

            } else if (character.equals(archer)) {
                archer.setWeapon(new Weapon(WeaponType.BOW));
                archer.setWeapon(new Weapon(WeaponType.BOW));
                System.out.println("Archer" +
                        ":" + archer.getName() + "Weapon:" + archer.getWeapon().getWeaponType());
                System.out.println("Archer:" + archer1.getName() + "Weapon:" + warroir1.getWeapon().getWeaponType());

            }
            archer.attack();
        }
    }
}