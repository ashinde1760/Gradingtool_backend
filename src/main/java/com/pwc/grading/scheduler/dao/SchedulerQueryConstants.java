package com.pwc.grading.scheduler.dao;

public class SchedulerQueryConstants {

	public static final String DATA_BASE_PLACE_HOLDER = "#$DataBaseName#$";

	public static final String UPDATE_RATING_TYPE_DATA_SCHEDULER = "UPDATE #$DataBaseName#$.DBO.RatingType SET FIELDAUDITORID=?,AUDITDATE=?,AUDITSTATUS=?,ISAUDITCANCEL=? WHERE PROJECTID=? AND PARTNERID=? AND FORMID=? AND TCID=?";

	public static final String SELECT_RATING_TYPE_DATA_SCHEDULER_BY_PROJECTID_PARTNERID_FORMID_AND_TCID = "SELECT * FROM #$DataBaseName#$.DBO.RatingType WHERE PROJECTID=? AND PARTNERID=? AND FORMID=? AND TCID=?";

	public static final String UPDATE_SELF_ASSIG_IN_RATING_TYPE_DATA_SCHEDULER = "UPDATE #$DataBaseName#$.DBO.RatingType SET SELFASSISMENTSTATUS=? WHERE PROJECTID=? AND PARTNERID=? AND FORMID=? AND TCID=?";

	public static final String UPDATE_AUDIT_STATUS_IN_RATING_TYPE_DATA_SCHEDULER = "UPDATE #$DataBaseName#$.DBO.RatingType SET AUDITSTATUS=?,SECONDARYFIELDAUDITORNAME=? WHERE PROJECTID=? AND PARTNERID=? AND FORMID=? AND TCID=?";

	public static final String UPDATE_SELF_ASSIG_IN_GRADING_TYPE_DATA_SCHEDULER = "UPDATE #$DataBaseName#$.DBO.GradingType SET SELFASSISMENTSTATUS=? WHERE PROJECTID=? AND PARTNERID=? AND FORMID=?";

	public static final String UPDATE_AUDIT_STATUS_IN_GRADING_TYPE_DATA_SCHEDULER = "UPDATE #$DataBaseName#$.DBO.GradingType SET AUDITSTATUS=?,SECONDARYFIELDAUDITORNAME=? WHERE PROJECTID=? AND PARTNERID=? AND FORMID=?";

	public static final String UPDATE_GRADING_TYPE_DATA_SCHEDULER = "UPDATE #$DataBaseName#$.DBO.GradingType SET FIELDAUDITORID=?,AUDITDATE=?,AUDITSTATUS=?,ISAUDITCANCEL=? WHERE PROJECTID=? AND PARTNERID=? AND FORMID=?";

	public static final String INSERT_GRADING_TYPE_DATA = "INSERT INTO #$DataBaseName#$.DBO.GradingType VALUES(?,?,?,?,?,?,?,?,?)";

	public static final String DELETE_GRADING_TYPE_DATA = "DELETE #$DataBaseName#$.DBO.GradingType WHERE PROJECTID=? AND PARTNERID=?";

	public static final String INSERT_REPORTING_TYPE_DATA = "INSERT INTO #$DataBaseName#$.DBO.RatingType VALUES(?,?,?,?,?,?,?,?,?,?)";

	public static final String SELECT_GRADING_TYPE_DATA_BY_PROJECT_ID = "SELECT * FROM #$DataBaseName#$.DBO.GradingType WHERE PROJECTID=?";

	public static final String SELECT_GRADING_TYPE_DATA_BY_PARTNER_ID_AND_PROJECT_ID = "SELECT * FROM #$DataBaseName#$.DBO.GradingType WHERE PARTNERID=? AND PROJECTID=?";

	public static final String SELECT_GRADING_TYPE_DATA = "SELECT * FROM #$DataBaseName#$.DBO.GradingType";

	public static final String SELECT_GRADING_TYPE_DATA_BY_PARTNER_ID_PROJECT_ID_AND_FORM_ID = "SELECT * FROM #$DataBaseName#$.DBO.GradingType WHERE PARTNERID=? AND PROJECTID=? AND FORMID=?";

