package p8.test;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.plugins.ActionConfiguration;
import com.eviware.soapui.support.UISupport;
import com.eviware.soapui.support.action.support.AbstractSoapUIAction;


@ActionConfiguration(actionGroup = SoapUI.ENABLED_PROJECT_ACTIONS)
public class MyAction extends AbstractSoapUIAction<WsdlProject> {

    public MyAction() {
        super("My Action", "A plugin action at the project level");
    }

    public void perform(WsdlProject wsdlProject, Object o) {
        UISupport.showInfoMessage("Hello from [" + wsdlProject.getName() + "]!");
    }
}