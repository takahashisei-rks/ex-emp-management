package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Employee;

/**
 * employees テーブルを操作するリポジトリ.
 */
@Repository
public class EmployeeRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Employee> EMPLOYEE_ROW_MAPPER = (rs, rowNum) -> {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setImage(rs.getString("image"));
        employee.setGender(rs.getString("gender"));
        employee.setHireDate(rs.getDate("hire_date"));
        employee.setMailAddress(rs.getString("mail_address"));
        employee.setZipCode(rs.getString("zip_code"));
        employee.setAddress(rs.getString("address"));
        employee.setTelephone(rs.getString("telephone"));
        employee.setSalary(rs.getInt("salary"));
        employee.setCharacteristics(rs.getString("characteristics"));
        employee.setDependentsCount(rs.getInt("dependents_count"));
        return employee;
    };

    /**
     * 従業員一覧情報を入社日順(降順)で取得する.
     * 
     * @return 従業員一覧
     */
    public List<Employee> findAll() {
        String sql = "SELECT id, name, image, gender, hire_date, mail_address, zip_code, address, telephone, salary, characteristics, dependents_count FROM employees ORDER BY hire_date DESC";
        return template.query(sql, EMPLOYEE_ROW_MAPPER);
    }

    /**
     * 主キーから従業員情報を取得する.
     * 
     * @param id 主キー
     * @return 従業員情報
     */
    public Employee load(Integer id) {
        String sql = "SELECT id, name, image, gender, hire_date, mail_address, zip_code, address, telephone, salary, characteristics, dependents_count FROM employees WHERE id = :id";
        MapSqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
        return template.queryForObject(sql, param, EMPLOYEE_ROW_MAPPER);
    }

    /**
     * 従業員情報を変更する.
     * 
     * @param employee 従業員情報
     */
    public void update(Employee employee) {
        String sql = "UPDATE employees SET name = :name, image = :image, gender = :gender, hire_date = :hireDate, mail_address = :mailAddress, zip_code = :zipCode, address = :address, telephone = :telephone, salary = :salary, characteristics = :characteristics, dependents_count = :dependentsCount WHERE id = :id";
        MapSqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", employee.getId())
                .addValue("name", employee.getName())
                .addValue("image", employee.getImage())
                .addValue("gender", employee.getGender())
                .addValue("hireDate", employee.getHireDate())
                .addValue("mailAddress", employee.getMailAddress())
                .addValue("zipCode", employee.getZipCode())
                .addValue("address", employee.getAddress())
                .addValue("telephone", employee.getTelephone())
                .addValue("salary", employee.getSalary())
                .addValue("characteristics", employee.getCharacteristics())
                .addValue("dependentsCount", employee.getDependentsCount());
        template.update(sql, param);
    }
}
