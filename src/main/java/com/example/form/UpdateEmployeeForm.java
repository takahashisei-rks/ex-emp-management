package com.example.form;

/**
 * 従業員情報更新時に使用するフォーム.
 */
public class UpdateEmployeeForm {

    /** 従業員ID */
    private String id;

    /** 扶養人数 */
    private String dependentsCount;

    // getterとsetterの自動生成
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDependentsCount() {
        return dependentsCount;
    }

    public void setDependentsCount(String dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

    // toStringメソッドの自動生成
    @Override
    public String toString() {
        return "UpdateEmployeeForm [id=" + id + ", dependentsCount=" + dependentsCount + "]";
    }
}
