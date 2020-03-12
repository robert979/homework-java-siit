package com.siit.tema3.bank;

public class Card extends BankAcount {

    private String cardNumber;
    private int expirationDate;

    public Card(String name, String iban, double balance, String cardNumber, int expirationDate) {
        super(name, iban, balance);
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;
        }


        public void withdraw (double withdrawMoney){
            double ballance = getBalance();

        if (getBalance() >= withdrawMoney) {
            if (getExpirationDate() >=20200312) {
                if (getIban().length() == 13){

                    ballance=ballance -withdrawMoney;

                    System.out.println("your request to withdraw " + withdrawMoney + " was accepted and your new ballance is " + ballance);
                }
                else {
                    System.out.println("you don't have a valid iban");
                }

            }
            else {
                System.out.println("your card is expired");
            }
            }
        else {
            System.out.println("you have insuficient funds");
        }
        }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
}
