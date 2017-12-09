package hu.helixlab;

public class Main {

    public static void main(String[] args) {
	PasswordGenerator pg = new PasswordGenerator();
        System.out.println(pg.generatePassword(9));
    }
}
