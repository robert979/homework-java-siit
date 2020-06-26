Pentru atm care este incomplet de vazut userRepository cu metodele descrise mai jos
==============
userRepository
==============

@METHOD: addNewUser --> cere nume si CNP si creeaza un nou cont cu balanta zero si cu IBAN "automat".
IBAN-ul este stocat in fileBankAccount.txt - mereu primul din lista (list.get(0))
 si in momentul in care este "utilizat":
 - acesta este sters din fileBankAccount.txt si automat este generat altul la "sfarsitul" listei.
 - in acelasi timp este adaugat in IbanInUse.txt
Noul utilizator este adaugat in userList.txt

@METHOD: deleteUser--> cere IBAN
-user este sters din userList.txt
-IBAN-ul este sters din ibanInUse.txt si adaugat in deletedIban.txt


@METHOD: deposit --> cere IBAN si suma de depus
daca IBAN exista in baza de date suma se depune si se face update in userList.txt

@METHOD: withdraw --> cere IBAN si suma de retras
daca IBAN exista si sold-ul este suficient, suma este retrasa si se face update in userList.txt