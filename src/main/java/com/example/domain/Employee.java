package com.example.domain;

import java.util.Date;

/**
 * 従業員情報を表すドメインクラス.
 * employees テーブルに対応
 */
public class Employee {

    /** ID */
    private Integer id;
    
    /** 名前 */
    private String name;
    
    /** 画像 */
    private String image;
    
    /** 性別 */
    private String gender;
    
    /** 入社日 */
    private Date hireDate;
    
    /** メールアドレス */
    private String mailAddress;
    
    /** 郵便番号 */
    private String zipCode;
    
    /** 住所 */
    private String address;
    
    /** 電話番号 */
    private String telephone;
    
    /** 給料 */
    private Integer salary;
    
    /** 特性 */
    private String characteristics;
    
    /** 扶養人数 */
    private Integer dependentsCount;

    /** 引数のないコンストラクタ */
    public Employee() {}

    /** すべてのフィールドを引数に取るコンストラクタ */
    public Employee(Integer id, String name, String image, String gender, Date hireDate, String mailAddress, String zipCode, String address, String telephone, Integer salary, String characteristics, Integer dependentsCount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.hireDate = hireDate;
        this.mailAddress = mailAddress;
        this.zipCode = zipCode;
        this.address = address;
        this.telephone = telephone;
        this.salary = salary;
        this.characteristics = characteristics;
        this.dependentsCount = dependentsCount;
    }

    /** IDを取得 */
    public Integer getId() {
        return id;
    }

    /** IDを設定 */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 名前を取得 */
    public String getName() {
        return name;
    }

    /** 名前を設定 */
    public void setName(String name) {
        this.name = name;
    }

    /** 画像を取得 */
    public String getImage() {
        return image;
    }

    /** 画像を設定 */
    public void setImage(String image) {
        this.image = image;
    }

    /** 性別を取得 */
    public String getGender() {
        return gender;
    }

    /** 性別を設定 */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** 入社日を取得 */
    public Date getHireDate() {
        return hireDate;
    }

    /** 入社日を設定 */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /** メールアドレスを取得 */
    public String getMailAddress() {
        return mailAddress;
    }

    /** メールアドレスを設定 */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /** 郵便番号を取得 */
    public String getZipCode() {
        return zipCode;
    }

    /** 郵便番号を設定 */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** 住所を取得 */
    public String getAddress() {
        return address;
    }

    /** 住所を設定 */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 電話番号を取得 */
    public String getTelephone() {
        return telephone;
    }

    /** 電話番号を設定 */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /** 給料を取得 */
    public Integer getSalary() {
        return salary;
    }

    /** 給料を設定 */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /** 特性を取得 */
    public String getCharacteristics() {
        return characteristics;
    }

    /** 特性を設定 */
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    /** 扶養人数を取得 */
    public Integer getDependentsCount() {
        return dependentsCount;
    }

    /** 扶養人数を設定 */
    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", image=" + image + ", gender=" + gender + ", hireDate=" + hireDate + ", mailAddress=" + mailAddress + ", zipCode=" + zipCode + ", address=" + address + ", telephone=" + telephone + ", salary=" + salary + ", characteristics=" + characteristics + ", dependentsCount=" + dependentsCount + "]";
    }
}
