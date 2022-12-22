public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(200);

        Weapon weapon =new Weapon();
        weapon.setWeaponType(WeaponType.AK_47);
        weapon.setName("Ak_47");

        boss.setWeapon(weapon);

        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getWeapon());
    }
}