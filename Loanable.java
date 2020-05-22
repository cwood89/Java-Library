interface Loanable {
  boolean isLoanable();

  int getLoanTerm();

  void setLoanable();

  void lateCharge(Charges charge);
}