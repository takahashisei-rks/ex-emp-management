package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Employee;
import com.example.form.UpdateEmployeeForm;
import com.example.service.EmployeeService;

/**
 * 従業員情報を操作するコントローラークラス.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 従業員詳細画面を表示するメソッド
     * 
     * @param id    従業員ID
     * @param model モデル
     * @return 詳細ページのテンプレート名
     */
    @GetMapping("/showDetail")
    public String showDetail(@RequestParam("id") String id, Model model, UpdateEmployeeForm form) {
        Integer employeeId = Integer.parseInt(id);
        Employee employee = employeeService.showDetail(employeeId);
        model.addAttribute("employee", employee);
        return "employee/detail";
    }

    /**
     * 扶養人数更新処理
     * 
     * @param form 画面入力
     * @return 従業員一覧画面にリダイレクト
     */
    @PostMapping("/update")
    public String update(UpdateEmployeeForm form) {
        // IDで従業員情報を検索
        Employee employee = employeeService.showDetail(form.getId());

        // フォームから送られてきた扶養人数で上書き
        employee.setDependentsCount(form.getDependentsCount());

        // 従業員情報を更新
        employeeService.update(employee);

        // 従業員一覧画面にリダイレクト
        return "redirect:/employee/showList";
    }

    /**
     * 従業員一覧を表示する.
     * 
     * @param model リクエストスコープ
     * @return 従業員一覧画面
     */
    @GetMapping("/showList")
    public String showList(Model model) {
        model.addAttribute("employeeList", employeeService.showList());
        return "employee/list";
    }
}
