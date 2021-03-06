/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inkwell.internet.shopping.sb.service.base;

import com.inkwell.internet.shopping.sb.model.ShoppingCategoryImage;
import com.inkwell.internet.shopping.sb.service.ShoppingCategoryImageLocalService;
import com.inkwell.internet.shopping.sb.service.persistence.ShoppingCategoryImagePersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.expando.service.ExpandoRowLocalService;
import com.liferay.portlet.expando.service.ExpandoValueLocalService;
import com.liferay.portlet.expando.service.ExpandoValueService;
import com.liferay.portlet.expando.service.persistence.ExpandoRowPersistence;
import com.liferay.portlet.expando.service.persistence.ExpandoValuePersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the shopping category image local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.inkwell.internet.shopping.sb.service.impl.ShoppingCategoryImageLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.inkwell.internet.shopping.sb.service.ShoppingCategoryImageLocalServiceUtil} to access the shopping category image local service.
 * </p>
 *
 * @author Rich Sezov
 * @see com.inkwell.internet.shopping.sb.service.impl.ShoppingCategoryImageLocalServiceImpl
 * @see com.inkwell.internet.shopping.sb.service.ShoppingCategoryImageLocalServiceUtil
 * @generated
 */
public abstract class ShoppingCategoryImageLocalServiceBaseImpl
	implements ShoppingCategoryImageLocalService {
	/**
	 * Adds the shopping category image to the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoppingCategoryImage the shopping category image to add
	 * @return the shopping category image that was added
	 * @throws SystemException if a system exception occurred
	 */
	public ShoppingCategoryImage addShoppingCategoryImage(
		ShoppingCategoryImage shoppingCategoryImage) throws SystemException {
		shoppingCategoryImage.setNew(true);

		return shoppingCategoryImagePersistence.update(shoppingCategoryImage,
			false);
	}

	/**
	 * Creates a new shopping category image with the primary key. Does not add the shopping category image to the database.
	 *
	 * @param imageId the primary key for the new shopping category image
	 * @return the new shopping category image
	 */
	public ShoppingCategoryImage createShoppingCategoryImage(long imageId) {
		return shoppingCategoryImagePersistence.create(imageId);
	}

	/**
	 * Deletes the shopping category image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param imageId the primary key of the shopping category image to delete
	 * @throws PortalException if a shopping category image with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteShoppingCategoryImage(long imageId)
		throws PortalException, SystemException {
		shoppingCategoryImagePersistence.remove(imageId);
	}

	/**
	 * Deletes the shopping category image from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoppingCategoryImage the shopping category image to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteShoppingCategoryImage(
		ShoppingCategoryImage shoppingCategoryImage) throws SystemException {
		shoppingCategoryImagePersistence.remove(shoppingCategoryImage);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return shoppingCategoryImagePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return shoppingCategoryImagePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return shoppingCategoryImagePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return shoppingCategoryImagePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the shopping category image with the primary key.
	 *
	 * @param imageId the primary key of the shopping category image to get
	 * @return the shopping category image
	 * @throws PortalException if a shopping category image with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ShoppingCategoryImage getShoppingCategoryImage(long imageId)
		throws PortalException, SystemException {
		return shoppingCategoryImagePersistence.findByPrimaryKey(imageId);
	}

	/**
	 * Gets a range of all the shopping category images.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of shopping category images to return
	 * @param end the upper bound of the range of shopping category images to return (not inclusive)
	 * @return the range of shopping category images
	 * @throws SystemException if a system exception occurred
	 */
	public List<ShoppingCategoryImage> getShoppingCategoryImages(int start,
		int end) throws SystemException {
		return shoppingCategoryImagePersistence.findAll(start, end);
	}

	/**
	 * Gets the number of shopping category images.
	 *
	 * @return the number of shopping category images
	 * @throws SystemException if a system exception occurred
	 */
	public int getShoppingCategoryImagesCount() throws SystemException {
		return shoppingCategoryImagePersistence.countAll();
	}

	/**
	 * Updates the shopping category image in the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoppingCategoryImage the shopping category image to update
	 * @return the shopping category image that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public ShoppingCategoryImage updateShoppingCategoryImage(
		ShoppingCategoryImage shoppingCategoryImage) throws SystemException {
		shoppingCategoryImage.setNew(false);

		return shoppingCategoryImagePersistence.update(shoppingCategoryImage,
			true);
	}

	/**
	 * Updates the shopping category image in the database. Also notifies the appropriate model listeners.
	 *
	 * @param shoppingCategoryImage the shopping category image to update
	 * @param merge whether to merge the shopping category image with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the shopping category image that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public ShoppingCategoryImage updateShoppingCategoryImage(
		ShoppingCategoryImage shoppingCategoryImage, boolean merge)
		throws SystemException {
		shoppingCategoryImage.setNew(false);

		return shoppingCategoryImagePersistence.update(shoppingCategoryImage,
			merge);
	}

	/**
	 * Gets the shopping category image local service.
	 *
	 * @return the shopping category image local service
	 */
	public ShoppingCategoryImageLocalService getShoppingCategoryImageLocalService() {
		return shoppingCategoryImageLocalService;
	}

	/**
	 * Sets the shopping category image local service.
	 *
	 * @param shoppingCategoryImageLocalService the shopping category image local service
	 */
	public void setShoppingCategoryImageLocalService(
		ShoppingCategoryImageLocalService shoppingCategoryImageLocalService) {
		this.shoppingCategoryImageLocalService = shoppingCategoryImageLocalService;
	}

	/**
	 * Gets the shopping category image persistence.
	 *
	 * @return the shopping category image persistence
	 */
	public ShoppingCategoryImagePersistence getShoppingCategoryImagePersistence() {
		return shoppingCategoryImagePersistence;
	}

	/**
	 * Sets the shopping category image persistence.
	 *
	 * @param shoppingCategoryImagePersistence the shopping category image persistence
	 */
	public void setShoppingCategoryImagePersistence(
		ShoppingCategoryImagePersistence shoppingCategoryImagePersistence) {
		this.shoppingCategoryImagePersistence = shoppingCategoryImagePersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Gets the expando row local service.
	 *
	 * @return the expando row local service
	 */
	public ExpandoRowLocalService getExpandoRowLocalService() {
		return expandoRowLocalService;
	}

	/**
	 * Sets the expando row local service.
	 *
	 * @param expandoRowLocalService the expando row local service
	 */
	public void setExpandoRowLocalService(
		ExpandoRowLocalService expandoRowLocalService) {
		this.expandoRowLocalService = expandoRowLocalService;
	}

	/**
	 * Gets the expando row persistence.
	 *
	 * @return the expando row persistence
	 */
	public ExpandoRowPersistence getExpandoRowPersistence() {
		return expandoRowPersistence;
	}

	/**
	 * Sets the expando row persistence.
	 *
	 * @param expandoRowPersistence the expando row persistence
	 */
	public void setExpandoRowPersistence(
		ExpandoRowPersistence expandoRowPersistence) {
		this.expandoRowPersistence = expandoRowPersistence;
	}

	/**
	 * Gets the expando value local service.
	 *
	 * @return the expando value local service
	 */
	public ExpandoValueLocalService getExpandoValueLocalService() {
		return expandoValueLocalService;
	}

	/**
	 * Sets the expando value local service.
	 *
	 * @param expandoValueLocalService the expando value local service
	 */
	public void setExpandoValueLocalService(
		ExpandoValueLocalService expandoValueLocalService) {
		this.expandoValueLocalService = expandoValueLocalService;
	}

	/**
	 * Gets the expando value remote service.
	 *
	 * @return the expando value remote service
	 */
	public ExpandoValueService getExpandoValueService() {
		return expandoValueService;
	}

	/**
	 * Sets the expando value remote service.
	 *
	 * @param expandoValueService the expando value remote service
	 */
	public void setExpandoValueService(ExpandoValueService expandoValueService) {
		this.expandoValueService = expandoValueService;
	}

	/**
	 * Gets the expando value persistence.
	 *
	 * @return the expando value persistence
	 */
	public ExpandoValuePersistence getExpandoValuePersistence() {
		return expandoValuePersistence;
	}

	/**
	 * Sets the expando value persistence.
	 *
	 * @param expandoValuePersistence the expando value persistence
	 */
	public void setExpandoValuePersistence(
		ExpandoValuePersistence expandoValuePersistence) {
		this.expandoValuePersistence = expandoValuePersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = shoppingCategoryImagePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ShoppingCategoryImageLocalService.class)
	protected ShoppingCategoryImageLocalService shoppingCategoryImageLocalService;
	@BeanReference(type = ShoppingCategoryImagePersistence.class)
	protected ShoppingCategoryImagePersistence shoppingCategoryImagePersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = ExpandoRowLocalService.class)
	protected ExpandoRowLocalService expandoRowLocalService;
	@BeanReference(type = ExpandoRowPersistence.class)
	protected ExpandoRowPersistence expandoRowPersistence;
	@BeanReference(type = ExpandoValueLocalService.class)
	protected ExpandoValueLocalService expandoValueLocalService;
	@BeanReference(type = ExpandoValueService.class)
	protected ExpandoValueService expandoValueService;
	@BeanReference(type = ExpandoValuePersistence.class)
	protected ExpandoValuePersistence expandoValuePersistence;
}