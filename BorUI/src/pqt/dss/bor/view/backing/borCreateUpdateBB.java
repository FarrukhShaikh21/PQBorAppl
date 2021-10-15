package pqt.dss.bor.view.backing;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

public class borCreateUpdateBB {
    public borCreateUpdateBB() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String PopulateCompanies() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("popCompanies");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
                    
 return null;
    }


    public String b4_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getResults");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String region_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Apply");
        DCBindingContainer dcBindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding compVO = (DCIteratorBinding)dcBindings.get("DssBranchOpenReqCompanyView2Iterator");
        DCIteratorBinding lineVO = (DCIteratorBinding)dcBindings.get("DssBranchOpenReqLineView1Iterator");
        DCIteratorBinding lineDtlVO = (DCIteratorBinding)dcBindings.get("DssBranchOpenReqLineDtlView1Iterator");
        DCIteratorBinding resultVO = (DCIteratorBinding)dcBindings.get("DssBrOpnReqDtlResultView1Iterator");
        {
          if(  compVO.getEstimatedRowCount() == 0 || lineVO.getEstimatedRowCount() == 0 || lineDtlVO.getEstimatedRowCount() == 0 || resultVO.getEstimatedRowCount() == 0)
          {
              FacesMessage  msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please fill the below details","");
                  FacesContext.getCurrentInstance().addMessage(null, msg);
          }else {

               operationBinding.execute();              }
                }
        
            return null;
        }
}
