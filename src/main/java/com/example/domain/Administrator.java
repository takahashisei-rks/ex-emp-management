package com.example.domain;

/**
 * 管理者情報を表すドメインクラス.
 * administrators テーブルに対応
 */
public class Administrator {

    /** ID */
    private Integer id;
    
    /** 名前 */
    private String name;
    
    /** メールアドレス */
    private String mailAddress;
    
    /** パスワード */
    private String password;

    /** 引数のないコンストラクタ */
    public Administrator() {}

    /** すべてのフィールドを引数に取るコンストラクタ */
    public Administrator(Integer id, String name, String mailAddress, String password) {
        this.id = id;
        this.name = name;
        this.mailAddress = mailAddress;
        this.password = password;
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

    /** メールアドレスを取得 */
    public String getMailAddress() {
        return mailAddress;
    }

    /** メールアドレスを設定 */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /** パスワードを取得 */
    public String getPassword() {
        return password;
    }

    /** パスワードを設定 */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator [id=" + id + ", name=" + name + ", mailAddress=" + mailAddress + ", password=" + password + "]";
    }
}
