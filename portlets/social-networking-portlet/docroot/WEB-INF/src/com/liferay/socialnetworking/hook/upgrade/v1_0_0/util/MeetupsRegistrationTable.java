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

package com.liferay.socialnetworking.hook.upgrade.v1_0_0.util;

import java.sql.Types;

/**
 * @author Brian Wing Shun Chan
 */
public class MeetupsRegistrationTable {

	public static final String TABLE_NAME = "SN_MeetupsRegistration";

	public static final Object[][] TABLE_COLUMNS = {
		{"meetupsRegistrationId", new Integer(Types.BIGINT)},
		{"companyId", new Integer(Types.BIGINT)},
		{"userId", new Integer(Types.BIGINT)},
		{"userName", new Integer(Types.VARCHAR)},
		{"createDate", new Integer(Types.TIMESTAMP)},
		{"modifiedDate", new Integer(Types.TIMESTAMP)},
		{"meetupsEntryId", new Integer(Types.BIGINT)},
		{"status", new Integer(Types.INTEGER)},
		{"comments", new Integer(Types.VARCHAR)}
	};

	public static final String TABLE_SQL_CREATE = "create table SN_MeetupsRegistration (meetupsRegistrationId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,meetupsEntryId LONG,status INTEGER,comments STRING null)";

	public static final String TABLE_SQL_DROP = "drop table SN_MeetupsRegistration";

}