	public static final String SELECT_RATING_TYPE_DATA_BY_PROJECT_ID = "SELECT * FROM #$DataBaseName#$.DBO.RatingType WHERE PROJECTID=?";

	public static final String SELECT_RATING_TYPE_DATA = "SELECT * FROM #$DataBaseName#$.DBO.RatingType";

	public static final String DELETE_RATING_TYPE_DATA = "DELETE #$DataBaseName#$.DBO.RatingType WHERE FORMID=?";

	public static final String DELETE_RATING_TYPE_DATA_BY_TCID_AND_PROJECTID = "DELETE #$DataBaseName#$.DBO.RatingType WHERE TCID=? AND PROJECTID=?";
	public static final String DELETE_RATING_TYPE_DATA_BY_TCID_PARTNER_ID_AND_PROJECTID = "DELETE #$DataBaseName#$.DBO.RatingType WHERE TCID=? AND PROJECTID=? AND PARTNERID=?";

	public static final String DELETE_GRADING_TYPE_DATA_BY_FORM_ID = "DELETE #$DataBaseName#$.DBO.GradingType WHERE FORMID=?";

	public static final String SELECT_GRADING_TYPE_DATA_BY_FIELD_AUDITOR_ID = "SELECT * FROM #$DataBaseName#$.DBO.GradingType WHERE FIELDAUDITORID=?";

	public static final String SELECT_GRADING_TYPE_DATA_BY_FIELD_AUDITOR_ID_PROJECT_ID_AND_PARTNER_ID = "SELECT * FROM #$DataBaseName#$.DBO.GradingType WHERE FIELDAUDITORID=? AND PROJECTID=? AND PARTNERID=?";

	public static final String SELECT_DISTINCT_PARTNER_ID_FROM_RATING_TYPE_DATA_BY_FIELD_AUDITOR_ID_AND_PROJECT_ID = "SELECT DISTINCT PARTNERID FROM #$DataBaseName#$.DBO.RatingType WHERE FIELDAUDITORID=? AND PROJECTID=?";

	public static final String SELECT_DISTINCT_PARTNER_ID_FROM_GRADING_TYPE_DATA_BY_FIELD_AUDITOR_ID_AND_PROJECT_ID = "SELECT DISTINCT PARTNERID FROM #$DataBaseName#$.DBO.GradingType WHERE FIELDAUDITORID=? AND PROJECTID=?";

	public static final String SELECT_RATING_TYPE_DATA_BY_FIELD_AUDITOR_ID_PARTNER_ID_AND_PROJECT_ID = "SELECT * FROM #$DataBaseName#$.DBO.RatingType WHERE FIELDAUDITORID=? AND PROJECTID=? AND PARTNERID=? ";

	public static final String SELECT_DISTINCT_RATING_TYPE_DATA_BY_FIELD_AUDITOR_ID = "SELECT DISTINCT PROJECTID FROM #$DataBaseName#$.DBO.RatingType WHERE FIELDAUDITORID=?";

	public static final String SELECT_DISTINCT_GRADING_TYPE_DATA_BY_FIELD_AUDITOR_ID = "SELECT DISTINCT PROJECTID FROM #$DataBaseName#$.DBO.GradingType WHERE FIELDAUDITORID=?";

	public static final String SELECT_RATING_TYPE_DATA_BY_FIELD_AUDITOR_ID = "SELECT * FROM #$DataBaseName#$.DBO.RatingType WHERE FIELDAUDITORID=?";

	// ************************** For Report Generation ****************************

	public static final String SELECT_RATING_TYPE_DATA_SCHEDULER_BY_PROJECTID_PARTNERID_AND_TCID = "SELECT * FROM #$DataBaseName#$.DBO.RatingType WHERE PROJECTID=? AND PARTNERID=? AND TCID=?";

	public static final String SELECT_RATING_TYPE_DATA_SCHEDULER_BY_PROJECTID_AND_PARTNERID = "SELECT * FROM #$DataBaseName#$.DBO.RatingType WHERE PROJECTID=? AND PARTNERID=?";

}
