package org.opensrp.repository.postgres.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.Campaign;
import org.opensrp.domain.postgres.CampaignExample;

public interface CampaignMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	long countByExample(CampaignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int deleteByExample(CampaignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int insert(Campaign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int insertSelective(Campaign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	List<Campaign> selectByExample(CampaignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	Campaign selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int updateByExampleSelective(@Param("record") Campaign record, @Param("example") CampaignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int updateByExample(@Param("record") Campaign record, @Param("example") CampaignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int updateByPrimaryKeySelective(Campaign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.campaign
	 * @mbg.generated  Fri Nov 09 12:47:47 EAT 2018
	 */
	int updateByPrimaryKey(Campaign record);
}