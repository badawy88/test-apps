package com;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends StrutsAction {

    public ActionForward executeAction(ActionMapping mapping,ActionForm form,
                                 HttpServletRequest request,HttpServletResponse response)
            {


        return mapping.findForward("success");

    }

}
