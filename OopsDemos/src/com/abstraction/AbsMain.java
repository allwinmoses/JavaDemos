package com.abstraction;

public class AbsMain {
    public static void main(String[] args) {
        Bank bank= new SubBranch();

        SubBranch subBranch=(SubBranch) bank;
        subBranch.subPay();
        subBranch.carLoan();
        subBranch.admin();
        subBranch.eduLoan();
        subBranch.loanType();


        Branch2 branch2=new SubBranch();



    }
}
