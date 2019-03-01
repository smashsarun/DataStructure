/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.hash;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author INT303
 */
public class TestHashSet {
    public static void main(String[] args) {
//        Set<String> set = new HashSet();
//        set.add("Cat");
//        set.add("Dog");
//        set.add("Bird");
//        set.add("Fish");
//        set.add("Duck");
//        
//        System.out.println("Cat".hashCode());
//        
//        String x = new String("Cat");
//        System.out.println(x.hashCode());
//        
//        
//        System.out.println("set has a Dog? " + (set.contains("Dog")?"Yes":"No"));
        testHashCode();
    }
    
    public static void testHashCode(){
        Set<BankAccount> baSet = new HashSet();
        baSet.add(new BankAccount(1001, "Somchai", 500));
        baSet.add(new BankAccount(1002, "Somsak", 500));
        baSet.add(new BankAccount(1003, "Somsri", 500));
        baSet.add(new BankAccount(1004, "Somrak", 500));
        baSet.add(new BankAccount(1005, "Somchart", 500));
        baSet.add(new BankAccount(1006, "Somkid", 500));
        
        BankAccount ba1 = new BankAccount(1002, "Somsak", 500);
        BankAccount ba2 = new BankAccount(1005, "Somchart", 500);
        
        BankAccount baa = new BankAccount(1002, "Somsak", 500);
        
        System.out.println(ba1.hashCode());
        System.out.println(baa.hashCode());
        System.out.println(baSet.contains(ba1));
        System.out.println(baSet.contains(ba2));
    }
}

class BankAccount {
    private int accountId;
    private String name;
    private double balance;

    @Override
    public int hashCode() { //ทำให้เวลา hash แล้ว value เท่ากันได้ key เท่ากัน
        int hash = 3; //random prime number
        hash = 41 * hash + this.accountId;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BankAccount other = (BankAccount) obj;
        if (this.accountId != other.accountId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    public BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }
    
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
