package org.opensrp.repository.postgres.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.TaskMetadata;
import org.opensrp.domain.postgres.TaskMetadataExample;

public interface TaskMetadataMapper {
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	long countByExample(TaskMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int deleteByExample(TaskMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int deleteByPrimaryKey(Long id);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int insert(TaskMetadata record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int insertSelective(TaskMetadata record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	List<TaskMetadata> selectByExample(TaskMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	TaskMetadata selectByPrimaryKey(Long id);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByExampleSelective(@Param("record") TaskMetadata record, @Param("example") TaskMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByExample(@Param("record") TaskMetadata record, @Param("example") TaskMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByPrimaryKeySelective(TaskMetadata record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.task_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByPrimaryKey(TaskMetadata record);
}
