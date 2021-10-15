package pqt.dss.bor.model.am.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 16 19:46:03 PKT 2016
// ---------------------------------------------------------------------
public interface BorAM extends ApplicationModule {
    void Apply();


    void Rollback();

    void DeleteCommit();

    void popCompanies();

    void getResults();

    void DssApprove();

    void callWorkflow(oracle.jbo.domain.Number p_document_id, String ApprovalType);

    void callBORWorkflow(oracle.jbo.domain.Number p_document_id);

    void setUserSession();
}
