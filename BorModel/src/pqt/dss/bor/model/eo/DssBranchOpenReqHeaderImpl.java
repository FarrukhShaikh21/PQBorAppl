package pqt.dss.bor.model.eo;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Types;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 16 19:14:45 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssBranchOpenReqHeaderImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BranchOpenReqIdPk,
        BranchName,
        BranchAddress,
        EffectiveFrom,
        NearPqtBranch,
        BranchManagerName,
        BranchOffic,
        UserIdFk,
        EnterDate,
        LastUpdatedBy,
        LastUpdatedDate,
        BranchStatus,
        DssStatus,
        BranchNotifIdFk,
        DssNotifIdFk,
        RegionName,
        SubBranch,
        Branch,
        PettyCashRequired,
        AgentNoFk,
        BorDocNo,
        BranchCodeFk,
        WorkflowNotificationId,
        WorkflowStatus,
        GisLocationIdFk,
        DssBranchOpenReqCompany,
        DssBranchOpenReqLine,
        DssBranchOpenReqLineDtl,
        DssBrOpnReqDtlResult,
        DssBranchOpenReqDept;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int BRANCHOPENREQIDPK = AttributesEnum.BranchOpenReqIdPk.index();
    public static final int BRANCHNAME = AttributesEnum.BranchName.index();
    public static final int BRANCHADDRESS = AttributesEnum.BranchAddress.index();
    public static final int EFFECTIVEFROM = AttributesEnum.EffectiveFrom.index();
    public static final int NEARPQTBRANCH = AttributesEnum.NearPqtBranch.index();
    public static final int BRANCHMANAGERNAME = AttributesEnum.BranchManagerName.index();
    public static final int BRANCHOFFIC = AttributesEnum.BranchOffic.index();
    public static final int USERIDFK = AttributesEnum.UserIdFk.index();
    public static final int ENTERDATE = AttributesEnum.EnterDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int BRANCHSTATUS = AttributesEnum.BranchStatus.index();
    public static final int DSSSTATUS = AttributesEnum.DssStatus.index();
    public static final int BRANCHNOTIFIDFK = AttributesEnum.BranchNotifIdFk.index();
    public static final int DSSNOTIFIDFK = AttributesEnum.DssNotifIdFk.index();
    public static final int REGIONNAME = AttributesEnum.RegionName.index();
    public static final int SUBBRANCH = AttributesEnum.SubBranch.index();
    public static final int BRANCH = AttributesEnum.Branch.index();
    public static final int PETTYCASHREQUIRED = AttributesEnum.PettyCashRequired.index();
    public static final int AGENTNOFK = AttributesEnum.AgentNoFk.index();
    public static final int BORDOCNO = AttributesEnum.BorDocNo.index();
    public static final int BRANCHCODEFK = AttributesEnum.BranchCodeFk.index();
    public static final int WORKFLOWNOTIFICATIONID = AttributesEnum.WorkflowNotificationId.index();
    public static final int WORKFLOWSTATUS = AttributesEnum.WorkflowStatus.index();
    public static final int GISLOCATIONIDFK = AttributesEnum.GisLocationIdFk.index();
    public static final int DSSBRANCHOPENREQCOMPANY = AttributesEnum.DssBranchOpenReqCompany.index();
    public static final int DSSBRANCHOPENREQLINE = AttributesEnum.DssBranchOpenReqLine.index();
    public static final int DSSBRANCHOPENREQLINEDTL = AttributesEnum.DssBranchOpenReqLineDtl.index();
    public static final int DSSBROPNREQDTLRESULT = AttributesEnum.DssBrOpnReqDtlResult.index();
    public static final int DSSBRANCHOPENREQDEPT = AttributesEnum.DssBranchOpenReqDept.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DssBranchOpenReqHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pqt.dss.bor.model.eo.DssBranchOpenReqHeader");
    }


    /**
     * Gets the attribute value for BranchOpenReqIdPk, using the alias name BranchOpenReqIdPk.
     * @return the value of BranchOpenReqIdPk
     */
    public Number getBranchOpenReqIdPk() {
        return (Number) getAttributeInternal(BRANCHOPENREQIDPK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchOpenReqIdPk.
     * @param value value to set the BranchOpenReqIdPk
     */
    public void setBranchOpenReqIdPk(Number value) {
        setAttributeInternal(BRANCHOPENREQIDPK, value);
    }

    /**
     * Gets the attribute value for BranchName, using the alias name BranchName.
     * @return the value of BranchName
     */
    public String getBranchName() {
        return (String) getAttributeInternal(BRANCHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchName.
     * @param value value to set the BranchName
     */
    public void setBranchName(String value) {
        setAttributeInternal(BRANCHNAME, value);
    }

    /**
     * Gets the attribute value for BranchAddress, using the alias name BranchAddress.
     * @return the value of BranchAddress
     */
    public String getBranchAddress() {
        return (String) getAttributeInternal(BRANCHADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchAddress.
     * @param value value to set the BranchAddress
     */
    public void setBranchAddress(String value) {
        setAttributeInternal(BRANCHADDRESS, value);
    }

    /**
     * Gets the attribute value for EffectiveFrom, using the alias name EffectiveFrom.
     * @return the value of EffectiveFrom
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFrom.
     * @param value value to set the EffectiveFrom
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for NearPqtBranch, using the alias name NearPqtBranch.
     * @return the value of NearPqtBranch
     */
    public String getNearPqtBranch() {
        return (String) getAttributeInternal(NEARPQTBRANCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for NearPqtBranch.
     * @param value value to set the NearPqtBranch
     */
    public void setNearPqtBranch(String value) {
        setAttributeInternal(NEARPQTBRANCH, value);
    }

    /**
     * Gets the attribute value for BranchManagerName, using the alias name BranchManagerName.
     * @return the value of BranchManagerName
     */
    public String getBranchManagerName() {
        return (String) getAttributeInternal(BRANCHMANAGERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchManagerName.
     * @param value value to set the BranchManagerName
     */
    public void setBranchManagerName(String value) {
        setAttributeInternal(BRANCHMANAGERNAME, value);
    }

    /**
     * Gets the attribute value for BranchOffic, using the alias name BranchOffic.
     * @return the value of BranchOffic
     */
    public String getBranchOffic() {
        return (String) getAttributeInternal(BRANCHOFFIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchOffic.
     * @param value value to set the BranchOffic
     */
    public void setBranchOffic(String value) {
        setAttributeInternal(BRANCHOFFIC, value);
    }

    /**
     * Gets the attribute value for UserIdFk, using the alias name UserIdFk.
     * @return the value of UserIdFk
     */
    public Number getUserIdFk() {
        return (Number) getAttributeInternal(USERIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserIdFk.
     * @param value value to set the UserIdFk
     */
    public void setUserIdFk(Number value) {
        setAttributeInternal(USERIDFK, value);
    }

    /**
     * Gets the attribute value for EnterDate, using the alias name EnterDate.
     * @return the value of EnterDate
     */
    public Date getEnterDate() {
        return (Date) getAttributeInternal(ENTERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnterDate.
     * @param value value to set the EnterDate
     */
    public void setEnterDate(Date value) {
        setAttributeInternal(ENTERDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for BranchStatus, using the alias name BranchStatus.
     * @return the value of BranchStatus
     */
    public String getBranchStatus() {
        return (String) getAttributeInternal(BRANCHSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchStatus.
     * @param value value to set the BranchStatus
     */
    public void setBranchStatus(String value) {
        setAttributeInternal(BRANCHSTATUS, value);
    }

    /**
     * Gets the attribute value for DssStatus, using the alias name DssStatus.
     * @return the value of DssStatus
     */
    public String getDssStatus() {
        return (String) getAttributeInternal(DSSSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssStatus.
     * @param value value to set the DssStatus
     */
    public void setDssStatus(String value) {
        setAttributeInternal(DSSSTATUS, value);
    }

    /**
     * Gets the attribute value for BranchNotifIdFk, using the alias name BranchNotifIdFk.
     * @return the value of BranchNotifIdFk
     */
    public Number getBranchNotifIdFk() {
        return (Number) getAttributeInternal(BRANCHNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchNotifIdFk.
     * @param value value to set the BranchNotifIdFk
     */
    public void setBranchNotifIdFk(Number value) {
        setAttributeInternal(BRANCHNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for DssNotifIdFk, using the alias name DssNotifIdFk.
     * @return the value of DssNotifIdFk
     */
    public Number getDssNotifIdFk() {
        return (Number) getAttributeInternal(DSSNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssNotifIdFk.
     * @param value value to set the DssNotifIdFk
     */
    public void setDssNotifIdFk(Number value) {
        setAttributeInternal(DSSNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for RegionName, using the alias name RegionName.
     * @return the value of RegionName
     */
    public String getRegionName() {
        return (String) getAttributeInternal(REGIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegionName.
     * @param value value to set the RegionName
     */
    public void setRegionName(String value) {
        setAttributeInternal(REGIONNAME, value);
    }

    /**
     * Gets the attribute value for SubBranch, using the alias name SubBranch.
     * @return the value of SubBranch
     */
    public String getSubBranch() {
        return (String) getAttributeInternal(SUBBRANCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubBranch.
     * @param value value to set the SubBranch
     */
    public void setSubBranch(String value) {
        setAttributeInternal(SUBBRANCH, value);
    }

    /**
     * Gets the attribute value for Branch, using the alias name Branch.
     * @return the value of Branch
     */
    public String getBranch() {
        return (String) getAttributeInternal(BRANCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for Branch.
     * @param value value to set the Branch
     */
    public void setBranch(String value) {
        setAttributeInternal(BRANCH, value);
    }

    /**
     * Gets the attribute value for PettyCashRequired, using the alias name PettyCashRequired.
     * @return the value of PettyCashRequired
     */
    public Number getPettyCashRequired() {
        return (Number) getAttributeInternal(PETTYCASHREQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for PettyCashRequired.
     * @param value value to set the PettyCashRequired
     */
    public void setPettyCashRequired(Number value) {
        setAttributeInternal(PETTYCASHREQUIRED, value);
    }

    /**
     * Gets the attribute value for AgentNoFk, using the alias name AgentNoFk.
     * @return the value of AgentNoFk
     */
    public Number getAgentNoFk() {
        return (Number) getAttributeInternal(AGENTNOFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for AgentNoFk.
     * @param value value to set the AgentNoFk
     */
    public void setAgentNoFk(Number value) {
        setAttributeInternal(AGENTNOFK, value);
    }

    /**
     * Gets the attribute value for BorDocNo, using the alias name BorDocNo.
     * @return the value of BorDocNo
     */
    public String getBorDocNo() {
        return (String) getAttributeInternal(BORDOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BorDocNo.
     * @param value value to set the BorDocNo
     */
    public void setBorDocNo(String value) {
        setAttributeInternal(BORDOCNO, value);
    }

    /**
     * Gets the attribute value for BranchCodeFk, using the alias name BranchCodeFk.
     * @return the value of BranchCodeFk
     */
    public String getBranchCodeFk() {
        return (String) getAttributeInternal(BRANCHCODEFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchCodeFk.
     * @param value value to set the BranchCodeFk
     */
    public void setBranchCodeFk(String value) {
        setAttributeInternal(BRANCHCODEFK, value);
    }

    /**
     * Gets the attribute value for WorkflowNotificationId, using the alias name WorkflowNotificationId.
     * @return the value of WorkflowNotificationId
     */
    public Number getWorkflowNotificationId() {
        return (Number) getAttributeInternal(WORKFLOWNOTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowNotificationId.
     * @param value value to set the WorkflowNotificationId
     */
    public void setWorkflowNotificationId(Number value) {
        setAttributeInternal(WORKFLOWNOTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for WorkflowStatus, using the alias name WorkflowStatus.
     * @return the value of WorkflowStatus
     */
    public String getWorkflowStatus() {
        return (String) getAttributeInternal(WORKFLOWSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowStatus.
     * @param value value to set the WorkflowStatus
     */
    public void setWorkflowStatus(String value) {
        setAttributeInternal(WORKFLOWSTATUS, value);
    }

    /**
     * Gets the attribute value for GisLocationIdFk, using the alias name GisLocationIdFk.
     * @return the value of GisLocationIdFk
     */
    public Number getGisLocationIdFk() {
        return (Number) getAttributeInternal(GISLOCATIONIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for GisLocationIdFk.
     * @param value value to set the GisLocationIdFk
     */
    public void setGisLocationIdFk(Number value) {
        setAttributeInternal(GISLOCATIONIDFK, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssBranchOpenReqCompany() {
        return (RowIterator) getAttributeInternal(DSSBRANCHOPENREQCOMPANY);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssBranchOpenReqLine() {
        return (RowIterator) getAttributeInternal(DSSBRANCHOPENREQLINE);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssBranchOpenReqLineDtl() {
        return (RowIterator) getAttributeInternal(DSSBRANCHOPENREQLINEDTL);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssBrOpnReqDtlResult() {
        return (RowIterator) getAttributeInternal(DSSBROPNREQDTLRESULT);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssBranchOpenReqDept() {
        return (RowIterator) getAttributeInternal(DSSBRANCHOPENREQDEPT);
    }


    /**
     * @param branchOpenReqIdPk key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number branchOpenReqIdPk) {
        return new Key(new Object[] { branchOpenReqIdPk });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
      protected void create(AttributeList attributeList) {
          super.create(attributeList);
          Date currentDate = new Date();
          setEnterDate((Date) currentDate.getCurrentDate());
          setLastUpdatedDate((Date) currentDate.getCurrentDate());
          SequenceImpl seq = new SequenceImpl("dss_branch_open_req_header_seq", getDBTransaction());
          setBranchOpenReqIdPk(seq.getSequenceNumber());
          
//          setBranchStatus("INCOMPLETE");
//          setDssStatus("INCOMPLETE");
          
          FacesContext fctx = FacesContext.getCurrentInstance();
          ExternalContext ectx = fctx.getExternalContext();
          HttpSession userSession = (HttpSession) ectx.getSession(false);
          try {
              setUserIdFk(new Number(userSession.getAttribute("pUserId")));
              setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
          } catch (SQLException ex) {
              setUserIdFk(new Number(0));
              setLastUpdatedBy(new Number(0));
          }
      }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT) {
            DBTransaction txn = getDBTransaction();
            CallableStatement callableStatement =
                txn.createCallableStatement("begin ? := dss_all_pkg.GET_BOR_NUMBER; end;", DBTransaction.DEFAULT);
            try {
                callableStatement.registerOutParameter(1, Types.VARCHAR);
                callableStatement.executeUpdate();
                String vBorNumber = callableStatement.getString(1);
                callableStatement.close();
                setBorDocNo(vBorNumber);
            } catch (SQLException sqle) {
                try {
                    callableStatement.close();
                } catch (SQLException f) {
                }
            }
        }
        Date currentDate = new Date();
        if (operation == DML_UPDATE) {
            setLastUpdatedDate((Date) currentDate.getCurrentDate());
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExternalContext ectx = fctx.getExternalContext();
            HttpSession userSession = (HttpSession) ectx.getSession(false);
            try {
                setUserIdFk(new Number(userSession.getAttribute("pUserId")));
                setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
            } catch (SQLException ex) {
                setUserIdFk(new Number(0));
                setLastUpdatedBy(new Number(0));
            }
        }
        super.doDML(operation, e);
    }
}

