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
        if (getBalance() >= withdrawMoney) {
            if (getExpirationDate() >=20200312) {
                if (getIban().length() == 13){
                    double amount =-withdrawMoney;
                    System.out.println("your request have been accepted");
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


}
