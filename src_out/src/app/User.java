package app;

public class User {
    private String name, cpf, mail, phone;

    public User(String name, String cpf) {
        this(name,cpf,null,null);
    }

    public User(String name, String cpf, String mail, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.mail = mail;
        this.phone = phone;
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
}
