package com.experts.core.biller.statemachine.api.activemq.standers.config;

/*import com.acme.disttrans.webapp.util.MenuUtil;*/
import com.experts.core.biller.statemachine.api.activemq.standers.util.MenuUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class CommonWebRequestDataInterceptor implements WebRequestInterceptor {

   /* @Autowired
    private BuildInfoHolder buildInfoHolder;*/

    @Autowired
    private MenuUtil menuUtil;

    @Override
    public void preHandle(WebRequest request) throws Exception {
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        if (model != null) {

            model.addAttribute("adminMenuAsTree", menuUtil.provideAdminMenuAsTree());
            model.addAttribute("boardMenuAsTree", menuUtil.provideBoardMenuAsTree());
        }
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
    }

}
