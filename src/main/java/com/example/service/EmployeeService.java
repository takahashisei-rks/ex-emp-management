package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.EmployeeRepository;
import com.example.domain.Employee;

/**
 * 従業員情報を操作するサービスクラス.
 */
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * 全従業員情報を取得する.
     * 
     * @return 従業員一覧
     */
    public List<Employee> showList() {
        return employeeRepository.findAll();
    }
}
