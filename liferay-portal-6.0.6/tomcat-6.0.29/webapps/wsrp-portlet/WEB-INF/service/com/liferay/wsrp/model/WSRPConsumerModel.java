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

package com.liferay.wsrp.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WSRPConsumer service. Represents a row in the &quot;WSRP_WSRPConsumer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.wsrp.model.impl.WSRPConsumerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.wsrp.model.impl.WSRPConsumerImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a w s r p consumer model instance should use the {@link WSRPConsumer} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WSRPConsumer
 * @see com.liferay.wsrp.model.impl.WSRPConsumerImpl
 * @see com.liferay.wsrp.model.impl.WSRPConsumerModelImpl
 * @generated
 */
public interface WSRPConsumerModel extends BaseModel<WSRPConsumer> {
	/**
	 * Gets the primary key of this w s r p consumer.
	 *
	 * @return the primary key of this w s r p consumer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this w s r p consumer
	 *
	 * @param pk the primary key of this w s r p consumer
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the wsrp consumer id of this w s r p consumer.
	 *
	 * @return the wsrp consumer id of this w s r p consumer
	 */
	public long getWsrpConsumerId();

	/**
	 * Sets the wsrp consumer id of this w s r p consumer.
	 *
	 * @param wsrpConsumerId the wsrp consumer id of this w s r p consumer
	 */
	public void setWsrpConsumerId(long wsrpConsumerId);

	/**
	 * Gets the company id of this w s r p consumer.
	 *
	 * @return the company id of this w s r p consumer
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this w s r p consumer.
	 *
	 * @param companyId the company id of this w s r p consumer
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the create date of this w s r p consumer.
	 *
	 * @return the create date of this w s r p consumer
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this w s r p consumer.
	 *
	 * @param createDate the create date of this w s r p consumer
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this w s r p consumer.
	 *
	 * @return the modified date of this w s r p consumer
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this w s r p consumer.
	 *
	 * @param modifiedDate the modified date of this w s r p consumer
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the name of this w s r p consumer.
	 *
	 * @return the name of this w s r p consumer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this w s r p consumer.
	 *
	 * @param name the name of this w s r p consumer
	 */
	public void setName(String name);

	/**
	 * Gets the url of this w s r p consumer.
	 *
	 * @return the url of this w s r p consumer
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this w s r p consumer.
	 *
	 * @param url the url of this w s r p consumer
	 */
	public void setUrl(String url);

	/**
	 * Gets the wsdl of this w s r p consumer.
	 *
	 * @return the wsdl of this w s r p consumer
	 */
	@AutoEscape
	public String getWsdl();

	/**
	 * Sets the wsdl of this w s r p consumer.
	 *
	 * @param wsdl the wsdl of this w s r p consumer
	 */
	public void setWsdl(String wsdl);

	/**
	 * Gets the registration context string of this w s r p consumer.
	 *
	 * @return the registration context string of this w s r p consumer
	 */
	@AutoEscape
	public String getRegistrationContextString();

	/**
	 * Sets the registration context string of this w s r p consumer.
	 *
	 * @param registrationContextString the registration context string of this w s r p consumer
	 */
	public void setRegistrationContextString(String registrationContextString);

	/**
	 * Gets the registration properties string of this w s r p consumer.
	 *
	 * @return the registration properties string of this w s r p consumer
	 */
	@AutoEscape
	public String getRegistrationPropertiesString();

	/**
	 * Sets the registration properties string of this w s r p consumer.
	 *
	 * @param registrationPropertiesString the registration properties string of this w s r p consumer
	 */
	public void setRegistrationPropertiesString(
		String registrationPropertiesString);

	/**
	 * Gets a copy of this w s r p consumer as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public WSRPConsumer toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(WSRPConsumer wsrpConsumer);

	public int hashCode();

	public String toString();

	public String toXmlString();
}