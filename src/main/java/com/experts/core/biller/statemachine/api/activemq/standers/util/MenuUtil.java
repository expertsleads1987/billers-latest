package com.experts.core.biller.statemachine.api.activemq.standers.util;

/*import com.acme.disttrans.webapp.dto.BipPage;
import com.acme.disttrans.webapp.dto.MenuItemState;
import com.acme.disttrans.webapp.dto.MenuItemWrapper;*/
import com.experts.core.biller.statemachine.api.activemq.standers.dto.BipPage;
import com.experts.core.biller.statemachine.api.activemq.standers.dto.MenuItemState;
import com.experts.core.biller.statemachine.api.activemq.standers.dto.MenuItemWrapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by morak on 3/12/17.
 */

@Component
public class MenuUtil {

    public MenuItemWrapper provideAdminMenuAsTree() {
        // admin parent
        MenuItemWrapper adminParent = new MenuItemWrapper();
        adminParent.setActive(true);
        adminParent.setId(1L);
        adminParent.setReadable(true);
        adminParent.setText("Admin_Parent");
        adminParent.setIconClass("icon-user");

        MenuItemState state = new MenuItemState();
        state.setDisabled(false);
        state.setOpened(true);
        state.setSelected(false);

        adminParent.setState(state);
        List<MenuItemWrapper> childrenOfAdminList = new ArrayList<>();
        adminParent.setChildren(childrenOfAdminList);

        // ekran tanimlama
        MenuItemWrapper controlPanelMenuItem = new MenuItemWrapper();
        controlPanelMenuItem.setActive(true);
        controlPanelMenuItem.setId(2L);
        controlPanelMenuItem.setReadable(true);
        controlPanelMenuItem.setText("Control Panel");
        controlPanelMenuItem.setState(state);
        controlPanelMenuItem.setIconClass("icon-wrench");

        BipPage page = new BipPage();
        page.setPageUrl("controlpanel");
        controlPanelMenuItem.setBipPage(page);

        childrenOfAdminList.add(controlPanelMenuItem);

        return adminParent;
    }

    public MenuItemWrapper provideBoardMenuAsTree() {
        // admin parent
        MenuItemWrapper boardParent = new MenuItemWrapper();
        boardParent.setActive(true);
        boardParent.setId(4L);
        boardParent.setReadable(true);
        boardParent.setText("Board_Parent");

        MenuItemState state = new MenuItemState();
        state.setDisabled(false);
        state.setOpened(false);
        state.setSelected(false);

        boardParent.setState(state);
        List<MenuItemWrapper> childrenOfBoardList = new ArrayList<>();
        boardParent.setChildren(childrenOfBoardList);

        // ekran tanimlama
        MenuItemWrapper dashboardMenuItem = new MenuItemWrapper();
        dashboardMenuItem.setActive(true);
        dashboardMenuItem.setId(5L);
        dashboardMenuItem.setReadable(true);
        dashboardMenuItem.setText("Dashboard");
        dashboardMenuItem.setState(state);

        BipPage page = new BipPage();
        page.setPageUrl("dashboard");
        dashboardMenuItem.setBipPage(page);

        childrenOfBoardList.add(dashboardMenuItem);
        return boardParent;
    }

}
