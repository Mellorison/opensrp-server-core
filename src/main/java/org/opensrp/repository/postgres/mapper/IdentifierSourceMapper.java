package org.opensrp.repository.postgres.mapper;

import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.IdentifierSource;
import org.opensrp.domain.postgres.IdentifierSourceExample;

import java.util.List;

public interface IdentifierSourceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	long countByExample(IdentifierSourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int deleteByExample(IdentifierSourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int insert(IdentifierSource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int insertSelective(IdentifierSource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	List<IdentifierSource> selectByExample(IdentifierSourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	IdentifierSource selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int updateByExampleSelective(@Param("record") IdentifierSource record,
			@Param("example") IdentifierSourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int updateByExample(@Param("record") IdentifierSource record, @Param("example") IdentifierSourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int updateByPrimaryKeySelective(IdentifierSource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
	 */
	int updateByPrimaryKey(IdentifierSource record);
}
