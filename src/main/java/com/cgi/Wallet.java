package com.cgi;

public class Wallet {
    private int balance;

    public int getBalance() {

        return balance;  // elle retourne la valeur de la balance

    }
                // une class pour faire un depot
    public void deposit(int amount) {
        // si la balance plus le montant est inferieur au 0 un message sera afficher "Le résultat sera négatif, réessayez"
        if ((balance + amount) < 0) throw new IllegalArgumentException("The result will end up negative try again");

        // le montant est inferieur 0 un message sera afficher "La valeur negatif nest pas valide "
        if (amount < 0) throw new IllegalArgumentException("Negative values not allowed");

        this.balance = amount;
    }
        // une class pour faire retrait
    public void withdrawal(int amount) {

        // si le montant a retrai est inferieur 0 un message sera afficher "Vous ne pouvez pas retirer une valeur négative"
        if (amount < 0) throw new IllegalArgumentException("You cannot withdrawal a negative value");

        // si le montant a retirai est plus grand du solde un message sera afficher "Le résultat sera négatif, réessayez"
        if ((balance - amount) < 0) throw new IllegalArgumentException("The result will end up negative try again");
        // si toute est bon deduit le montant du solde
        this.balance -= amount;
    }
}
