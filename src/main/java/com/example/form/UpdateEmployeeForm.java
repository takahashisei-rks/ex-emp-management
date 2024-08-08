package com.example.form;

/**
 * 従業員情報更新時に使用するフォーム.
 */
public class UpdateEmployeeForm {

    /** 従業員ID */
    private Integer id;

    /** 扶養人数 */
    private Integer dependentsCount;

    // getterとsetterの自動生成
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDependentsCount() {
        return dependentsCount;
    }

    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

}
