package com.example.service;

import com.example.domain.Administrator;
import com.example.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    /**
     * ログイン処理を行う
     * 
     * @param mailAddress メールアドレス
     * @param password    パスワード
     * @return 管理者情報（該当する管理者がいない場合はnull）
     */
    public Administrator login(String mailAddress, String password) {
        return administratorRepository.findByMailAddressAndPassword(mailAddress, password);
    }

    /**
     * 管理者情報を登録する.
     * 
     * @param administrator 管理者情報
     */
    public void insert(Administrator administrator) {
        administratorRepository.insert(administrator);
    }
}
