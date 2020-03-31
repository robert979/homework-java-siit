package com.siit.tema3.ciorna.bank;

public class Card extends BankAcount {

    private String cardNumber;
    private int expirationDate;
    double ballance =getBalance();

    public Card(String name, String iban, double balance, String cardNumber, int expirationDate) {
        super(name, iban, balance);
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;
        }


        public void withdraw (double withdrawMoney){


        if (ballance >= withdrawMoney) {

            ballance-=withdrawMoney;
            if (getExpirationDate() >=20200312) {
                if (getIban().length() == 13){

                    System.out.println("the request made by  " + getName() + " to withdraw " + withdrawMoney + " was accepted and your new ballance is " + ballance);
                }
                else {
                    System.out.println("the request made by  " + getName() + " was not accepted as the IBAN is not valid");
                }
            }
            else {
                System.out.println("the request made by  " + getName() + " was not accepted as the card is expired");
            }
            }
        else {
            System.out.println("the request made by  " + getName() + " was not accepted as there are insuficient funds");
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
