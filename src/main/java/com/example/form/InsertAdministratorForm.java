package com.example.form;

public class InsertAdministratorForm {

    private String name;
    private String mailAddress;
    private String password;

    // デフォルトコンストラクタ
    public InsertAdministratorForm() {
    }

    // 全フィールドを引数に取るコンストラクタ
    public InsertAdministratorForm(String name, String mailAddress, String password) {
        this.name = name;
        this.mailAddress = mailAddress;
        this.password = password;
    }

    // getterとsetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
                + "]";
    }
}
