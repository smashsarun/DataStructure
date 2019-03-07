/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Sardine
 */
public class Compare {
    public static void main(String[] args) {
        Set<employee> emp = new TreeSet(new compareByPosotion());
        List<employee> list = new ArrayList<employee>();
        
        emp.add(new employee(1001,"Alex","Manager"));
        emp.add(new employee(1003,"Bird","CEO"));
        emp.add(new employee(1002,"Coco","CFO"));
        emp.add(new employee(1004,"Billy","Information"));
        emp.add(new employee(1006,"Tom","Finance"));
        
        list.add(new employee(1001,"Alex","Manager"));
        list.add(new employee(1003,"Bird","CEO"));
        list.add(new employee(1002,"Coco","CFO"));
        list.add(new employee(1004,"Billy","Information"));
        list.add(new employee(1006,"Tom","Finance"));
        Collections.sort(list, new compareByPosotion());
        for (employee li : emp) {
            System.out.println(li);
        }
        System.out.println("--------");
        for (employee li : list) {
            System.out.println(li);
        }
    }
    
}

class compareByPosotion implements Comparator<employee>{

    @Override
    public int compare(employee o1, employee o2) {
        return o1.getPosotion().compareTo(o2.getPosotion());
    }
    
}

class employee implements Comparable<employee>{
    int id;
    String name;
    String posotion;
    
    @Override
    public int compareTo(employee o) {
        return this.id-(o.id);
    }

    public employee(int id, String name, String posotion) {
        this.id = id;
        this.name = name;
        this.posotion = posotion;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosotion() {
        return posotion;
    }

    public void setPosotion(String posotion) {
        this.posotion = posotion;
    }

    @Override
    public String toString() {
        return "employee{" + "id=" + id + ", name=" + name + ", posotion=" + posotion + '}';
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 47 * hash + this.id;
//        hash = 47 * hash + Objects.hashCode(this.name);
//        hash = 47 * hash + Objects.hashCode(this.posotion);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final employee other = (employee) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.posotion, other.posotion)) {
//            return false;
//        }
//        return true;
//    }
    
    
}
