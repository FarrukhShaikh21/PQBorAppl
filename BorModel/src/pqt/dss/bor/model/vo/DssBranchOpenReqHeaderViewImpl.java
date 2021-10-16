package pqt.dss.bor.model.vo;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;

import pqt.dss.bor.model.vo.common.DssBranchOpenReqHeaderView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 27 16:06:45 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssBranchOpenReqHeaderViewImpl extends ViewObjectImpl implements DssBranchOpenReqHeaderView {
    /**
     * This is the default constructor (do not remove).
     */
    public DssBranchOpenReqHeaderViewImpl() {
    }

    /**
     * Returns the variable value for NVC_wfDocumentId.
     * @return variable value for NVC_wfDocumentId
     */
    public Number getNVC_wfDocumentId() {
        return (Number) ensureVariableManager().getVariableValue("NVC_wfDocumentId");
    }

    /**
     * Sets <code>value</code> for variable NVC_wfDocumentId.
     * @param value value to bind as NVC_wfDocumentId
     */
    public void setNVC_wfDocumentId(Number value) {
        ensureVariableManager().setVariableValue("NVC_wfDocumentId", value);
        this.exeViewCrieteria(value);
    }
    public void exeViewCrieteria(Number val) {
        ViewObject vo = this.getViewObject();
        ViewCriteria vc = this.getViewCriteria("NotificationViewCriteria");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("NVC_wfDocumentId", val);
        vo.executeQuery();
    }

    /**
     * Returns the variable value for VC_Branch_Name.
     * @return variable value for VC_Branch_Name
     */
    public String getVC_Branch_Name() {
        return (String) ensureVariableManager().getVariableValue("VC_Branch_Name");
    }

    /**
     * Sets <code>value</code> for variable VC_Branch_Name.
     * @param value value to bind as VC_Branch_Name
     */
    public void setVC_Branch_Name(String value) {
        ensureVariableManager().setVariableValue("VC_Branch_Name", value);
    }

    /**
     * Returns the variable value for VC_Doc_No.
     * @return variable value for VC_Doc_No
     */
    public String getVC_Doc_No() {
        return (String) ensureVariableManager().getVariableValue("VC_Doc_No");
    }

    /**
     * Sets <code>value</code> for variable VC_Doc_No.
     * @param value value to bind as VC_Doc_No
     */
    public void setVC_Doc_No(String value) {
        ensureVariableManager().setVariableValue("VC_Doc_No", value);
    }

    public void borSearchUser()
              {
                        FacesContext fctx = FacesContext.getCurrentInstance();
                        ExternalContext ectx = fctx.getExternalContext();
                        HttpSession userSession = (HttpSession) ectx.getSession(false);
                        //userSession.setAttribute("SSV_UserDept", 3);
                        //userSession.setAttribute("pUserId",1139);
                        //userSession.setAttribute("SSV_UserType", "BO");
                        
                        ViewCriteria vc = this.getViewCriteria("DssBranchOpenReqHeaderViewCriteria");
                        this.applyViewCriteria(vc);
        
                        setWhereClause(null);
//                        FacesContext fctx = FacesContext.getCurrentInstance();
//                        ExternalContext ectx = fctx.getExternalContext();
//                        HttpSession userSession = (HttpSession) ectx.getSession(false);
                        Object VUserID = userSession.getAttribute("pUserId") == null ? "0" : userSession.getAttribute("pUserId");
                        setWhereClause("(exists\n" + 
                        " (select 1 \n" + 
                        "          from DSS_SM_USERS a\n" + 
                        "         where a.user_id_pk = "+ VUserID+"\n" + 
                        "           and a.GIS_LOCATION_ID_FK = QRSLT.GIS_LOCATION_ID_FK ) OR '"+userSession.getAttribute("SSV_UserType")+"'!= 'BO'"+") ");
                        System.out.println("getQuery>"+getQuery());        
                        System.out.println("getwhereclause"+getWhereClause());
              //              setWhereClause("USER_ID_FK =" + VUserID);
                        executeQuery();
                    }
}

