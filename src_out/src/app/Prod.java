<<<<<<< HEAD
package app;

import java.util.*;
class Prod {
    private String id;
    private Car car;
    private int unity;

    
    public Prod(Car car, int unity, String id) {
        this.car = car;
        this.unity = unity;
        this.id = id;
    }

    public Prod(Car car) {
        Random rand = new Random();
        this.id = String.valueOf(rand.nextInt(9999999));
        this.car = car;
        this.unity = 0;
    }

    public Car getCar() 
    {
        return this.car;
    }

    public void setCar(Car car) 
    {
        this.car = car;
    }

    public int getUnity() 
    {
        return this.unity;
    }

    public void setUnity(int unity) 
    {
        this.unity = unity;
    }

    public void addUnity(int unity) {
        this.unity += unity;
    }

    public void addUnity() {
        addUnity(1);
    }

    public void subUnity(int unity) {
        this.unity -= unity;
    }

    public void subUnity() {
        subUnity(1);
    }

=======
package app;

import java.util.*;
class Prod {
    private String id;
    private Car car;
    private int unity;

    
    public Prod(Car car, int unity, String id) {
        this.car = car;
        this.unity = unity;
        this.id = id;
    }

    public Prod(Car car) {
        Random rand = new Random();
        this.id = String.valueOf(rand.nextInt(9999999));
        this.car = car;
        this.unity = 0;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) 
    {
        this.car = car;
    }

    public int getUnity() 
    {
        return this.unity;
    }

    public void setUnity(int unity) 
    {
        this.unity = unity;
    }

    public void addUnity(int unity) {
        this.unity += unity;
    }

    public void addUnity() {
        addUnity(1);
    }

    public void subUnity(int unity) {
        this.unity -= unity;
    }

    public void subUnity() {
        subUnity(1);
    }

>>>>>>> branch 'master' of https://github.com/victorfernandesraton/Trabalho_Poo
}