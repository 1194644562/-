package com.ihrm.atte.dao;

import com.ihrm.domain.atte.entity.AttendanceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author arvinyl
 */
@Repository
public interface AttendanceConfigDao extends CrudRepository<AttendanceConfig, Long>, JpaRepository<AttendanceConfig, Long>, JpaSpecificationExecutor<AttendanceConfig> {

    /**
     * 根据公司和部门查询考勤配置信息
     *
     * @param companyId    企业id
     * @param departmentId 部门id
     * @return 根据公司和部门查询考勤配置信息
     */
    AttendanceConfig findByCompanyIdAndDepartmentId(String companyId, String departmentId);
}
