package com.example.controller;

import com.example.service.AdministratorService;

import jakarta.servlet.http.HttpSession;

import com.example.form.InsertAdministratorForm;
import com.example.form.LoginForm;
import com.example.domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 管理者機能のControllerクラス
 */
@Controller
@RequestMapping("/")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private HttpSession session;

    /**
     * ログイン処理
     * 
     * @param form  ログインフォーム
     * @param model モデル
     * @return 次のページへ遷移
     */
    @PostMapping("/login")
    public String login(LoginForm form, Model model) {
        Administrator administrator = administratorService.login(form.getMailAddress(), form.getPassword());
        if (administrator == null) {
            model.addAttribute("error", "メールアドレスまたはパスワードが不正です。");
            return "administrator/login";
        }
        session.setAttribute("administratorName", administrator.getName());
        return "redirect:/employee/showList";
    }

    /**
     * ログイン画面を表示します.
     * 
     * @param form ログインフォーム
     * @return ログイン画面のテンプレート名
     */
    @GetMapping("/")
    public String toLogin(LoginForm form) {
        return "administrator/login";
    }

    @GetMapping("/toInsert")
    public String toInsert(InsertAdministratorForm form) {
        return "administrator/insert";
    }

    /**
     * Administratorテーブルにデータを登録する処理
     * 
     * @param form 画面からのデータ入力
     * @return リダイレクト
     */
    @PostMapping("/insert")
    public String insert(InsertAdministratorForm form) {
        Administrator administrator = new Administrator();
        administrator.setName(form.getName());
        administrator.setMailAddress(form.getMailAddress());
        administrator.setPassword(form.getPassword());
        administratorService.insert(administrator);
        return "redirect:/";
    }

    /**
     * ログアウト処理を行うメソッド.
     * 
     * @param session セッション情報
     * @return ログイン画面へリダイレクト
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // セッション情報を無効にする
        session.invalidate();
        // ログイン画面へリダイレクト
        return "redirect:/";
    }
}
