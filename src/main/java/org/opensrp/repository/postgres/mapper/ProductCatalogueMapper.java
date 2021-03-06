package org.opensrp.repository.postgres.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.ProductCatalogue;
import org.opensrp.domain.postgres.ProductCatalogueExample;

public interface ProductCatalogueMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	long countByExample(ProductCatalogueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int deleteByExample(ProductCatalogueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int deleteByPrimaryKey(Long uniqueId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int insert(ProductCatalogue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int insertSelective(ProductCatalogue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	List<ProductCatalogue> selectByExample(ProductCatalogueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	ProductCatalogue selectByPrimaryKey(Long uniqueId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int updateByExampleSelective(@Param("record") ProductCatalogue record,
			@Param("example") ProductCatalogueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int updateByExample(@Param("record") ProductCatalogue record, @Param("example") ProductCatalogueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int updateByPrimaryKeySelective(ProductCatalogue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.product_catalogue
	 * @mbg.generated  Thu Oct 01 12:40:29 PKT 2020
	 */
	int updateByPrimaryKey(ProductCatalogue record);
}
