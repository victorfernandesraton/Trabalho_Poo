package app;

public class User {
    private String name, cpf, mail, phone;
    private Rent[] rentList;
    private double debit;

    public User(String name, String cpf) {
        this(name,cpf,null,null,0);
    }

    public User(String name, String cpf, String mail, String phone,double debit) {
        this.name = name;
        this.cpf = cpf;
        this.mail = mail;
        this.phone = phone;
        this.rentList = new Rent[100];
        this.debit = debit;
    }
    
    public boolean isExist(String idrent) {
        boolean out = false;
        for (int i = 0; i < this.rentList.length; i++) {
            if (rentList[i] != null && rentList[i].getId().equals(idrent)) {
                out = true;
            }
        }
        return out;
    }

    public void addRent(Rent nrent) {
        for (int i = 0; i < this.rentList.length; i++) {
            if (rentList[i] == null) {
                rentList[i] = nrent;
                break;
            }
        }
    }

    public void endRent(String idrent) {
        for (int i = 0; i < this.rentList.length; i++) {
            if (rentList[i] != null && isExist(idrent) == true) {
                rentList[i] = null;
                break;
            }
        }
    }

    public Rent getRent(String idrent) {
        Rent temprent = null;
        for (int i = 0; i < this.rentList.length; i++) {
            if (rentList[i] != null && isExist(idrent) == true) {
                temprent = rentList[i];
            }
        }
        return temprent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addDebit (double debit) {
        this.debit += debit;
    }

    public void payDebit(double debit) {
        this.debit -= debit;
    }

    public void clearDebit() {
        this.debit = 0;
    }

    public double getDebit() {
        return debit;
    }
}
